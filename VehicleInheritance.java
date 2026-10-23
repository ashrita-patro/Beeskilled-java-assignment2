class Vehicle {

    void start() {
        System.out.println("Vehicle is starting.");
    }

    void displayType() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {

    @Override
    void displayType() {
        System.out.println("This is a car.");
    }

    void drive() {
        System.out.println("Car is being driven.");
    }
}

class Bike extends Vehicle {

    @Override
    void displayType() {
        System.out.println("This is a bike.");
    }

    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

public class VehicleInheritance {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.displayType();
        car.drive();

        System.out.println();

        Bike bike = new Bike();

        bike.start();
        bike.displayType();
        bike.ride();

        System.out.println();

        // Polymorphism
        Vehicle vehicle = new Car();
        vehicle.displayType();
    }
}