package com.Assignment2;

public class main {
    public static void main (String[] args)
    {

        //ex1:
        Airplane airplane = new Airplane();
        airplane.addWeightable(new Cargo(750.0));
        airplane.addWeightable(new Person(52.0));
        airplane.addWeightable(new Luggage(23.0));
        airplane.addWeightable(new Person(80.0));
        airplane.addWeightable(new Luggage(20.0));
        airplane.displayTotalWeight();

        //ex3:
        Player player = new Player(100);
        Wall wall = new Wall(50);
        Trap trap = new Trap();
        Bullet bullet = new Bullet(20);
        bullet.shoot(player);
        bullet.shoot(wall);
        bullet.shoot(trap);
        bullet.shoot(trap);
        bullet.shoot(wall);
        bullet.shoot(player);

        //ex4
        PayrollSystem payroll = new PayrollSystem();
        payroll.addPayable(new Employee(75000.0));
        payroll.addPayable(new Freelancer(40, 50));
        payroll.addPayable(new Employee(45000.0));
        payroll.addPayable(new Freelancer(20, 40));
        payroll.displayPayroll();
    }
}
