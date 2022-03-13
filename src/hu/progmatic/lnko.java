package hu.progmatic;

public class lnko {
    public static void main(String[] args) {
        int n1 =5432;
        int n2 = 2345;

        int a = n1 > n2 ? n1 : n2;
        int b = n2 > n1 ? n1 : n2;
        int remainder;

        do{
            remainder = a%b;
            a = b;
            b = remainder;
        }while (remainder != 0);

        System.out.println(n1 + " és " + n2 + " legnagyobb közös osztója: " + a);
    }
}
