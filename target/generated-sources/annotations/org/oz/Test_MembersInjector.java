package org.oz;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.oz.po.Book;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Test_MembersInjector implements MembersInjector<Test> {
  private final Provider<Book> bookProvider;

  public Test_MembersInjector(Provider<Book> bookProvider) {
    this.bookProvider = bookProvider;
  }

  public static MembersInjector<Test> create(Provider<Book> bookProvider) {
    return new Test_MembersInjector(bookProvider);
  }

  @Override
  public void injectMembers(Test instance) {
    injectBook(instance, bookProvider.get());
  }

  public static void injectBook(Test instance, Book book) {
    instance.book = book;
  }
}
