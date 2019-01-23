package org.oz.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.oz.po.Book;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookModule_ProvideEnglistFactory implements Factory<Book> {
  private final BookModule module;

  public BookModule_ProvideEnglistFactory(BookModule module) {
    this.module = module;
  }

  @Override
  public Book get() {
    return provideInstance(module);
  }

  public static Book provideInstance(BookModule module) {
    return proxyProvideEnglist(module);
  }

  public static BookModule_ProvideEnglistFactory create(BookModule module) {
    return new BookModule_ProvideEnglistFactory(module);
  }

  public static Book proxyProvideEnglist(BookModule instance) {
    return Preconditions.checkNotNull(
        instance.provideEnglish(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
