package com.cda.classes;

public class Personnage {

    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    public Personnage() {
    }

    public Personnage(String nom, int vie, int attaque, int defense) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }

    //Méthodes
    public void attaquer(Personnage adversaire){
        adversaire.setVie(adversaire.getVie()- (this.attaque/adversaire.getDefense()));
    }



    //GETTERS AND SETTERS

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
