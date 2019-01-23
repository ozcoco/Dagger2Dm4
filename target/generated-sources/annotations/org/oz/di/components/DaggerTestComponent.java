package org.oz.di.components;

import javax.annotation.Generated;
import org.oz.Test;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerTestComponent implements TestComponent {
  private DaggerTestComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static TestComponent create() {
    return new Builder().build();
  }

  @Override
  public void inject(Test test) {}

  public static final class Builder {
    private Builder() {}

    public TestComponent build() {
      return new DaggerTestComponent(this);
    }
  }
}
