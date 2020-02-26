package md222xq_assign3;

import java.util.ArrayList;

public class MoonsMain {

    public static void main (String[] args){
        Planet mars = new Planet("Mars", 4,2,1.66,1.382);

        Moon Phobos = new Moon();
        Phobos.setName("Phobos");
        Moon Deimos = new Moon();
        Deimos.setName("Deimos");
        ArrayList<Moon> moons = new ArrayList<>();
        moons.add(Phobos);
        moons.add(Deimos);
        mars.setMoons(moons);

        System.out.println("Moons of " + mars.getName() + " :");
        System.out.println("    "+Phobos.getName());
        System.out.println("    "+Deimos.getName());


    }




}
