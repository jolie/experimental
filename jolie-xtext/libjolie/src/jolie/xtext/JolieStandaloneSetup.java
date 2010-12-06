
package jolie.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JolieStandaloneSetup extends JolieStandaloneSetupGenerated{

	public static void doSetup() {
		new JolieStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

