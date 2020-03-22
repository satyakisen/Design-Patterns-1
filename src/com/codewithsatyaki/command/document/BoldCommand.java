package com.codewithsatyaki.command.document;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private History history;
    private HtmlDocument document;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        this.prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
