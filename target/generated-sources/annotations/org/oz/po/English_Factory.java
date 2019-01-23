package org.oz.po;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class English_Factory implements Factory<English> {
  private static final English_Factory INSTANCE = new English_Factory();

  @Override
  public English get() {
    return provideInstance();
  }

  public static English provideInstance() {
    return new English();
  }

  public static English_Factory create() {
    return INSTANCE;
  }

  public static English newEnglish() {
    return new English();
  }
}
