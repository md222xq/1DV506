package md222xq_assign3;

import java.util.Random;

public class Enemy {
    private String name;
    private int xp;
    private int attack;
    private int defence;

    public Enemy (String name, int xp){
        this.name = name;
        this.xp = xp;
    }

    public String getName(){
        return name;
    }

    public void setName(String theName){
        this.name= theName;
    }

    public int getXP(){
        return xp;
    }

    public void setXP (int theXP){
        this.xp = theXP;
    }

    public int doAttack(){
        int damage = 0;
        Random dice = new Random();

        for (int i = 0; i < 3 ; i++){
            int random = dice.nextInt(5)+1;
            damage = damage + random;
        }
        return damage;
    }

    public void setAttack(int theAttack){
        this.attack = theAttack;
    }

    public int doDefence(){
        int defence = 0;
        Random dice = new Random();

        for (int i = 0; i < 4 ; i++){
            int random = dice.nextInt(5)+1;
            defence = defence + random;
        }
        return defence;

    }

    public void setDefence(int theDefence){
        this.defence = theDefence;
    }

}