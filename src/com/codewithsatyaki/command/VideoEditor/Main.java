package com.codewithsatyaki.command.VideoEditor;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        VideoEditor editor = new VideoEditor();

        Command command = new ContrastCommand(editor, history, 1);
        command.execute();

        System.out.println(editor);

        Command command1 = new LabelCommand(history, editor, "Video 1");
        command1.execute();

        System.out.println(editor);

        Command command2 = new UndoCommand(history);
        command2.execute();

        System.out.println(editor);

        command2.execute();
        System.out.println(editor);
    }
}
