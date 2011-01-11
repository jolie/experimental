package jolie.xtext.ui.navigation;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jolie.xtext.jolie.FileName;
import jolie.xtext.jolie.Include;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Type;



import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.common.types.xtext.ui.JdtHyperlink;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;


import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.util.TextLocation;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.internal.Maps;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.common.types.xtext.ui.JdtHyperlink;
//import com.google.inject.Inject;


public class JolieHyperlinkHelper extends HyperlinkHelper{

	//private static final Logger logger = Logger.getLogger(JolieHyperlinkHelper.class);

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private Provider<JdtHyperlink> jdtHyperlinkProvider;


	@Inject
	private IResourceDescriptions descriptions; 

	private Map<URI, IResourceDescription> uriToDescription; 


	@Inject 
	private IURIEditorOpener uriEditorOpener;
	
	
	public void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {

		super.createHyperlinksByOffset(resource, offset, acceptor);
		TextLocation loc = new TextLocation();
		EObject eObject = EObjectAtOffsetHelper.resolveElementAt(resource, offset, loc);


		eObject = EObjectAtOffsetHelper.resolveElementAt(resource, offset, loc);


		if (eObject instanceof Include) { 


			System.out.println("SONO NELL?HYPERLINKR?????????????????????????????????????????");

			System.out.println(descriptions.getAllResourceDescriptions().toString());

			Iterable<IResourceDescription> allResourceDescriptions = descriptions.getAllResourceDescriptions();
			for (IResourceDescription description : allResourceDescriptions) {

				//L'uri
				System.out.println(description.getURI().toString());  

				//Il nome del file
				Include include = (Include) eObject;	

				System.out.println(include.getImportURI().toString());  

				if(description.getURI().toString().contains(include.getImportURI().toString())) { 
					
					
					
					//Ora devo attivare il link all'uri...

		
					AbstractNode node = NodeUtil.getNode(eObject);
					
					

						JdtHyperlink hyperlink = jdtHyperlinkProvider.get();
						
						hyperlink.setTypeLabel("Navigate to generated source code.");
						hyperlink.setHyperlinkText("Go to type ");
					
						hyperlink.setHyperlinkRegion(new Region(node.getOffset()+8, node.getLength()));
						acceptor.accept(hyperlink);
				
						uriEditorOpener.open(description.getURI(), true);

				}
				
				
			}
		}



		/*
			List<AbstractNode> nodes = NodeUtil.findNodesForFeature(eObject, DomainmodelPackage.Literals.TYPE__NAME);
			if (!nodes.isEmpty()) {
				AbstractNode node = nodes.get(0);
				if (node.getOffset() <= offset && node.getOffset() + node.getLength() > offset) {
					String qualifiedName = qualifiedNameProvider.getQualifiedName(eObject);
					if (resource.getResourceSet() instanceof XtextResourceSet) {
						XtextResourceSet resourceSet = (XtextResourceSet) resource.getResourceSet();
						Object uriContext = resourceSet.getClasspathURIContext();
						if (uriContext instanceof IJavaProject) {
							IJavaProject javaProject = (IJavaProject) uriContext;
							try {
								IType type = javaProject.findType(qualifiedName);
								if (type != null) {
									JdtHyperlink hyperlink = jdtHyperlinkProvider.get();
									hyperlink.setJavaElement(type);
									hyperlink.setTypeLabel("Navigate to generated source code.");
									hyperlink.setHyperlinkText("Go to type " + qualifiedName);
									hyperlink.setHyperlinkRegion(new Region(node.getOffset(), node.getLength()));
									acceptor.accept(hyperlink);
								}
							} catch(JavaModelException e) {
								logger.error(e.getMessage(), e);
							}
						}
					}
				}
			}*/
	}

}
