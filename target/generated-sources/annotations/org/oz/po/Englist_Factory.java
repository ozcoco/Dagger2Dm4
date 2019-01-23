package org.oz.po;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Englist_Factory implements Factory<English> {
  private static final Englist_Factory INSTANCE = new Englist_Factory();

  @Override
  public English get() {
    return provideInstance();
  }

  public static English provideInstance() {
    return new English();
  }

  public static Englist_Factory create() {
    return INSTANCE;
  }

  public static English newEnglist() {
    return new English();
  }
}
