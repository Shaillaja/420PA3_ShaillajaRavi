package com.modelClass;
import java.util.ArrayList;
import java.util.List;
class Item {
    private String name;
    private double price;
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
public class ShoppingCart {
    private List<Item> items;
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        for (Item item : items)
        {
            if (item.getName().equals(itemName))
            {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public double getTotalPrice()
    {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

}
