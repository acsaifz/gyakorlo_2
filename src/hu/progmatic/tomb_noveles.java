package hu.progmatic;

public class tomb_noveles {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        int newElement = 1;
        System.out.print(intsToString(numbers) + " ---> ");
        numbers = addNumber(numbers,newElement);
        System.out.println(intsToString(numbers));

        numbers = new int[]{1};
        newElement = 2;
        System.out.print(intsToString(numbers) + " ---> ");
        numbers = addNumber(numbers,newElement);
        System.out.println(intsToString(numbers));

        numbers = new int[]{1, 2};
        newElement = 10;
        System.out.print(intsToString(numbers) + " ---> ");
        numbers = addNumber(numbers,newElement);
        System.out.println(intsToString(numbers));

        numbers = new int[]{-33, 66, 42, -13, 54, 89};
        newElement = 0;
        System.out.print(intsToString(numbers) + " ---> ");
        numbers = addNumber(numbers,newElement);
        System.out.println(intsToString(numbers));
    }

    public static int[] addNumber(int[] baseNumbers, int newElement){
        int[] newNumbers = new int[baseNumbers.length+1];
        newNumbers[newNumbers.length-1] = newElement;

        for (int i = 0; i < baseNumbers.length;i++){
            newNumbers[i] = baseNumbers[i];
        }
        return newNumbers;
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
}
