package md222xq_assign3;

import java.util.ArrayList;

public class StonePlanets {
    public static void main(String[] args) {

        Planet Mercury = new Planet ("Mercury", 1, 0, 0.47, 0.31);
        Planet Venus = new Planet ( "Venus", 2, 0, 0.72, 0.72);
        Planet Earth = new Planet("Earth", 3, 1, 1.0, 0.99);
        Planet Mars = new Planet("Mars", 4, 2, 1.666, 1.382);

        Moon theMoon = new Moon("The Moon");            //create new moon
        Moon phobos = new Moon ("Phobos");
        Moon deimos = new Moon ("Deimos");

        ArrayList<Moon> earthMoon = new ArrayList<>();
        earthMoon.add(theMoon);

        ArrayList<Moon> marsMoon = new ArrayList<>();
        marsMoon.add(phobos);
        marsMoon.add(deimos);

        Earth.setMoons(earthMoon);
        Mars.setMoons(marsMoon);




        Planet[] planets = {Mercury,Venus,Earth,Mars};
        for (int i= 0; i<4; i++){
            System.out.println("Planet " + planets[i].getName() + " has aphelion " + planets[i].getAphelion() +" AU, perihelion " + planets[i].getPerihelion() + " AU and " + planets[i].getNoOfMoons() + " moons." );
            if (planets[i].getNoOfMoons() > 0){
                ArrayList<Moon> moons = planets[i].getMoons();
                for (int k=0; k < planets[i].getNoOfMoons();k++){
                    System.out.println("    "+  moons.get(k).getName());
                }
            }
        }





    }
}
