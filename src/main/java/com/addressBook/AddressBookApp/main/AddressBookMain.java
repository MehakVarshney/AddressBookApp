package com.addressBook.AddressBookApp.main;

import java.util.Scanner;

import com.addressBook.AddressBookApp.model.Contact;
import com.addressBook.AddressBookApp.service.AddressBook;

public class AddressBookMain {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String fn=sc.next();

        System.out.println("Enter Last Name:");
        String ln=sc.next();

        System.out.println("Enter Address:");
        String add=sc.next();

        System.out.println("Enter City:");
        String city=sc.next();

        System.out.println("Enter State:");
        String state=sc.next();

        System.out.println("Enter Zip:");
        String zip=sc.next();

        System.out.println("Enter Phone:");
        String phone=sc.next();

        System.out.println("Enter Email:");
        String email=sc.next();

        Contact c=new Contact(fn,ln,add,city,state,zip,phone,email);

        AddressBook ab=new AddressBook();

        ab.addContact(c);

        ab.display();

    }

}