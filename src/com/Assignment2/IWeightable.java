package com.Assignment2;
import java.util.ArrayList;
import java.util.List;
interface IWeightable {
    double getWeight();
}

class Cargo implements IWeightable {
    private double weight;

    public Cargo(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

// Person class implementing IWeightable
class Person implements IWeightable {
    private double weight;

    public Person(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

// Luggage class implementing IWeightable
class Luggage implements IWeightable {
    private double weight;

    public Luggage(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
class Airplane {
    private List<IWeightable> weightablesList;

    public Airplane() {
        this.weightablesList = new ArrayList<>();
    }

    public void addWeightable(IWeightable item) {
        weightablesList.add(item);
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (IWeightable item : weightablesList) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void displayTotalWeight() {
        System.out.println("Total Airplane Weight is : " + getTotalWeight() + " kg");
    }
}