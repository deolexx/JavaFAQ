package com.deo.javalearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {


    static void matches(String pattern, String matcher) {
        boolean found;
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(matcher);
        found = mat.matches();
        if (found) {
            System.out.printf("%s match: %s%n", pattern, matcher);
        } else {
            System.out.printf("%s not match: %s%n", pattern, matcher);
        }
    }
    static void find(String pattern,String  matcher) {
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(matcher);

        if (mat.find()) {
            System.out.printf("%s sequence find in: %s%n", pattern, matcher);
        } else {
            System.out.printf("%s sequence not found: %s%n", pattern, matcher);
        }
    }
    static void start(String pattern, String  matcher) {
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(matcher);

        while(mat.find()) {
            System.out.printf("%s sequence find at : %d%n", pattern,mat.start());
        }
    }
    static void group(String pattern, String  matcher) {
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(matcher);

        while(mat.find()) {
            System.out.printf("%s sequence find at : %s%n", pattern,mat.group());
        }
    }

    public static void main(String[] args) {
        matches("Java", "Java 9");
        find("Java", "Java 9");
        start("a", "Java 9");
        group("W+", "W WW WWW"); // try diff quantifiers ? * +

    }


}
