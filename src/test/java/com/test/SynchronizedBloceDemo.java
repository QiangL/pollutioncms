package com.test;

import java.util.Scanner;

public class SynchronizedBloceDemo {

    static int typeNum = 0;
    static int numEachBox = 0;
    static int[] downlimit;
    static int[] uplimit;
    static long result = 0;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            result = 0;
            typeNum = sc.nextInt();
            numEachBox = sc.nextInt();
            downlimit = new int[typeNum];
            uplimit = new int[typeNum];
            int sum = 0;
            for (int i = 0; i < typeNum; i++) {
                downlimit[i] = sc.nextInt();
                uplimit[i] = sc.nextInt();
                sum += downlimit[i];
            }

            for (int j = downlimit[0]; j <= uplimit[0]; j++) {
                getNum(0, j);
            }

            System.out.println(result);


        }
    }

    static void getNum(int limit, int count) {
        if(limit >= typeNum-1) return;
        for (int j = downlimit[limit]; j <= uplimit[limit]; j++) {
            System.out.println(limit + "," + j);
            if (j + count == numEachBox) {
                System.out.println(limit + "," + count + "," + j);
                result++;
            } else if (j + count > numEachBox) {
                continue;
            } else {
                getNum(limit + 1, count + j);
            }
        }

    }


}

