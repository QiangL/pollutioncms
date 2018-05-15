package com.test;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class SynchronizedBloceDemo {

    public static void main(String[] args) {
        ReferenceQueue<String> a = new ReferenceQueue<>();
        WeakReference<String> test = new WeakReference<>("test", a);
        a.poll();
    }

}


