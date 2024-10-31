package Vehicles;

public class Vehicle {
     String make;
     String model;
     int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
    //  Inheritance
    class Car extends Vehicle {
        int numberOfDoors;
        Car(String make, String model, int year, int numberOfDoors) {
            super(make, model, year);
            this.numberOfDoors = numberOfDoors;
        }
        void displayDetail() {
            System.out.println("Car Details \nMake:" + make + "\nModel:" + model + "\nYear:" + year+"\nNumber of Doors:" + numberOfDoors);
        }
        //****************************************************************
        public static void main(String[] args) {
            Car car1 = new Car("Toyota", "Camry", 2022,4);
            car1.displayDetail();
        }
    }





