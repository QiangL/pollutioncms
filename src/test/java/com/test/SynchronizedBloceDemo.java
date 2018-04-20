package com.test;

import java.math.BigInteger;
import java.util.Scanner;

public class SynchronizedBloceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] arrStr=sc.nextLine().split(" ");
            int target = Integer.valueOf(sc.nextLine());
            int[] arr = new int[arrStr.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(arrStr[i]);
            }

            if (arr[arr.length - 1] < target) {
                System.out.println(arr.length);
            }else if(arr[0] > target){
                System.out.println(0);
            }else{
                System.out.println(binarySearch(0,arr.length,arr,target));
            }

            /*BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            BigInteger z = sc.nextBigInteger();

            System.out.format("%s", x.modPow(y, z).toString());*/

        }


    }
    static int binarySearch(int start,int end, int[] arr,int target){
        if (start == end) {
            return start;
        }
        int mid = (end - start) / 2 + start;
        if (arr[mid] > target) {
            return binarySearch(start, mid, arr, target);
        }else if(arr[mid] < target){
            return binarySearch(mid+1, end, arr, target);
        }else{
            return mid;
        }
    }

}

