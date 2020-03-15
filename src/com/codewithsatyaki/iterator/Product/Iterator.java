package com.codewithsatyaki.iterator.Product;

public interface Iterator<T> {
    public boolean hasNext();
    public T current();
    public void next();
}
