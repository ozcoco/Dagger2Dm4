package org.oz.di.components;

import dagger.Component;
import org.oz.Mainer;
import org.oz.di.modules.BookModule;
import org.oz.di.modules.TestModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {TestModule.class, BookModule.class}, dependencies = {TestComponent.class})
public interface AppComponent {

    void inject(Mainer mainer);
}
