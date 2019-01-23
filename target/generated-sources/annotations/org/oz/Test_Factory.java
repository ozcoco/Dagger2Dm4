package org.oz;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.oz.po.Book;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Test_Factory implements Factory<Test> {
  private final Provider<Book> bookProvider;

  public Test_Factory(Provider<Book> bookProvider) {
    this.bookProvider = bookProvider;
  }

  @Override
  public Test get() {
    return provideInstance(bookProvider);
  }

  public static Test provideInstance(Provider<Book> bookProvider) {
    return new Test(bookProvider.get());
  }

  public static Test_Factory create(Provider<Book> bookProvider) {
    return new Test_Factory(bookProvider);
  }

  public static Test newTest(Book book) {
    return new Test(book);
  }
}
