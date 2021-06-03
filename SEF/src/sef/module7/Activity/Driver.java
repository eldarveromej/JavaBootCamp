package sef.module7.Activity;

public class Driver {
    private String name;
    private Moving driversMoving;

    public Driver(String name) {
        this.name = name;
    }

    public void setDriversMoving(Moving driversMoving) {
        this.driversMoving = driversMoving;
    }

    public void driversStartsDriving() {
        System.out.println("Driver " + this.name + " ");
        this.driversMoving.drive();
    }

}
