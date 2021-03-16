package com.deo.javalearning;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Codewars {


    public static List<Integer> sumConsecutives(List<Integer> s) {
        // your code
        List<Integer> s2 = new ArrayList<>();
        s2.addAll(s);
     int sum=0;
        for (int i = 0; i < s2.size()-1; i++) {
            sum=s2.get(i);
            while (s2.get(i)==s2.get(i+1)){
                sum+=s2.get(i+1);
                s2.remove(i+1);
            }
            s2.set(i,sum);
        }
        return s2;
    }

    public static int[] sumParts(int[] ls) {
        // your code
        int sum = Arrays.stream(ls).sum();
        int[] result = new int[ls.length+1];
       for(int i=0;i<ls.length;i++){
           result[i]= sum;
           sum=sum-ls[i];
       }
    return result;


    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        //your code here !!
        int first = Arrays.stream(firstCuboid).reduce(1, (x, y) -> x * y);
        int second = Arrays.stream(secondCuboid).reduce(1, (x, y) -> x * y);
        return first > second ? first : second;
    }


    public static int reverse_bits(int n) {
        //Your code here :)
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
    }

    public static boolean detect(String comment) {
        // your code
        return comment.matches("^(Can someone explain).*");


    }

    public static String printerError(String s) {
        // your code
        int count = 0;
        Pattern pat = Pattern.compile("[^a-m]");
        Matcher mat = pat.matcher(s);
        while (mat.find()) count++;
        return count + "";
    }


    public static int mixedSum(List<?> mixed) {

        return mixed.stream().map(x -> x + "").flatMapToInt(s -> IntStream.of(Integer.parseInt(s))).sum();

    }

    public static void main(String[] args) {



       ArrayList<Integer> lis =  new ArrayList<Integer>();
       lis.add(0,1);
       lis.add(1,4);
       lis.add(2,4);
       lis.add(3,4);
       lis.add(4,0);
       lis.add(5,4);
       lis.add(6,3);
       lis.add(7,3);
       lis.add(8,1);
        System.out.println(sumConsecutives(lis));

    }


}












