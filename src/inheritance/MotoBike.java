package inheritance;

public class MotoBike extends Bike {
    public Boolean hasEngine;
    public MotoBike(String color ,int wheels , String name) {
        super(color ,wheels,name);
        this.hasEngine = true;
    }


    @Override
    public void move() {
        System.out.println("DRDRDRDR");
    }

    public void getHasEngineProperty () {
        System.out.println(this.hasEngine);
    }

}
