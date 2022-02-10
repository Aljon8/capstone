package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner appScanner =new Scanner(System.in);
        ContactList myContactList = new ContactList();
        int i=0;
        while(i==0) {
            System.out.println("Options: [1] Display all contacts - [2] Add Contact - [3] Update Contact - [4] Remove contact - [5] Search contact - [6] Close app");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("What would you like to do?");
            int n = Integer.parseInt(appScanner.nextLine());
            if (n == 1) {
                System.out.println("[Notification] You have " + myContactList.getContactList().size() + " contact(s).");
                ArrayList<Contact> contact = myContactList.viewContacts();
                for(Contact each: contact) {
                    System.out.println(myContactList.getContactList().indexOf(each)+1 + ". " +each.getName() + " - " + each.getPhoneNumber());
                }
            }if (n == 2) {
                Contact contact = new Contact();
                System.out.println("[Add contact]");
                System.out.println("Enter contact name: ");
                contact.setName(appScanner.nextLine());
                System.out.println("Enter contact address: ");
                contact.setAddress(appScanner.nextLine());
                System.out.println("Enter contact email: ");
                contact.setEmail(appScanner.nextLine());
                System.out.println("Enter contact phone number: ");
                contact.setPhoneNumber(Long.parseLong(appScanner.nextLine()));
                myContactList.addContact(contact);
                System.out.println("[Notification] New contact has been added");
                myContactList.displayNewContact(contact);
            }if (n == 3) {
                System.out.println("[Update Contact]");
                System.out.println("Enter existing contact name: ");
                String inputString = (appScanner.nextLine());
                Contact updatedContact = new Contact();
                myContactList.updateContact(inputString, updatedContact);
                System.out.println("Enter contact name: ");
                updatedContact.setName(appScanner.nextLine());
                System.out.println("Enter contact address: ");
                updatedContact.setAddress(appScanner.nextLine());
                System.out.println("Enter contact email: ");
                updatedContact.setEmail(appScanner.nextLine());
                System.out.println("Enter contact phone number: ");
                updatedContact.setPhoneNumber(Long.parseLong(appScanner.nextLine()));
                System.out.println("[Notification] New contact has been added");
                myContactList.displayNewContact(updatedContact);

            }if (n == 4) {

                System.out.println("[Remove Contact]");
                System.out.println("Enter existing contact name: ");
                String inputString = (appScanner.nextLine());
                System.out.println("Are you sure you want to remove '" + inputString.substring(0, 1).toUpperCase()+inputString.substring(1) + "' from your contacts? Y/N");
                char decision = appScanner.nextLine().toLowerCase().charAt(0);
                if (decision == 'y') {
                    boolean removeDecision = myContactList.removeContact(inputString);
                    if (removeDecision)
                        System.out.println("[Notification] Contact removed");
                    else
                        System.out.println("Contact is not found");
                }
                if (decision == 'n') {
                    System.out.println("Ok.");
                }
                }
//            if (n == 5) {
//                System.out.println("[Search Contact]");
//                System.out.println("Enter existing contact name:");
//                String inputString = (appScanner.nextLine());
//                myContactList.searchContact(inputString);
//
//            }
            if (n == 6) {
                System.exit(0);

            }

        }
    }
}
