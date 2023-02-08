/*
 * generated by Xtext unknown
 */
package org.xtext.example.mydsl2.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl2.MyDslRuntimeModule;
import org.xtext.example.mydsl2.MyDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyDslIdeSetup extends MyDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule(), new MyDslIdeModule()));
	}
	
}
