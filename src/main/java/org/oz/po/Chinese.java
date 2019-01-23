package org.oz.po;

import javax.inject.Inject;

public class Chinese extends Book {

    @Inject
    public Chinese() {
        setName("语文");
    }
}
