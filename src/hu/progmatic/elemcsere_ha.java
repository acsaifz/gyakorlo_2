package hu.progmatic;

import java.util.Arrays;

public class elemcsere_ha {
    public static void main(String[] args) {
        int[] numbers = {2, 1, -4, 3};
        if (numbers.length > 1 && numbers[0] > numbers[1]){
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
