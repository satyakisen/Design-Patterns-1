package com.codewithsatyaki;

import com.codewithsatyaki.iterator.Browser.BrowserHistory;
import com.codewithsatyaki.iterator.Browser.Iterator;
import com.codewithsatyaki.iterator.Product.Product;
import com.codewithsatyaki.iterator.Product.ProductCollection;

public class Main {
    public static void main(String[] args) {
//        BrowserHistory browserHistory = new BrowserHistory();
//        browserHistory.push("a");
//        browserHistory.push("b");
//        browserHistory.push("c");
//
//        Iterator<String> iterator = browserHistory.createIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.current());
//            iterator.next();
//        }

        ProductCollection collection = new ProductCollection();
        collection.add(new Product(1, "AB"));
        collection.add(new Product(2, "BC"));

        com.codewithsatyaki.iterator.Product.Iterator<Product> iterator1 = collection.createIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.current());
            iterator1.next();
        }
    }
}
