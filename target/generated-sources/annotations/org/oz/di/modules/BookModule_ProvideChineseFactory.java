package org.oz.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.oz.po.Book;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookModule_ProvideChineseFactory implements Factory<Book> {
  private static final BookModule_ProvideChineseFactory INSTANCE =
      new BookModule_ProvideChineseFactory();

  @Override
  public Book get() {
    return provideInstance();
  }

  public static Book provideInstance() {
    return proxyProvideChinese();
  }

  public static BookModule_ProvideChineseFactory create() {
    return INSTANCE;
  }

  public static Book proxyProvideChinese() {
    return Preconditions.checkNotNull(
        BookModule.provideChinese(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
