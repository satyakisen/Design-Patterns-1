package com.codewithsatyaki;

import com.codewithsatyaki.memento.Document.Document;
import com.codewithsatyaki.memento.Document.History;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        History history = new History();

        document.setContent("Hello 1");
        history.push(document.createState());

        document.setFontName("a");
        history.push(document.createState());

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);
    }
}
