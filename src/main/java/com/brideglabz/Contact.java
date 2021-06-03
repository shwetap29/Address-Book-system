package com.brideglabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String LastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }
    public void setState(String city) {
        this.city = city;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String newZipcode) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String newPhone) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String newEmail) {
        this.email = email;
    }
    @Override
    public  boolean equals(Object obj) {
        boolean result = false;

        if(obj == this) {
            return true;
        }
        Contact contact = (Contact)obj; //casted the above object inside Contact
        if (contact.firstName.equals(this.firstName) && contact.lastName.equals(this.lastName)){
            return true;
        }
        return  result;
    }
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getAddress() + " " + this.getPhoneNumber() + " " + this.getEmail();
    }
}
