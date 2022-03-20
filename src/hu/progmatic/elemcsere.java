package hu.progmatic;

import java.util.Arrays;

public class elemcsere {
    public static void main(String[] args) {
        char[] chars = new char[0];
        doit(chars);

        chars = new char[]{'a'};
        doit(chars);

        chars = new char[]{'a', 'A'};
        doit(chars);

        chars = new char[]{'+', '-', '*', '/', '%'};
        doit(chars);

    }

    public static char[] changeElements(char[] chars){
        if (chars.length > 1){
            char temp = chars[0];
            chars[0] = chars[chars.length-1];
            chars[chars.length-1] = temp;
        }
        return chars;
    }

    public static String charsToString(char[] chars){
        String string = "[";
        for(int i = 0; i < chars.length - 1; i++){
            string += chars[i] + ", ";
        }
        if (chars.length > 0) string += chars[chars.length-1];
        string += "]";

        return string;
    }

    public static void doit(char[] chars){
        System.out.println("Eredeti: " + charsToString(chars) + "\t" +
                           "Módosított: " + charsToString(changeElements(chars)));
        System.out.println("-------------------");
    }

}


