package com.codewithsatyaki.state.Canvas;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush tool is selected");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
