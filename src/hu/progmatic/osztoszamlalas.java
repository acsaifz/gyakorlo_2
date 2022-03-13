package hu.progmatic;

public class osztoszamlalas {
    public static void main(String[] args) {
        int number = 30;
        int count = 0;

        for(int i = 1; i <= number; i++){
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println("Osztók száma: " + count);
    }
}
