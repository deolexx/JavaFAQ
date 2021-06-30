package com.deo.javalearning.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

    public static void main(String[] args) throws IOException {
       char c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            c = (char) reader.read();
            System.out.println(c);
        }while (c != 'q');


    }



}
