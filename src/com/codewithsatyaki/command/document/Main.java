package com.codewithsatyaki.command.document;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");

        Command command = new BoldCommand(document, history);
        command.execute();

        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println(document.getContent());
    }
}
