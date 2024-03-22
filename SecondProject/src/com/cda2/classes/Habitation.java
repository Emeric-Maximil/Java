package com.cda2.classes;

public class Habitation {

    private String nom;
    private double largeur;
    private double longueur;

    private int nbrEtage ;

    public Habitation(){
        this.nom = "Rien";
        this.largeur= 1;
        this.longueur= 1;
        this.nbrEtage= 1;
    }
    public Habitation(String nom, double longueur, double largeur, int nbrEtage){
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nbrEtage = nbrEtage;
    }

    public double surface(){
        return this.largeur * this.longueur * this.nbrEtage;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public int getNbrEtage() {
        return nbrEtage;
    }

    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }
}
