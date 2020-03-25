package com.codewithsatyaki.mediator;

public class Checkbox extends UIControl{
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
