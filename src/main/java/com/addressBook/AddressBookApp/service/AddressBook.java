package com.addressBook.AddressBookApp.service;

import com.addressBook.AddressBookApp.model.Contact;

public class AddressBook {

    Contact contact;

    public void addContact(Contact contact)
    {
        this.contact=contact;
    }

    public void display()
    {
        System.out.println(contact);
    }

}