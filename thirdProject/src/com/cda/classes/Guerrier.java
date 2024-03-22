package com.cda.classes;

public class Guerrier extends Personnage{

    private int bonusDefense;

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense){
        super(nom,vie,attaque,defense);
        this.bonusDefense = bonusDefense;
    }

    @Override
    public void attaquer(Personnage adversaire){
        System.out.println(this.getNom() + " attaque : " + adversaire.getNom());
        int max = 100;
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        if(rand<5){
            this.setVie(this.getVie()+ this.bonusDefense);
            System.out.println("Gain de vie");
        }
        adversaire.setVie(adversaire.getVie() - (this.getAttaque() / adversaire.getDefense()));
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }
}
