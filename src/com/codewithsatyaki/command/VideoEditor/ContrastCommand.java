package com.codewithsatyaki.command.VideoEditor;

public class ContrastCommand extends AbstractUndoCommand{
    private float prevContrast;
    private float contrast;

    public ContrastCommand(VideoEditor videoEditor, History history, float contrast) {
        super(videoEditor, history);
        prevContrast = editor.getContrast();
        this.contrast = contrast;
    }

    @Override
    void doExecute() {
        editor.setContrast(this.contrast);
    }

    @Override
    public void undo() {
        editor.setContrast(this.prevContrast);
    }


}
