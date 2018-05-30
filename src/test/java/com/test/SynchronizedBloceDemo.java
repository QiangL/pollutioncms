package com.test;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.apache.shiro.codec.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.TreeMap;

public class SynchronizedBloceDemo {

    public static void main(String[] args) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        byte[] key = Base64.decode("4AvVhmFLUs0KTA3Kprsdag==");


        System.out.println(Arrays.toString(key));

        System.out.println(key.length);

    }

}



