package com.codewithsatyaki.command.document;

public interface UndoableCommand extends Command{
    void unexecute();
}
