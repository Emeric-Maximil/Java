package com.cda2.classes;

public class Vehicule {
    private String nom;
    private int nbrRoue;
    private int vitesse;

    public Vehicule() {
    }

    public Vehicule(String nom, int nbrRoue, int vitesse) {
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
    }

    //Méthodes
    public void plusRapide(Vehicule pasThis){
        if(this.vitesse > pasThis.getVitesse()){
            System.out.println("Le vehicule le plus rapide est " + this.nom);
        }else {
            System.out.println("Le vehicule le plus rapide est " + pasThis.getNom());
        }


    }
    public void boost(){
        setVitesse(this.vitesse+50);
    }

    public String detect(){
        if (this.nbrRoue > 4){
            return " Autre";
        } else if (this.nbrRoue == 4) {
            return " Voiture";
        } else if (this.nbrRoue >=2) {
            return " Motooo";
        } else if (this.nbrRoue == 1) {
            return " Mono Roue";
        }else {
            return " Shai Hulud";
        }
    }


    //GETTERS & SETTERS

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}
