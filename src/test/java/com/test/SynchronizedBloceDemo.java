package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SynchronizedBloceDemo {

    public static void main(String[] args) throws Exception {
        int[] a = new int[]{1, 2, 3, 4, 5};
        List<Integer> aa = new ArrayList<>();
        aa.addAll(Arrays.asList(1, 2, 3, 4, 5));
        Collections.rotate(aa, 1);
        System.out.println(aa);

    }
}

interface BaseTest<T> {

}

class SubClass implements BaseTest {

}

interface BaseTest2<T> {

}

class SubClass2 extends SubClass implements BaseTest {

}



