package hu.progmatic;

public class szokoev {
    public static void main(String[] args) {
        doit(1584);
        doit(1600);
        doit(2004);
        doit(1200);
        doit(1580);
        doit(1800);
        doit(1999);
    }

    public static boolean isLeapyear(int year){
        return year > 1582 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    public static void doit(int year){
        System.out.println(year + " szökőév? " + (isLeapyear(year) ? "Igen!" : "Nem!"));
    }
}
