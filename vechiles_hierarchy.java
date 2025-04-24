class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency(double fuelConsumed, double distanceTraveled) {
        return distanceTraveled / fuelConsumed;
    }

    public double calculateDistanceTraveled(double fuelConsumed, double efficiency) {
        return fuelConsumed * efficiency;
    }

    public double calculateMaxSpeed() {
        return 120;
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateMaxSpeed() {
        return 100;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateMaxSpeed() {
        return 180;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateMaxSpeed() {
        return 220;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Volvo", "FH16", 2020, "Diesel");
        Vehicle car = new Car("Honda", "Civic", 2022, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", "YZF-R1", 2023, "Petrol");

        System.out.println("Truck Max Speed: " + truck.calculateMaxSpeed() + " km/h");
        System.out.println("Car Max Speed: " + car.calculateMaxSpeed() + " km/h");
        System.out.println("Motorcycle Max Speed: " + motorcycle.calculateMaxSpeed() + " km/h");

        double truckEfficiency = truck.calculateFuelEfficiency(50, 500);
        double carEfficiency = car.calculateFuelEfficiency(30, 600);
        double motorcycleEfficiency = motorcycle.calculateFuelEfficiency(10, 200);

        System.out.println("Truck Fuel Efficiency: " + truckEfficiency + " km/l");
        System.out.println("Car Fuel Efficiency: " + carEfficiency + " km/l");
        System.out.println("Motorcycle Fuel Efficiency: " + motorcycleEfficiency + " km/l");

        System.out.println("Truck Distance Traveled: " + truck.calculateDistanceTraveled(50, truckEfficiency) + " km");
        System.out.println("Car Distance Traveled: " + car.calculateDistanceTraveled(30, carEfficiency) + " km");
        System.out.println("Motorcycle Distance Traveled: " + motorcycle.calculateDistanceTraveled(10, motorcycleEfficiency) + " km");
    }
}
