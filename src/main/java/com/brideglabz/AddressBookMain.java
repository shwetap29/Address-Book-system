package com.brideglabz;

import java.util.Scanner;

public class AddressBookMain {
    ContactDetails person;
    Scanner sc = new Scanner(System.in);

    public void addDetails() {
        person = new ContactDetails();

        System.out.println("Enter First name: ");
        String fname = sc.nextLine();
        System.out.println("Enter Last name: ");
        String lname = sc.nextLine();
        System.out.println("Enter First Address: ");
        String address = sc.nextLine();
        System.out.println("Enter City: ");
        String city = sc.nextLine();
        System.out.println("Enter State: ");
        String state = sc.nextLine();
        System.out.println("Enter Zip: ");
        String zip = sc.nextLine();
        System.out.println("Enter Phone number: ");
        String phone = sc.nextLine();
        System.out.println("Enter Your Email: ");
        String email = sc.nextLine();

        person.setFirstName(fname);
        person.setLastName(lname);
        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setZip(zip);
        person.setMobileNumber(phone);
        person.setEmail(email);

    }
     public void editContact() {
        System.out.println("Enter the firstName of the Person");
         String editName = sc.nextLine();
        if (editName.equalsIgnoreCase(person.firstName)) {
            addDetails();
        }else{
            System.out.println("The name does not match the AddressBook");
            System.out.println("Please enter valid First Name");
            editContact();
        }
    }

        }


