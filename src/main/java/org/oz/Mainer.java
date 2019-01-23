package org.oz;

import dagger.Lazy;
import org.oz.di.components.DaggerAppComponent;
import org.oz.di.components.DaggerTestComponent;

import javax.inject.Inject;

public class Mainer {

    @Inject
    Lazy<Test> test;

    @Inject
    Test test2;

    public Mainer() {

        System.out.println("> start");

        DaggerAppComponent.builder().testComponent(DaggerTestComponent.create()).build().inject(this);
    }


   /* public void setTest(Test test) {
        this.test = test;
    }*/

    public Test getTest() {

        System.out.printf("test == test2: %b", test2.equals(test.get()));

        return test.get();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("end <");
    }

}
