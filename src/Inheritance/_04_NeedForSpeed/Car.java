package Inheritance._04_NeedForSpeed;

public class Car extends  Vehicle{

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(3);
    }
}
