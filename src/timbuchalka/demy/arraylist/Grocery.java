package timbuchalka.demy.arraylist;

import java.util.ArrayList;
import java.util.Arrays;


public class Grocery {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("timbuchalka.src.udemy.arraylist.Grocery item " + (position + 1) + "has been modified to " + newItem);
    }

    public void removeGroceryItem(int position) {
        String removedItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("timbuchalka.src.udemy.arraylist.Grocery item " + removedItem + " was removed from the list");
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}
