package com.deo.javalearning;

import java.util.ArrayList;

public class Codewars {

    public static String sortMyString(String s) {
        var ar1=new ArrayList();
        var ar2=new ArrayList();
        ar2.add(" ");

        for(int i =0;i<s.length();i++){
            if(i%2!=0){
                ar2.add(s.charAt(i));
            }
            else ar1.add(s.charAt(i));
        }
        var res = new StringBuilder();

        for (var z : ar1) {
            res.append(z);
        }
        for (var z : ar2) {
            res.append(z);
        }


        return res.toString();
    }

    public static void main(String[] args) {

        System.out.println(sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
    }


}












