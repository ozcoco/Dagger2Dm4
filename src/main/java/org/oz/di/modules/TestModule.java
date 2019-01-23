package org.oz.di.modules;

import dagger.Module;
import dagger.Provides;
import org.oz.Test;
import org.oz.po.Book;

import javax.inject.Singleton;

@Module
public class TestModule {

    @Provides
    @Singleton
    static Test provideTest(@EnglistBook Book book) {
        return new Test(book);
    }

   /* @Provides
    Test provideTest() {
        return new Test();
    }*/
}
