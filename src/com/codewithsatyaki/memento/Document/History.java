package com.codewithsatyaki.memento.Document;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<DocumentState> documentStateDeque = new ArrayDeque<>();

    public void push(DocumentState documentState){
        documentStateDeque.push(documentState);
    }
    public DocumentState pop(){
        return documentStateDeque.pop();
    }
}
