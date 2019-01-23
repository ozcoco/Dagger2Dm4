package org.oz;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<Test> testProvider;

  public App_MembersInjector(Provider<Test> testProvider) {
    this.testProvider = testProvider;
  }

  public static MembersInjector<App> create(Provider<Test> testProvider) {
    return new App_MembersInjector(testProvider);
  }

  @Override
  public void injectMembers(App instance) {
    injectSetTest(instance, testProvider.get());
  }

  public static void injectSetTest(App instance, Test test) {
    instance.setTest(test);
  }
}
