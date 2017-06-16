package org.launchcode.java.studios.restaurant;

/**
 * Created by lucke on 5/25/2017.
 */
public class Restaurant {
    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("pizza", "main course", 10);
        MenuItem salad = new MenuItem("salad", "appetizer", 5);

        Menu menu = new Menu();
        menu.addToMenu(pizza);
        menu.addToMenu(salad);

        pizza.printItem();
        salad.printItem();

        menu.printMenu();

        menu.removeFromMenu("pizza");
        menu.printMenu();

    }
}
