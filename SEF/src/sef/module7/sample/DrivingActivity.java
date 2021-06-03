package sef.module7.Activity;

public class DrivingActivity {
    public static void main(String[] args) {
        Car car = new Car();
        Motocycle motocycle = new Motocycle();
        Driver driver = new Driver("Eldar");

        driver.setDriversMoving(car);
        driver.driversStartsDriving();

        driver.setDriversMoving(motocycle);
        driver.driversStartsDriving();
    }
}
