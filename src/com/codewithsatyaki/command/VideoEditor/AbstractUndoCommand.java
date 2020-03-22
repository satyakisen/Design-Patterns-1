package com.codewithsatyaki.command.VideoEditor;

public abstract class AbstractUndoCommand implements UndoableCommand{
    protected VideoEditor editor;
    private History history;

    public AbstractUndoCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        this.doExecute();
        history.push(this);
    }

    abstract void doExecute();
}
