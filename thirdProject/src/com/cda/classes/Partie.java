package com.cda.classes;

public class Partie {
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    public void lancerPartie(){
        do {
            System.out.println("tour n°"+this.nbrTour);
            this.joueur1.attaquer(this.joueur2);
            if (this.joueur2.getVie() > 0){
                this.joueur2.attaquer(this.joueur1);
            }
            this.nbrTour--;
        }while (this.nbrTour > 0 && (this.joueur1.getVie() > 0 && this.joueur2.getVie() > 0));
        if (nbrTour == 0){
            System.out.println("Égalité");
        }else if (this.joueur1.getVie() > 0){
            System.out.println("Bravo a toi :" + this.joueur1.getNom());
        }else{
            System.out.println("Bravo a toi :" + this.joueur2.getNom());
        }
    }

//GETTERS AND SETTERS


    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }
}
