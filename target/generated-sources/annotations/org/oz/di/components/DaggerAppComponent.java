package org.oz.di.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.oz.Mainer;
import org.oz.Mainer_MembersInjector;
import org.oz.Test;
import org.oz.di.modules.BookModule;
import org.oz.di.modules.BookModule_ProvideEnglishFactory;
import org.oz.di.modules.TestModule;
import org.oz.di.modules.TestModule_ProvideTestFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Test> provideTestProvider;

  private DaggerAppComponent(Builder builder) {

    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideTestProvider =
        DoubleCheck.provider(
            TestModule_ProvideTestFactory.create(BookModule_ProvideEnglishFactory.create()));
  }

  @Override
  public void inject(Mainer mainer) {
    injectMainer(mainer);
  }

  @CanIgnoreReturnValue
  private Mainer injectMainer(Mainer instance) {
    Mainer_MembersInjector.injectTest(instance, DoubleCheck.lazy(provideTestProvider));
    Mainer_MembersInjector.injectTest2(instance, provideTestProvider.get());
    return instance;
  }

  public static final class Builder {
    private TestComponent testComponent;

    private Builder() {}

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(testComponent, TestComponent.class);
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder testModule(TestModule testModule) {
      Preconditions.checkNotNull(testModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder bookModule(BookModule bookModule) {
      Preconditions.checkNotNull(bookModule);
      return this;
    }

    public Builder testComponent(TestComponent testComponent) {
      this.testComponent = Preconditions.checkNotNull(testComponent);
      return this;
    }
  }
}
