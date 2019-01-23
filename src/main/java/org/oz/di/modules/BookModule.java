package org.oz.di.modules;


import dagger.Module;
import dagger.Provides;
import org.oz.po.Book;
import org.oz.po.Chinese;
import org.oz.po.English;

@Module
public class BookModule {

    @Provides
    @ChineseBook
    static  Book provideChinese() {
        return new Chinese();
    }

    @Provides
    @EnglistBook
    static  Book provideEnglish() {
        return new English();
    }

}
