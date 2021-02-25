package com.deo.javalearning;


import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Codewars {

    static String toCamelCase(String s){
        List<String> list = Arrays.asList(s.split(""));
        for(int i=0;i<list.size();i++){
            if(list.get(i).matches("[-_]")){
              list.set(i+1,list.get(i+1).toUpperCase());
              list.set(i,"");
;            }
        }
    s=String.join("",list);
return  s;
    }

    static String toCamelCase1(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }

    static String toCamelCase2(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }


    public static void main(String[] args) {
      System.out.println(toCamelCase("the-Stealth-Warrior"));
    }

}
