package hu.progmatic;

public class primszam {
    public static void main(String[] args) {
        doit(0);
        doit(1);
        doit(2);
        doit(3);;
        doit(4);
        doit(11);
        doit(25);
        doit(2147483647);
    }

    public static boolean isPrimeNumber(int number){
        boolean isPrimeNumber = number < 2 ? false : true;

        for(int i = 2; i < number; i++){
            if (number % i == 0){
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

    public static void doit(int number){
        System.out.println(number + " prímszám? " + (isPrimeNumber(number) ? "Igen!" : "Nem!"));
    }
}
