package org.oz;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Mainer_MembersInjector implements MembersInjector<Mainer> {
  private final Provider<Test> test2AndTestProvider;

  public Mainer_MembersInjector(Provider<Test> test2AndTestProvider) {
    this.test2AndTestProvider = test2AndTestProvider;
  }

  public static MembersInjector<Mainer> create(Provider<Test> test2AndTestProvider) {
    return new Mainer_MembersInjector(test2AndTestProvider);
  }

  @Override
  public void injectMembers(Mainer instance) {
    injectTest(instance, DoubleCheck.lazy(test2AndTestProvider));
    injectTest2(instance, test2AndTestProvider.get());
  }

  public static void injectTest(Mainer instance, Lazy<Test> test) {
    instance.test = test;
  }

  public static void injectTest2(Mainer instance, Test test2) {
    instance.test2 = test2;
  }
}
