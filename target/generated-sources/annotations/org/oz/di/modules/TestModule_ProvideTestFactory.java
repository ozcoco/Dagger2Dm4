package org.oz.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.oz.Test;
import org.oz.po.Book;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TestModule_ProvideTestFactory implements Factory<Test> {
  private final Provider<Book> bookProvider;

  public TestModule_ProvideTestFactory(Provider<Book> bookProvider) {
    this.bookProvider = bookProvider;
  }

  @Override
  public Test get() {
    return provideInstance(bookProvider);
  }

  public static Test provideInstance(Provider<Book> bookProvider) {
    return proxyProvideTest(bookProvider.get());
  }

  public static TestModule_ProvideTestFactory create(Provider<Book> bookProvider) {
    return new TestModule_ProvideTestFactory(bookProvider);
  }

  public static Test proxyProvideTest(Book book) {
    return Preconditions.checkNotNull(
        TestModule.provideTest(book), "Cannot return null from a non-@Nullable @Provides method");
  }
}
