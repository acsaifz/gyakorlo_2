package hu.progmatic;

public class medve_csata {
    public static void main(String[] args) {
        bearBattle(100,10,80,50);
        bearBattle(200,30,200,20);
        bearBattle(100,30,110,30);
        bearBattle(150,85,170,75);
    }

    public static void bearBattle(int hp1, int ap1, int hp2, int ap2){
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
        System.out.println("---------------------------------------");
    }
}
