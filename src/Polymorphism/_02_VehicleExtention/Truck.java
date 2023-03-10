package Polymorphism._02_VehicleExtention;

public class Truck extends Vehicles {
    public Truck(double fuel, double consumption, int tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }

    @Override
    public double extraConsumption() {
        return 1.6;
    }

    @Override
    public double specificRefueling() {
        return 0.95;
    }
}
