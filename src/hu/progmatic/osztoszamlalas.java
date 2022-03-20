package hu.progmatic;

public class osztoszamlalas {
    public static void main(String[] args) {
        doit(1);
        doit(2);
        doit(10);
        doit(11);
        doit(16);
        doit(25);
        doit(30);
    }

    public static int divisorCount(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void doit(int number){
        System.out.println(number + " osztóinak száma: " + divisorCount(number));
    }
}
