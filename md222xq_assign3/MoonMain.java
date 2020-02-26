package md222xq_assign3;

public class MoonMain {
    public static void main(String[] args) {

        Moon moon = new Moon();
        moon.setName("Ganymede");
        moon.setDiameter(5262);

        System.out.println("Largest moon in the solar system is " + moon.getName() + " which is " + moon.getDiameter() + " km in diameter. " );
    }
}