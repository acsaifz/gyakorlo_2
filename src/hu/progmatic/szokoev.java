package hu.progmatic;

public class szokoev {
    public static void main(String[] args) {
        int year = 1999;
        System.out.println(year + " szökőév? " + (year > 1582 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? "Igen!" : "Nem!"));
    }
}
