package org.oz;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        Mainer mainer = new Mainer();

        mainer.getTest().run();

        mainer = null;
        
        System.gc();

    }


}
