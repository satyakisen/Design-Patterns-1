package com.codewithsatyaki.command.VideoEditor;

public class LabelCommand extends AbstractUndoCommand{
    private String text;

    public LabelCommand(History history, VideoEditor editor, String text) {
        super(editor, history);
        this.text = text;
    }


    @Override
    public void undo() {
        editor.removeText();
    }


    @Override
    void doExecute() {
        editor.setText(text);
    }
}
