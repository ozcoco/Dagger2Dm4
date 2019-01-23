package org.oz.di.modules;


import dagger.MapKey;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MapKey
@Retention(RetentionPolicy.RUNTIME)
public @interface TestKey {
    String value();
}
