package md222xq_assign3;

import java.util.IdentityHashMap;
import java.util.Random;

public class Hero {
    private String name;
    private int xp;
    private int attack;
    private int defence;
    private Weapon weapon;


    public Hero(String name, int xp) {
        this.name = name;
        this.xp = xp;
        this.weapon = null;
    }

    public Hero(String name, int xp, Weapon weapon) {
        this.name = name;
        this.xp = xp;
        this.weapon = weapon;
    }


    public String getName() {
        return name;
    }

    public void setName(String theName) {
        this.name = theName;
    }

    public int getXP() {
        return xp;
    }

    public void setXP(int theXP) {
        this.xp = theXP;
    }


    public void setWeapon (Weapon weapon){
        int power =0;
        this.weapon = weapon;
        this.attack = weapon.getPower();

    }


    public int doAttack() {
        int damage = 0;
        Random dice = new Random();


        if (this.weapon == null) {
            for (int i = 0; i < 3; i++) {
                int random = dice.nextInt(6) + 1;
                damage = damage + random;
            }

        }

        else {

            for (int i = 0; i < weapon.getPower() ; i++) {
                int random = dice.nextInt(6) + 1;
                damage = damage + random;
            }

        }
        return damage;
    }



    public int doDefence(){
        int defence = 0;
        Random dice = new Random();

        for (int i = 0; i < 2 ; i++){
            int random = dice.nextInt(6)+1;
            defence = defence + random;
        }
        return defence;
    }

    public void setDefence(int theDefence){
        this.defence = theDefence;
    }





}