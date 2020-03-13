package com.codewithsatyaki.memento.Editor;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorState> editorStates = new ArrayList<>();
    public void push(EditorState state){
        editorStates.add(state);
    }
    public EditorState pop(){
        int lastIndex = editorStates.size() - 1;
        EditorState state = editorStates.get(lastIndex);
        editorStates.remove(lastIndex);
        return state;
    }
}
