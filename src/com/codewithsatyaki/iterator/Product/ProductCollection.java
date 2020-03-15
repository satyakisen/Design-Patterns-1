package com.codewithsatyaki.iterator.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) { products.add(product); }

    public List<Product> getProducts() {
        return products;
    }

    public Iterator<Product> createIterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<Product> {
        private ProductCollection collection;
        private int index;
        public ListIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return index < collection.getProducts().size();
        }

        @Override
        public Product current() {
            return collection.getProducts().get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
