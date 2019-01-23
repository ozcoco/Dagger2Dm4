package org.oz.di.components;

import dagger.Component;
import org.oz.Test;

@Component
public interface TestComponent {

    void inject(Test test);

}
