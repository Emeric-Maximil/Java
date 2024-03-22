import com.cda2.classes.Habitation;
import com.cda2.classes.Vehicule;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //System.out.println(soustraction(4,2,1));
        //System.out.println(moyenne(4,2,1,8));
        //System.out.println(intervertir(4,2));
        //System.out.println(intervertir2(4,2));
        //System.out.println(soustractionScan());
        //System.out.println(moyenneScan());
        //System.out.println(scancarre());
        Scanner scanner = new Scanner(System.in);
        //calculprix(scanner);
        //produit(scanner);
        //catEnfant(scanner);
        //heure(scanner);
        //heureSec(scanner);
        //System.out.println(photocopies(scanner) + " €");

        //monnaie(723.45);
        //unesurTrois(scanner);
        //exo15(scanner);
        //exo16(scanner);
        //exo17(scanner);
        //System.out.println(exo18(scanner));
        //System.out.println(exo19());
        //System.out.println(exo20());
        //System.out.println("moyenne " + exo21());
        //System.out.println(exo22(scanner));
        //exo23(scanner);
        //exo24();

        Habitation maison1 = new Habitation();
        Habitation maison2 = new Habitation("mAiSoN", 10.2, 25.4, 2);
        System.out.println("l'habitation : "+maison1.getNom() + " à une surface de " + maison1.surface() + "m²");
        System.out.println("l'habitation : "+maison2.getNom() + " à une surface de " + maison2.surface() + "m²");

        //exo vehicule
        Vehicule shy = new Vehicule("Vers", 0,100);
        Vehicule moto = new Vehicule("Vroom", 2,10);
        Vehicule tank = new Vehicule("Tiger", 6,5);

        System.out.println(shy.getNom() + " est de type" + shy.detect());
        System.out.println(moto.getNom() + " est de type" + moto.detect());
        System.out.println(tank.getNom() + " est de type" + tank.detect());

        shy.boost();
        System.out.println(shy.getNom() + " possede une vitesse de :"+shy.getVitesse()+"km/h");

        shy.plusRapide(moto);
    }


    //exos Lundi Mardi
    public static void exo24(){
        int [] tab = {2,18,-5, 12, 36, -1, 14};
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if(Math.abs(min) > Math.abs(tab[i])){
                min = tab[i];
            }
        }
        System.out.println("la valeur la plus petite en absolue est " + min);
    }
    public static void exo23(Scanner scanner){
        System.out.println("combien de chiffres ?");
        int nb = scanner.nextInt();
        int neg = 0;
        int tmp = 0;
        for (int i = 0; i < nb; i++) {
            System.out.println("veuillez entrez un chiffre");
            tmp = scanner.nextInt();
            if(tmp < 0 ){
                neg ++;
            }
        }
        System.out.println("Il y a " + neg + " chiffres negatifs et " + (nb-neg) + " chiffres positifs"  );
    }
    public static int exo22(Scanner scanner){
        ArrayList <Integer> tab = new ArrayList<Integer>();
        int nb = 0;
        int moy = 0;
        do {
            System.out.println("entrez chiffre");
            nb = scanner.nextInt();
            tab.add(nb);
            moy += nb;
        }
        while(nb != 0);

        return moy/ (tab.size()-1);
    }
    public static int exo21(){
        int [] tab = {10,33,56,89,7,11,2,16} ;
        int max = tab[0];

        for (int i = 1; i < tab.length; i++) {
                max += tab[i];
        }
        return max/ tab.length;
    }
    public static int exo20(){
        int [] tab = {10,33,56,89,7,11,2,16} ;
        int max = tab[1];

        for (int i = 1; i < tab.length; i++) {
            if(max<tab[i]){
                max = tab[i];
            }
        }
        return max;
    }
    public static int exo19(){
        int [] tab = {10,33,56,89,7,11,2,16} ;
        int min = tab[1];

        for (int i = 1; i < tab.length; i++) {
            if(min>tab[i]){
                min = tab[i];
            }
        }
        return min;
    }
    public static int exo18(Scanner scanner){
        System.out.println("Veuillez entrer un chiffre");
        int nb = scanner.nextInt();
        int res = 0;
        while(nb != 0){
            res += nb;
            nb--;
        }
        return res;
    }
    public static void exo17(Scanner scanner){
        System.out.println("Veuillez entrer un chiffre, je te dirai sa table");
        int nb = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(nb + " x " + i +" = "+ nb*i);
        }
    }
    public static void exo16(Scanner scanner){
        System.out.println("Veuillez entrer un chiffre, je te dirai les 10 prochains");
        int nb = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(nb+i);
        }
    }
    public static void exo15(Scanner scanner){
        int min = 10; int max = 20; int range = max - min + 1;
        int rand  = (int)(Math.random() * range) + min;

        System.out.println("Veuillez entrer un chiffre, le chiffre a deviner est "+ rand);
        int nb = scanner.nextInt();
        while (nb != rand){
            if(nb > 20 ){
                System.out.println("Plus petit ! le chiffre est "+ rand);
            }if(nb < 10){
                System.out.println("Plus grand ! le chiffre est "+ rand);
            }
            System.out.println("Saisir un chiffre");
            nb = scanner.nextInt();
        }
    }
    public static void unesurTrois(Scanner scanner){
        int min = 1; int max = 3; int range = max - min + 1;
        int rand  = (int)(Math.random() * range) + min;
        System.out.println("Veuillez entrer un chiffre, le chiffre a deviner est "+ rand);
        int nb = scanner.nextInt();
        while (nb != rand){
            System.out.println("Veuillez entrer un chiffre, le chiffre a deviner est "+ rand);
            nb = scanner.nextInt();
        }
    }
    public static void monnaie(double argent){
        if(argent == 0){
            System.out.println("fini");
        }else if(argent >= 500 ){
            System.out.println("Rend un billet de 500€");
            monnaie(argent - 500);
        } else if (argent >= 100) {
            System.out.println("Rend un billet de 100€");
            monnaie(argent - 100 );
        } else if (argent >= 50) {
            System.out.println("Rend un billet de 50€");
            monnaie(argent - 50);
        } else if (argent >= 20) {
            System.out.println("Rend un billet de 20€");
            monnaie(argent - 20);
        }else if (argent >= 10) {
            System.out.println("Rend un billet de 10€");
            monnaie(argent - 10);
        }else if (argent >= 5) {
            System.out.println("Rend un billet de 5€");
            monnaie(argent - 5);
        }else if (argent >= 2) {
            System.out.println("Rend une piece de 2€");
            monnaie(argent - 2);
        }else if (argent >= 1) {
            System.out.println("Rend une piece de 1€");
            monnaie(argent - 1);
        }else if (argent >= 0.5) {
            System.out.println("Rend une piece de 50 centimes");
            monnaie(argent - 0.5);
        }else if (argent >= 0.2) {
            System.out.println("Rend une piece de 20 centimes");
            monnaie(argent - 0.2);
        }else if (argent >= 0.1) {
            System.out.println("Rend une piece de 10 centimes");
            monnaie(argent - 0.1);
        }else if (argent >= 0.05) {
            System.out.println("Rend une piece de 5 centimes");
            monnaie(argent - 0.05);
        }else if (argent >= 0.02) {
            System.out.println("Rend une piece de 2 centimes");
            monnaie(argent - 0.02);
        }else if (argent >= 0.01) {
            System.out.println("Rend une piece de 1 centime");
            monnaie(argent - 0.01);
        }
    }

    public static double photocopies(Scanner scanner){
        System.out.println("Veuillez entrer le nombre de photocopies'");
        int nb = scanner.nextInt();
        double calc = 0.0;

        if(nb > 30 ){
            calc = (nb - 30) *0.08;
            nb -= nb - 30;
        }
        if(nb > 10 ){
            calc += (nb - 10)* 0.09;
            nb -= nb - 10;
        }


        return calc + nb*0.1;

    }
    public static void heureSec(Scanner scanner){
        System.out.println("Veuillez entrer l'heure'");
        int heure = scanner.nextInt();
        System.out.println("Veuillez entrer les minutes");
        int minute = scanner.nextInt();
        System.out.println("Veuillez entrer les secondes");
        int secondes = scanner.nextInt();

        if(secondes == 59){
            secondes = 0;
            if(minute == 59){
                minute = 0;
                if(heure == 23){
                    heure = 0;
                }else {
                    heure ++;
                }
            }else{
                minute ++;
            }
        }else{
            secondes++;
        }
        System.out.println("Dans une seconde, il sera "+ heure + " heure(s) "+ minute+":"+secondes);
    }
    public static void heure(Scanner scanner){
        System.out.println("Veuillez entrer l'heure'");
        int heure = scanner.nextInt();
        System.out.println("Veuillez entrer les minutes");
        int minute = scanner.nextInt();

        if(minute == 59){
            if(heure == 23){
                heure = 0;
                minute = 0;
            }else{
                heure ++;
                minute = 0;
            }
        }else{
            minute++;
        }
        System.out.println("Dans une minute, il sera "+ heure + " heure(s) "+ minute);
    }
    public static void catEnfant(Scanner scanner){
        System.out.println("Veuillez entrer le premier nombre");
        int age = scanner.nextInt();

        if(age > 11){
            System.out.println("cadet");
        }else if(age > 9){
            System.out.println("minime");
        } else if (age > 7) {
            System.out.println("pupille");
        }else if (age > 5){
            System.out.println("poussin");
        }else {
            System.out.println("Trop jeune");
        }
    }
    public static void produit(Scanner scanner){
        System.out.println("Veuillez entrer le premier nombre");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez entrer le deuxieme nombre");
        int nbr2 = scanner.nextInt();

        if(nbr1 == 0 || nbr2 == 0){
            System.out.println("null");
        }
        else if (nbr1 < 0){
            if(nbr2 < 0 ){
                System.out.println("positif");
            }else {
                System.out.println("negatif");
            }
        }else{
            if(nbr2 < 0){
                System.out.println("negatif");
            }else {
                System.out.println("positif");
            }
        }
    }




    public static void calculprix(Scanner scanner){
        System.out.println("Veuillez entrer le prix de l'article");
        float prixHT = scanner.nextFloat();
        System.out.println("Veuillez entrer la quantité d'article");
        int qtt = scanner.nextInt();
        System.out.println("Veuillez entrer le taux de TVA");
        double TVA = 1.0 + scanner.nextDouble();

        System.out.println("Prix hors taxe : "+ prixHT+ " quantité d'article : " + qtt);
        System.out.println("avec une TVA de : "+ TVA );
        System.out.println("Pour un total de : "+ (prixHT * qtt * TVA) + "€");

    }

    /**
     *
     * @param i
     * @param j
     * @param k
     * @return i - j - k
     */
    public static int soustraction(int i, int j, int k){

        return i - j - k;
    }
    public static int soustractionScan(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre un nombre");
        int i = scanner.nextInt();
        System.out.println("Entre un nombre");
        int j = scanner.nextInt();
        System.out.println("Entre un nombre");
        int k = scanner.nextInt();

        return i - j - k;
    }

    /**
     *
     * @param i
     * @param j
     * @param k
     * @param l
     * @return la moyenne des quatre chiffres
     */
    public static int moyenne(int i, int j, int k, int l){
        return (i + j + k + l) /4;
    }
    public static int moyenneScan(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre un nombre");
        int i = scanner.nextInt();
        System.out.println("Entre un nombre");
        int j = scanner.nextInt();
        System.out.println("Entre un nombre");
        int k = scanner.nextInt();
        System.out.println("Entre un nombre");
        int l = scanner.nextInt();

        return (i + j + k + l) /4;
    }

    /**
     *
     * @param i
     * @param j
     * @return String qui dit que i
     */
    public static String intervertir(int i, int j){
        System.out.println("au départ i = "+ i + " et j = "+j);
        int tmp = i;
        i = j;
        j = tmp;
        return "i = "+ i +" j = "+ j;
    }
    /**
     *
     * @param i
     * @param j
     * @return String qui dit que i
     */
    public static String intervertir2(int i, int j){
        System.out.println("au départ i = "+ i + " et j = "+j);
        i = i * j;
        j = i / j;
        i = i / j;
        return "i = "+ i +" j = "+ j;
    }

    public static void lecture(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre un truc (un nombre)");
        int nbr = scanner.nextInt();

    }

    public static int scancarre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre un truc (un nombre)");
        int x = scanner.nextInt();
        return x*x;
    }

    public static int scanAddition(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre un nombre");
        int i = scanner.nextInt();
        System.out.println("Entre un nombre");
        int j = scanner.nextInt();


        return i + j;
    }
}
