package com.bloomtech.trees.autosearch;

import com.bloomtech.trees.autosearch.helpers.NameComparator;
import com.bloomtech.trees.autosearch.models.Contact;
import com.bloomtech.trees.autosearch.models.Name;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<Name, Contact> contacts;
    private final String TERMINAL_CHARACTER = "~";

    public PhoneDirectory() {
        contacts = new TreeMap<>(new NameComparator());
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
    }

    public void addContacts(TreeMap<Name, Contact> contacts) {
        this.contacts.putAll(contacts);
    }

    public TreeMap<Name, Contact> getContacts() {
        return contacts;
    }

    public TreeMap<Name, Contact> searchContacts(String searchString) {
        Name searchKey = Name.builder().withFirstName(searchString).build();
        Name endKey = Name.builder().withFirstName(searchString + TERMINAL_CHARACTER).build();

        //return new TreeMap<>(contacts.tailMap(searchKey).headMap(endKey));
        return new TreeMap<>(contacts.subMap(searchKey, endKey));
    }
}
