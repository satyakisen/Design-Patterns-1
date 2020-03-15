package com.codewithsatyaki.iterator.Browser;

public interface Iterator<T> {
    public boolean hasNext();
    public T current();
    public void next();
}
