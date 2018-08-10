package pl.bartekk.java8.staticAndDefaultMethod;

public class VehicleImpl implements Vehicle {

    // this class don't have to implement static and default method from interface

    public static void main(String[] args) {
        System.out.println(Vehicle.producer());

        Vehicle vehicle = new VehicleImpl();
        System.out.println(vehicle.getOverview());
    }

}
