import inheritance.MotoBike;
import inheritance.Bike;

public class Main {

    public static void main(String [] args) {
        Bike bike = new Bike("Darkmagenta", 2 , "Name");
        MotoBike motoBike = new MotoBike("Magenta", 2, "Name");

        motoBike.move();
        bike.move();

        String bikeColor = bike.getColor();
        String motoBikeColor = motoBike.getColor();

        System.out.println(bikeColor);
        System.out.println(motoBikeColor);

        motoBike.getHasEngineProperty();
    }
}
