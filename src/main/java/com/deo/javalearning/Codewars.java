package com.deo.javalearning;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Codewars {

    public static String twoSort(String[] s) {
        return Arrays.stream(Arrays.stream(s).sorted().findFirst().get().split("")).collect(Collectors.joining("***"));
    }
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
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
    public static String howManyDalmations(int  number) {

        String[] dogs ={"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"};

        String respond = number<= 10 ? dogs[0] : (number <= 50 ? dogs[1] : (number == 101 ? dogs[3] : dogs[2]));

        return respond;
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

        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));

    }




}












