package org.oz.po;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.oz.Test;
import org.oz.di.modules.TestModule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TestModule_ProvideTestFactory implements Factory<Test> {
  private final TestModule module;

  private final Provider<Book> bookProvider;

  public TestModule_ProvideTestFactory(TestModule module, Provider<Book> bookProvider) {
    this.module = module;
    this.bookProvider = bookProvider;
  }

  @Override
  public Test get() {
    return provideInstance(module, bookProvider);
  }

  public static Test provideInstance(TestModule module, Provider<Book> bookProvider) {
    return proxyProvideTest(module, bookProvider.get());
  }

  public static TestModule_ProvideTestFactory create(
      TestModule module, Provider<Book> bookProvider) {
    return new TestModule_ProvideTestFactory(module, bookProvider);
  }

  public static Test proxyProvideTest(TestModule instance, Book book) {
    return Preconditions.checkNotNull(
        instance.provideTest(book), "Cannot return null from a non-@Nullable @Provides method");
  }
}
