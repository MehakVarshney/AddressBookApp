package com.addressBook.AddressBookApp.model;

public class Contact {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phone;
    String email;

    public Contact(String firstName,String lastName,
                   String address,String city,
                   String state,String zip,
                   String phone,String email)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone=phone;
        this.email=email;
    }

    @Override
    public String toString()
    {
        return "First Name: "+firstName+
               "\nLast Name: "+lastName+
               "\nAddress: "+address+
               "\nCity: "+city+
               "\nState: "+state+
               "\nZip: "+zip+
               "\nPhone: "+phone+
               "\nEmail: "+email;
    }

}