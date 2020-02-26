package md222xq_assign3;

import java.util.ArrayList;

public class Planet {
    private String name;
    private int positionFromSun;
    private int noOfMoons;
    private double aphelion;
    private double perihelion;
    private ArrayList<Moon> moons = new ArrayList<>();   //added for section 3.3


    public Planet(){        //added for section 3.3


    }


    public Planet (String name, int positionFromSun, int noOfMoons, double aphelion, double perihelion){
        setName(name);
        setPositionFromSun(positionFromSun);
        setNoOfMoons(noOfMoons);
        setAphelion(aphelion);
        setPerihelion(perihelion);
    }



    public String getName() {

        return name;
    }

    public void setName(String theName) {
            this.name = theName;
            if (name == "") {
                this.name = "Unknown Planet";
            }
            else {
                this.name = theName;
            }
        }


    public int getPositionFromSun() {
        return positionFromSun;
    }

    public void setPositionFromSun (int thePositionFromSun){
        if ( thePositionFromSun < 1 || thePositionFromSun > 9)
            thePositionFromSun = 0;
        positionFromSun = thePositionFromSun;

    }

    public int getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons (int theSetNoOfMoons){
        if (theSetNoOfMoons < 0 || theSetNoOfMoons > 100){
            theSetNoOfMoons = 0;}
        noOfMoons = theSetNoOfMoons;
    }

    public double getAphelion() {
        return aphelion;
    }

    public void setAphelion (double theSetAphelion){
        if (theSetAphelion <0 || theSetAphelion > 50){
            theSetAphelion = 0;}
        aphelion = theSetAphelion;
    }

    public double getPerihelion() {
        return perihelion;
    }

    public void setPerihelion (double theSetPerihelion){
        if(theSetPerihelion<0 || theSetPerihelion>30){
            theSetPerihelion = 0; }
        perihelion = theSetPerihelion;
    }

    public ArrayList<Moon> getMoons() {             //added for 3.3
        return moons;
    }

    public void setMoons(ArrayList<Moon> moons) {
        this.moons = moons;

    }
}

