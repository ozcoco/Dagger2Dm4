package org.oz.po;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Chinese_Factory implements Factory<Chinese> {
  private static final Chinese_Factory INSTANCE = new Chinese_Factory();

  @Override
  public Chinese get() {
    return provideInstance();
  }

  public static Chinese provideInstance() {
    return new Chinese();
  }

  public static Chinese_Factory create() {
    return INSTANCE;
  }

  public static Chinese newChinese() {
    return new Chinese();
  }
}
