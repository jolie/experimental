package jolie;

import com.google.inject.Injector;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import jolie.xtext.JolieStandaloneSetup;
import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.Main;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.Program;
import jolie.xtext.jolie.impl.BasicStatementImpl;
import jolie.xtext.jolie.util.JolieSwitch;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.util.ParsetreeSwitch;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.XtextSwitch;

public class ToString extends JolieSwitch<String> {

  

    public static void main(String[] args) throws IOException {

        Injector injector = new JolieStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        /*If you can leverage EMF in your application, I'd recommend to stick with the EMF API (resourceSet.getResource()) which hides the complexity of Antlr, the linking stuff, validation etc*/
        Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.ol"));
        InputStream in = new ByteArrayInputStream("main {a=2;b=3}".getBytes());
        resource.load(in, resourceSet.getLoadOptions());
        EList<Resource.Diagnostic> errors = resource.getErrors();




        if (errors.size() > 0) {
            int i = 0;
            while (i < errors.size()) {
                System.out.println(errors.get(i).toString());
                i++;
            }
        } else {
            System.out.println("errors=0");
        }
        EObject model = resource.getContents().get(0);

        JolieSwitch js = new JolieSwitch();
       
        js.doSwitch(model);



        
    }
}
