
/*
 * generated by Xtext
 */
 
package jolie.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class JolieExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return jolie.xtext.ui.internal.JolieActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return jolie.xtext.ui.internal.JolieActivator.getInstance().getInjector("jolie.xtext.Jolie");
	}
	
}
