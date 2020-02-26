package md222xq_assign3;

public class MarsMain {
    public static void main(String[] args) {
        Planet mars = new Planet();

        mars.setName("Mars");
        mars.setPositionFromSun(4);
        mars.setNoOfMoons(2);
        mars.setAphelion(1.666);
        mars.setPerihelion(1.382);



        System.out.println(mars.getName()+":");
        System.out.println("\t Position: " + "\t " + mars.getPositionFromSun());
        System.out.println("\t Moons: " + "\t " + mars.getNoOfMoons());
        System.out.println("\t Aphelion: " + "\t " + mars.getAphelion());
        System.out.println("\t Perihelion: " + mars.getPerihelion());


    }











}
