package com.codewithsatyaki.state.Canvas;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection tool selected");
    }

    @Override
    public void mouseDown() {
        System.out.println("Drawing a rectangle");
    }
}
