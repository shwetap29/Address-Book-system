package com.brideglabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        List<String> person = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Address Book System");

        System.out.println("Enter First name: ");
        String fname = input.nextLine();

        System.out.println("Enter Last name: ");
        String lname = input.nextLine();

        System.out.println("Enter First Address: ");
        String address = input.nextLine();

        System.out.println("Enter City: ");
        String city = input.nextLine();

        System.out.println("Enter State: ");
        String state = input.nextLine();

        System.out.println("Enter Zip: ");
        String zip = input.nextLine();

        System.out.println("Enter Phone number: ");
        String phone = input.nextLine();

        person.add(fname);
        person.add(lname);
        person.add(address);
        person.add(city);
        person.add(state);
        person.add(zip);
        person.add(phone);

        for (String str : person){
            System.out.println(str);
        }
    }
}
