package com.codewithsatyaki.state.Canvas;

public class Canvas {
    private Tool currentTool;

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
