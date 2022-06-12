package timbuchalka.demy.arraylistchallenge;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Contacts {

    private static ArrayList <String> contacts = new ArrayList<String>();

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void storeContact (String name){
        contacts.add(name);
    }

    public boolean onFile(String name){
        return findContact(name) >= 0;
    }

    private static void removeContact (int position){
        contacts.remove(position);
    }

    public void removeContact (String name){
        int position = findContact(name);
        if (position >= 0){
            removeContact(position);
            System.out.println("Contact " + name + " has been removed. ");
        }

    }

    private static int findContact(String contactName){
        return contacts.indexOf(contactName);
    }


    public void modifyItem (String oldName, String newName ) {
        int position = findContact(oldName);
        if (position >= 0) {
            contacts.set(position, newName);
            System.out.println("Contact " + (position+1) + " has been modified. " + newName + " was added.");
        }
    }


    private static void modifyItem (int position, String name){
        modifyItem(position, name);

    }

    public void printContactsList(){
        if (contacts.isEmpty()){
            System.out.println("Your contact list is empty right now");
        } else {
            System.out.println("You have " + contacts.size() + " contacts in your phone:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }

    }

    public boolean isEmptyList(){
        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty. Click '0' to choose another instruction");
            return true;
        }
        return false;
    }
}
