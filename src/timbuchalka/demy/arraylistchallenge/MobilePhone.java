package timbuchalka.demy.arraylistchallenge;

import java.util.Objects;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public void choiceInstruction() {
        boolean quit = false;
        while (!quit) {
            printInstruction();
            System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    choiceInstruction();
                    break;
                case 1:
                    contacts.printContactsList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContactList();
                    break;
                case 4:
                    removeContactList();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }

    }

    public void addNewContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.next();
        if (contacts.onFile(name)) {
            System.out.println("This contact already exist, enter another name");
        } else {
            contacts.storeContact(name);
            System.out.println("Contact " + name + " is added");
        }
    }

    public static void updateContactList (){
        boolean quit = contacts.isEmptyList();
        while (!quit) {
            System.out.println("Enter name you want to change: ");
            String current = scanner.next();
            if (contacts.onFile(current)){
                System.out.println("Enter name you want to add ");
                String newContact = scanner.next();
               contacts.modifyItem(current, newContact);
                System.out.println("");
               quit=true;
            } else if (Objects.equals(current, "0")){
                printInstruction();
            }  else {
                System.out.println("There is no contact with this name. Enter '0' if you want to quit. ");
            }
        }

    }


    public static void printInstruction(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the contact list.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To update existing contact.");
        System.out.println("\t 4 - To remove contact.");
        System.out.println("\t 5 - To search for an contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void removeContactList(){
        boolean quit = contacts.isEmptyList();
        while (!quit) {
            System.out.println("Enter name you want to remove: ");
            String currentContact = scanner.next();
            if (contacts.onFile(currentContact)) {
                contacts.removeContact(currentContact);
                quit=true;
            } else if (Objects.equals(currentContact, "0")){
                printInstruction();
            } else {
                System.out.println("There is no contact with this name. Enter '0' if you want to quit. ");
            }

        }



    }

}
