package hu.progmatic;

public class lnko {
    public static void main(String[] args) {
        writeOutGcd(1,7);
        writeOutGcd(16,9);
        writeOutGcd(12,48);
        writeOutGcd(102,102);
        writeOutGcd(225,360);
        writeOutGcd(5432,2345);
    }

    public static int gcd(int n1, int n2){
        int a = max(n1, n2);
        int b = min(n1, n2);
        int remainder;

        do{
            remainder = a%b;
            a = b;
            b = remainder;
        }while (remainder != 0);

        return a;
    }

    public static int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }

    public static int min(int n1, int n2){
        return n1 > n2 ? n2 : n1;
    }

    public static void writeOutGcd(int n1,int n2){
        System.out.println(n1 + " és " + n2 + " legnagyobb közös osztója: " + gcd(n1,n2));
    }
}
