package com.modelClass;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String sound();
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public String sound()
    {
        return "Bark";
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age); // Call the superclass constructor
    }
    @Override
    public String sound()
    {
        return "Meow";
    }
}

