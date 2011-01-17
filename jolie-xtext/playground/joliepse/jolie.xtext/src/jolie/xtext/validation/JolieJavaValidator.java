package jolie.xtext.validation;

import jolie.xtext.jolie.Embedded;
import jolie.xtext.jolie.Include;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.OutputPortCall;

import jolie.xtext.jolie.VariablePath;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.validation.Check;
import com.google.inject.Inject;


public class JolieJavaValidator extends AbstractJolieJavaValidator {
	
	@Inject
	private IResourceDescriptions descriptions; 

	public static final String PREFIXED_WITHOUT_WITH_BLOCK = "jolie.xtext.jolie.PrefixedWithoutWithBlock";
	@Check
	public void checkInEmbedded(Embedded embedded) {
		
		for (int i = 0; i < embedded.getIn().size(); i++) {
			if (!embedded.getIn().get(i).equals("in"))
				error("Required: in", JoliePackage.EMBEDDED__IN);
		}
		
	}
	
	@Check
	public void checkPrefixedVariableinWith(VariablePath variablePath) {
		boolean flag=false;
		
		for (int i = 0; i < variablePath.getName().size(); i++) {
			System.out.println(variablePath.getName().toString());
			 
			if(variablePath.getDot().size()==1) {
				
				
				EObject container = variablePath.eContainer();	
				
			
					while (!(container instanceof jolie.xtext.jolie.impl.ProgramImpl)) {
                       	
						container = container.eContainer();
						if (container instanceof jolie.xtext.jolie.impl.WithImpl)  flag=true ;
						if (container instanceof jolie.xtext.jolie.impl.ProtocolConfigurationImpl) flag=true ;
						System.out.println(container.toString());
						//error("Variable cannot start with A", variablePath, JoliePackage.VARIABLE_PATH__NAME);
					}
					
				if (flag==false) 
					//Uso questo per far funzionare il quik fix provider
					error("Prefixed variable paths must be inside a with blockkk", JoliePackage.VARIABLE_PATH__NAME, PREFIXED_WITHOUT_WITH_BLOCK, "name");
				 
			}
		}
	}
	
	@Check
	public void checkOutputPortCall(OutputPortCall outputPortCall) {
		
		System.out.println("CONTAINER DELL OUTPUT CALL"+outputPortCall.eContainer().toString());
		System.out.println("CONTAINER DELL OUTPUT CALL"+outputPortCall.eContainer().eContainer().toString());
	}
	

	

	//COPIATO da
	/*@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class, org.eclipse.xtext.validation.NamesAreUniqueValidator.class})
	public class AbstractJolieJavaValidator extends AbstractDeclarativeValidator 
	...
		composedCheck = "org.eclipse.xtext.validation.ImportUriValidator"
	
	*/
	@Check
	public void checkImportUri(Include include) {
		
	
		String importURI = include.getImportURI();
		
		//Check if the current file is an iol, in this case you cannot import nothing (Parser bug?)
		// if(include.eResource().getURI().toString().endsWith(".iol")) error("You cannot use include in a .iol file", JoliePackage.INCLUDE__IMPORT_URI);
		
		if (importURI != null && !EcoreUtil2.isValidUri(include, URI.createURI(importURI))) {
			
			//Chek if the included file is in the library project called "JolieIncludedLibraries", this project must be always in workspace
			boolean flag=false;
			Iterable<IResourceDescription> allResourceDescriptions = descriptions.getAllResourceDescriptions();
		    for (IResourceDescription description : allResourceDescriptions) {
		    	
		    	if(description.getURI().lastSegment().equals(importURI)&&description.getURI().toString().contains("JolieIncludedLibraries")) flag=true;
		    }
			
			if (flag==false) error("Imported resource could not be found.", JoliePackage.INCLUDE__IMPORT_URI);
		}
	}

	//TO DO: WARNING SUI FILE IOL, NON SI DOVREBBE POTER INCLUDERE FILE

}
