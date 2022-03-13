package hu.progmatic;

import java.util.Arrays;

public class tomb_noveles {
    public static void main(String[] args) {
        int[] numbers = {-33, 66, 42, -13, 54, 89};
        int newElement = 0;

        int[] newNumbers = new int[numbers.length+1];
        newNumbers[newNumbers.length-1] = newElement;

        for (int i = 0; i < numbers.length;i++){
            newNumbers[i] = numbers[i];
        }
        numbers = newNumbers;

        System.out.println(Arrays.toString(numbers));
    }
}
