package hu.progmatic;

import java.util.Arrays;

public class elemcsere {
    public static void main(String[] args) {
        char[] chars = {'+', '-', '*', '/', '%'};
        if (chars.length > 1){
            char temp = chars[0];
            chars[0] = chars[chars.length-1];
            chars[chars.length-1] = temp;
        }
        System.out.println(Arrays.toString(chars));
    }
}
