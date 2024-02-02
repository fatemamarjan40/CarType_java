package BsAssgnmt;

import java.util.Scanner;

class Car {
    String name;
    String model;
    int year;

    Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String name, String model, int year, int batteryCapacity) {
        super(name, model, year);
        this.batteryCapacity = batteryCapacity;
    }
}

class GasCar extends Car {
    int fuelEfficiency;

    GasCar(String name, String model, int year, int fuelEfficiency) {
        super(name, model, year);
        this.fuelEfficiency = fuelEfficiency;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for ElectricCar
        System.out.print("Enter car type(Electric/Gas): ");
        String CarType = scanner.nextLine();
        
       
        System.out.print("Enter Name: ");
        String electricCarName = scanner.nextLine();
        System.out.print("Enter model: ");
        String electricCarModel = scanner.nextLine();
        System.out.print("Enter year: ");
        int electricCarYear = scanner.nextInt();
        System.out.print("Enter battery capacity(KWh): ");
        int electricCarBatteryCapacity = scanner.nextInt();
        
        // Create an ElectricCar object
        ElectricCar electricCar = new ElectricCar(electricCarName, electricCarModel, electricCarYear, electricCarBatteryCapacity);
        
        System.out.print("Enter car type(Electric/Gas): ");
        scanner.nextLine();// Consume the newline character
        String type = scanner.nextLine();
        
      
        System.out.print("Enter Name: ");
        String gasCarName = scanner.nextLine();
        System.out.print("Enter model: ");
        String gasCarModel = scanner.nextLine();
        System.out.print("Enter year: ");
        int gasCarYear = scanner.nextInt();
        System.out.print("Enter fuel efficiency(MPG): ");
        int gasCarFuelEfficiency = scanner.nextInt();

        
        // Create a GasCar object
        GasCar gasCar = new GasCar(gasCarName, gasCarModel, gasCarYear, gasCarFuelEfficiency);

        // Print information about the vehicles
        System.out.println("\nCar Information:");
        System.out.print( electricCar.year + " ");
        System.out.print( electricCar.name + " ");
        System.out.print( electricCar.model);
        
       System.out.println("\nBattery Capacity: " + electricCar.batteryCapacity+" "+ "KWh");

        System.out.println("\nCar Information:");
        System.out.print(gasCar.year + " ");
        System.out.print(gasCar.name+ " ");
        System.out.print(gasCar.model);
        System.out.println("\nFuel Efficiency: " + gasCar.fuelEfficiency+" "+ "MPG");
    }
}
