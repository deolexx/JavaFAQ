package com.deo.javalearning.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        do {
            str = reader.readLine();
            System.out.println(str);
        } while (!str.equals("end"));

    }
}
