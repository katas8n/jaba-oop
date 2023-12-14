package inheritance;

public class Bike extends Vehicle {
    private String color;
    private int wheels;
    private String name;

    public Bike (String color, int wheels , String name) {
        this.color = color;
        this.wheels = wheels;
        this.name = name;
    }

    public void setColor() {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void getNameOfVehicle() {
        System.out.println("Something");
    }

    public void move() {
        System.out.println("Ia-Ia-ia");
    }
}

