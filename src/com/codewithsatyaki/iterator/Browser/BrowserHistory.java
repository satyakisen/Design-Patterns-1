package com.codewithsatyaki.iterator.Browser;

public class BrowserHistory {
    private String[] histories = new String[10];
    private int index;

    public void push(String history){
        histories[index++] = history;
    }

    public String pop(){
        return histories[--index];
    }

    public String[] getHistories() {
        return histories;
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    private class ArrayIterator implements Iterator<String>{
        private BrowserHistory browserHistory;
        private int index;

        private ArrayIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
        }

        @Override
        public boolean hasNext() {
            return index > this.browserHistory.getHistories().length;
        }

        @Override
        public String current() {
            return this.browserHistory.getHistories()[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
