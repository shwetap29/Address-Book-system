package com.brideglabz;


import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBook addressBook = new AddressBook();
        addressBook.addDetails();

        System.out.println("Address Book data:");
        System.out.println(addressBook.person);

        System.out.println("Enter Choice \n 1. Edit \n 2.Delete");
        int d = sc.nextInt();

        switch (d) {
            case 1:
                addressBook.editContact();
                System.out.println("You have Entered the following data");
                System.out.println(addressBook.person);
                System.out.println("Thank you for Using the Address book System");
                break;
            case 2:
                addressBook.delete();
                System.out.println("Address Book details :"+addressBook.person);
                break;


        }

    }
}



