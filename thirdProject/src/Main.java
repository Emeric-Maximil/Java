import com.cda.classes.Assassin;
import com.cda.classes.Guerrier;
import com.cda.classes.Partie;

public class Main {
    public static void main(String [] args){


        Assassin arkanix = new Assassin("maxou",100,30,2,50);
        Guerrier feur = new Guerrier("Guerrier",100,30,2,50);
        Assassin nix = new Assassin("maxou",100,30,2,50);

        Partie nixvsFeur = new Partie(nix,feur,5);

        nixvsFeur.lancerPartie();


    }
}
