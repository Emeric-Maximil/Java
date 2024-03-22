package com.cda.classes;

public class Assassin extends Personnage{
    private int bonusAtt;

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAtt){
        super(nom,vie,attaque,defense);
        this.bonusAtt = bonusAtt;
    }

    @Override
    public void attaquer(Personnage adversaire){
        System.out.println(this.getNom() + " attaque : " + adversaire.getNom());
        int max = 100;
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        if(rand<5){
            System.out.println("Attaque critique augmentation des damages");
            adversaire.setVie(adversaire.getVie() - ((this.getAttaque() + this.bonusAtt) / adversaire.getDefense()));
        }else {
            adversaire.setVie(adversaire.getVie() - (this.getAttaque() / adversaire.getDefense()));
        }
    }

    public int getBonusAtt() {
        return bonusAtt;
    }

    public void setBonusAtt(int bonusAtt) {
        this.bonusAtt = bonusAtt;
    }
}
