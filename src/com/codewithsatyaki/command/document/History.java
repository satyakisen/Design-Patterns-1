package com.codewithsatyaki.command.document;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<UndoableCommand> undoCommands = new ArrayDeque<>();

    public void push(UndoableCommand command){
        undoCommands.add(command);
    }

    public UndoableCommand pop(){
       return undoCommands.pop();
    }
}
