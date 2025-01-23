package com.modelClass;

public class Main {
    public static void main (String[] args)
    {
        //System.out.println("Hello World!");

        //ex1
        Book b1=new Book("Science", "Kalam", 365);

        //ex2
        Car c1=new Car("Jaguar", 2020, true);
        System.out.println("The model is "+c1.model+" and condition of IsElectric is " +c1.isElectric);

        //ex3
        Calculator calc=new Calculator();
        double sum=calc.add(5.5,8.5);
        System.out.println("The sum is "+sum);

        //ex4
        BankAccount account= new BankAccount("Kishore",75000000.00);
        account.deposit(1000000.00);
        System.out.println("The new balance is "+account.getBalance());
        boolean canWithdraw = account.withdrawSuccessful(95000000.00);
        System.out.println("Withdraw status "+canWithdraw);

        //ex5
        Library lib = new Library();
        System.out.println("Adding a new book: " + lib.addBook(b1));

        //ex6
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("pen", 1.99);
        Item item2 = new Item("pencil", 0.50);
        Item item3 = new Item("ink", 3.50);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        //ex7:
        Course course = new Course("java");
        Student student1 = new Student("arun", 20);
        Student student2 = new Student("bill", 22);

        //ex8:
        Team team = new Team("Champs");
        Player player1 = new Player("leo", "Defender");
        Player player2 = new Player("joseph", "Goalkeeper");

        //ex9:
        Animal dog = new Dog("brownie", 5);
        System.out.println(dog.sound());
        Animal cat = new Cat("jim", 2);
        System.out.println(cat.sound());

        //ex10:
        Truck truck = new Truck("Scorpio", "zzz", 2021, 1.5);
        System.out.println(truck.getDescription());


    }
}


