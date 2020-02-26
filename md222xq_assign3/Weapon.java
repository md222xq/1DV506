package md222xq_assign3;

public class Weapon {
    private String name;
    private int power;      //number of dice to roll


    public Weapon (String name, int power){
        this.name = name;
        this.power = power;
    }


    public String getName(){
        return name;
    }

    public void setName(String theName){
        this.name = theName;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int thePower){
        this.power = thePower;
    }
}