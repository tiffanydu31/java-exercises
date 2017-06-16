package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lucke on 5/22/2017.
 */
public class Menu {

    private final ArrayList<MenuItem> menu;
    private Date lastUpdated;

    public Menu() {
        menu = new ArrayList<>();
        this.setLastUpdated();
    }

    public Menu(ArrayList<MenuItem> m) {
        menu = m;
        this.setLastUpdated();
    }

    private void setLastUpdated() {
        lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void addToMenu(MenuItem m) {
        menu.add(m);
        this.setLastUpdated();
    }

    public void removeFromMenu(String m) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getName().equals(m)) {
                menu.remove(i);
                return;
            }
        }
        this.setLastUpdated();
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void printMenu() {

        System.out.println("last updated: " + lastUpdated + "\n");

        for(MenuItem item : menu) {
            item.printItem();
            System.out.println("\n");
        }
    }
}