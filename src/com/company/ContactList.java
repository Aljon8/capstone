package com.company;

import java.util.*;

public class ContactList {
    private ArrayList<Contact> contactList = new ArrayList<>();


    public ContactList() {
    }

    public ContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }
    public void addContact(Contact newContact){
       contactList.add(newContact);
    }
    public void displayNewContact(Contact newContact){
        System.out.println("Name: " + newContact.getName());
        System.out.println("Address: " + newContact.getAddress());
        System.out.println("Email: " + newContact.getEmail());
        System.out.println("Phone Number: " + newContact.getPhoneNumber());
    }
    public ArrayList<Contact> viewContacts(){
        return contactList;
    }

    public boolean removeContact(String inputString){
        boolean remove = false;
        for (Contact contact: contactList){
            if(contact.getName().toLowerCase().contains(inputString)){
                remove = true;
                contactList.remove(contact);
                break;
            }
        }
        return remove;

    }
    public boolean updateContact(String inputString, Contact updatedContact) {
        boolean replace = false;
        for (Contact contact : contactList) {
            if (contact.getName().toLowerCase().contains(inputString)) {
                System.out.println("[Notification] Contact found");
                System.out.println("Name: " + contact.getName());
                System.out.println("Address: " + contact.getAddress());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("Phone Number: " + contact.getPhoneNumber());
                replace = true;
                int index = contactList.indexOf(contact);
                contactList.set(index, updatedContact);
            }
        }return replace;
    }
    public boolean searchContact(String inputString){
        boolean search = false;
        for (Contact contact : contactList) {
            if (contact.getName().toLowerCase().contains(inputString)) {
                System.out.println("[Notification] Contact found");
                System.out.println("Name: " + contact.getName());
                System.out.println("Address: " + contact.getAddress());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("Phone Number: " + contact.getPhoneNumber());
                search = true;
            }
        }return search;
    }

}
