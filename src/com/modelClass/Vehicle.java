package com.modelClass;

 class Vehicle {
     protected String make;
     protected String model;
     protected int year;

     public Vehicle(String make, String model, int year) {
         this.make = make;
         this.model = model;
         this.year = year;
     }

     public String getDescription()
     {
         return "Vehicle: " + make + " " + model + " (" + year + ")";
     }
 }

class Car1 extends Vehicle
{
    private int numberOfDoors;

    public Car1(String make, String model, int year, int numberOfDoors)
    {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Doors: " + numberOfDoors;
    }
}

class Truck extends Vehicle {
    private double payloadCapacity;
    public Truck(String make, String model, int year, double payloadCapacity)
    {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription() + ", Payload Capacity: " + payloadCapacity ;
    }
}

