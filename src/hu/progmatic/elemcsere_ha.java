package hu.progmatic;

import java.util.Arrays;

public class elemcsere_ha {
    public static void main(String[] args) {
        int[] numbers = new int[0];;
        doit(numbers);

        numbers = new int[]{1};
        doit(numbers);

        numbers = new int[]{1};
        doit(numbers);

        numbers = new int[]{1, 2};
        doit(numbers);

        numbers = new int[]{2, 1};
        doit(numbers);

        numbers = new int[]{2, 1, -4, 3};
        doit(numbers);
    }

    public static int[] changeElements(int[] numbers){
        if (numbers.length > 1 && numbers[0] > numbers[1]){
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
        return numbers;
    }

    public static String intsToString(int[] numbers){
        String string = "[";
        for(int i = 0; i < numbers.length - 1; i++){
            string += numbers[i] + ", ";
        }
        if (numbers.length > 0) string += numbers[numbers.length-1];
        string += "]";

        return string;
    }

    public static void doit(int[] numbers){
        System.out.println("Eredeti: " + intsToString(numbers) + "\t" +
                "Módosított: " + intsToString(changeElements(numbers)));
        System.out.println("-------------------");
    }
}
