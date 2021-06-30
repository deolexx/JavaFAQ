package com.deo.javalearning.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int i;
        try (FileInputStream fin = new FileInputStream("D:/file.txt"))  //Not necessary to manually close stream
        {

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);


        }
    }

}
