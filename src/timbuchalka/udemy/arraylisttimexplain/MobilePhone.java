package timbuchalka.udemy.arraylisttimexplain;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList <Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact (Contact contact){
        if (findContact(contact.getName()) >=0 ){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact (Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; myContacts.size() > i; i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateConract(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }
      this.myContacts.set(foundPosition, newContact);
        return true;
    }
}
