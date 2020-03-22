package com.codewithsatyaki.command.document;

public class UndoCommand implements Command {
    History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.pop().unexecute();
    }
}
