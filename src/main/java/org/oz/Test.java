package org.oz;

import org.oz.di.modules.ChineseBook;
import org.oz.po.Book;

import javax.inject.Inject;

public class Test implements Runnable {

    //    @ChineseBook
    Book book;

/*    @Inject
    public Test() {
    }*/

    @Inject
    public Test(Book book) {
        this.book = book;
    }


    @Override
    public void run() {

        System.out.println(book.getName());

    }
}
