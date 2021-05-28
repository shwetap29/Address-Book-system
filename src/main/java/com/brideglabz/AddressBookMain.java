package com.brideglabz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        ContactDetails person;
        Scanner sc =new Scanner(System.in);

        public void add() {
            person = new ContactDetails();

       System.out.println("Enter First Name: ");
       String fname = sc.nextLine();

       System.out.println("Enter Last Name: ");
        String lname = sc.nextLine();

         System.out.println("Enter Address: ");
         String address = sc.nextLine();

        System.out.println("Enter City: ");
        String city = sc.nextLine();

        System.out.println("Enter State: ");
        String state = sc.nextLine();

        System.out.println("Enter Your Zip: ");
        String zip = sc.nextLine();

        System.out.println("Enter Your MobileNumber: ");
        String Mobile = sc.nextLine();

         System.out.println("Enter Your Email: ");
         String email = sc.nextLine();
            person.setFirstName(fname);
            person.setLastName(lname);
            person.setAddress(address);
            person.setCity(city);
            person.setState(state);
            person.setZipCode(zip);
            person.setPhoneNumber(Mobile);
            person.setEmail(email);

            System.out.println(person);

        }
    }
}


