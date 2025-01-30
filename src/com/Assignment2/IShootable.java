package com.Assignment2;

public interface IShootable {
    void onHit(int damage);
}

class Player implements IShootable {
    private int health;

    public Player(int health) {
        this.health = health;
    }
    @Override
    public void onHit(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            System.out.println("Player has died!");
        } else {
            System.out.println("Player hit! Health remaining: " + health);
        }
    }
}

class Wall implements IShootable {
    private int durability;

    public Wall(int durability) {
        this.durability = durability;
    }

    @Override
    public void onHit(int damage) {
        durability -= damage;
        if (durability <= 0) {
            durability = 0;
            System.out.println("Wall has been hit!");
        } else {
            System.out.println("Wall hit! Durability remaining: " + durability);
        }
    }
}

class Trap implements IShootable {
    private boolean isArmed;

    public Trap() {
        this.isArmed = true;
    }

    @Override
    public void onHit(int damage) {
        if (isArmed) {
            isArmed = false;
            System.out.println("Trap disarmed!");
        } else {
            System.out.println("Trap is already disarmed.");
        }
    }
}

class Bullet {
    private int damage;

    public Bullet(int damage) {
        this.damage = damage;
    }

    public void shoot(IShootable target) {
        System.out.println("Bullet fired with damage: " + damage);
        target.onHit(damage);
    }
}