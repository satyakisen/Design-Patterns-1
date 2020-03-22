package com.codewithsatyaki.command.VideoEditor;

public interface UndoableCommand extends Command {
    void undo();
}
