package hu.progmatic;

public class medve_csata {
    public static void main(String[] args) {
	    int hp1 = 150;
        int ap1 = 85;
        int hp2 = 170;
        int ap2 = 75;

        do{
            hp1 -= ap2;
            hp2 -= ap1;
            System.out.println("Első Medve: " + hp1 + " HP \t" +
                    "           Második Medve: " + hp2 + " HP");
        }while(hp1 > 0 && hp2 > 0);

        if (hp1 == hp2){
            System.out.println("Döntetlen");
        }else {
            System.out.println((hp1 > hp2 ? "Első " : "Második") + " medve nyert!");
        }
    }
}
