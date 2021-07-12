package com.deo.javalearning.core.strings;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {


            //new string object
            String s = new String(); //null
            //creating string from char array
            char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
            String s1 = new String(chars); //"abcdef"
            //string from char array with offset and count
            String s2 = new String(chars, 2, 2); //"cd"
            //one String object from another
            String s3 = new String(s2);
            //String from byte array
            byte[] ascii = {65, 66, 67, 68, 69};
            String s4 = new String(ascii); //"ABCDE"
            //NOTE!
            //array values copy when the new string created form array,
            //so if you change the array after than, string wont change

            //short string creation
            String s5 = "abc";
            System.out.println(s5.length()); //returns 3
            System.out.println("abc".length()); //returns 3
            //string concat
            //with sting
            String s6 = "a"+"b"+"c"; //"abc"
            //with int
            String s7 = "a"+2; // "a2" string will be created

            String str = "Hello world";

            String s8 = str.toLowerCase(Locale.ROOT); //"hello world"
            String s9 = str.toUpperCase(Locale.ROOT); //"HELLO WORLD"
            String s10 = str.replace('l','n');//"henno wornd"
            String s11 = str.substring(6);//"world"
            String s12 = str.substring(6,8);//"wo"
            System.out.println(s12.matches("\\w*"));//true







    }
}
