package com.addressBook.AddressBookApp.service;

import java.util.ArrayList;
import com.addressBook.AddressBookApp.model.Contact;

public class AddressBook {

    ArrayList<Contact> list = new ArrayList<>();

    public void addContact(Contact contact)
    {
        list.add(contact);
    }

    public void display()
    {
        for(Contact c : list)
        {
            System.out.println(c);
        }
    }

}