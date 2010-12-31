package jolie.xtext.validation;

import jolie.xtext.jolie.Embedded;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.VariablePath;
import jolie.xtext.jolie.With;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;


public class JolieJavaValidator extends AbstractJolieJavaValidator {
	//	@Check
	//	public void checkGreetingStartsWithCapital(Greeting greeting) {
	//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	//			warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
	//		}
	//	}

	/*@Check
	public void checkNameLength(With with) {
		if(with.getName() != null && with.getName().length() > 5)
			error("Name too longooooooo", with, JoliePackage.WITH__NAME);


	} */
	public static final String PREFIXED_WITHOUT_WITH_BLOCK = "jolie.xtext.jolie.PrefixedWithoutWithBlock";
	@Check
	public void checkInEmbedded(Embedded embedded) {
		
		for (int i = 0; i < embedded.getIn().size(); i++) {
			if (!embedded.getIn().get(i).equals("in"))
				error("Requirede: in", JoliePackage.EMBEDDED__IN);
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
					System.out.println(flag);
				if (flag==false) 
					error("Prefixed variable paths must be inside a with blockkk", JoliePackage.VARIABLE_PATH__NAME, PREFIXED_WITHOUT_WITH_BLOCK, "name");
				//	error("Prefixed variable paths must be inside a with block", variablePath, JoliePackage.VARIABLE_PATH__NAME);
			   
			}
		}
	}
	
	
	//To do: check for the cardinality of sub types (>0)

}
