package org.oz.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.oz.po.Book;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookModule_ProvideEnglishFactory implements Factory<Book> {
  private static final BookModule_ProvideEnglishFactory INSTANCE =
      new BookModule_ProvideEnglishFactory();

  @Override
  public Book get() {
    return provideInstance();
  }

  public static Book provideInstance() {
    return proxyProvideEnglish();
  }

  public static BookModule_ProvideEnglishFactory create() {
    return INSTANCE;
  }

  public static Book proxyProvideEnglish() {
    return Preconditions.checkNotNull(
        BookModule.provideEnglish(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
