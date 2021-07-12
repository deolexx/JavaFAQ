package com.deo.javalearning.core.strings;

public class StringDemo {
    public static void main(String[] args) {
        //new string object
        String s = new String(); //null
        //creating string from char array
        char[] chars = {'a','b','c','d','e','f'};
        String s1 = new String(chars); //"abcdef"
        //string from char array with offset and count
        String s2 = new String(chars,2,2); //"cd"
        //one String object from another
        String s3 = new String(s2);
        //String from byte array
        byte [] ascii= {65,66,67,68,69};
        String s4 = new String(ascii); //"ABCDE"
        //NOTE!
        //array values copy when the new string created form array,
        //so if you change the array after than, string wont change
    }
}
