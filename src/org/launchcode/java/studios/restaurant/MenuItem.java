package org.launchcode.java.studios.restaurant;

/**
 * Created by lucke on 5/22/2017.
 */
public class MenuItem {
    private final String name;
    private final String category;
    private final double price;
    private String description;
    private boolean newlyAdded;

    public MenuItem(String itemName, String itemCategory, double itemPrice) {
        name = itemName;
        category = itemCategory;
        price = itemPrice;
        newlyAdded = true;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String itemDescription) {
        description = itemDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setIsNew(boolean itemIsNew) {
        newlyAdded = itemIsNew;
    }

    public boolean isNew() {
        return newlyAdded;
    }

    public void printItem() {
        System.out.println("name: " + name);
        System.out.println("category: " + category);
        System.out.println("price: " + price);
        System.out.println("description: " + description);
        System.out.println("newly add: " + newlyAdded);
    }
}
