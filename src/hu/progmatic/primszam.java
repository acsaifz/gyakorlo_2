package hu.progmatic;

public class primszam {
    public static void main(String[] args) {
        int number = 2147483647;

        boolean isPrimeNumber = number < 2 ? false : true;

        for(int i = 2; i < number; i++){
            if (number % i == 0){
                isPrimeNumber = false;
                break;
            }
        }

        System.out.println(number + " prímszám? " + (isPrimeNumber ? "Igen!" : "Nem!"));
    }
}
