package com.bloomtech.trees.autosearch;

import com.bloomtech.trees.autosearch.models.Contact;
import com.bloomtech.trees.autosearch.models.Name;

import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Datasource dataSource = new Datasource();

        PhoneDirectory oldDirectory = dataSource.oldDirectory;
        PhoneDirectory newDirectory = dataSource.newDirectory;

        newDirectory.addContacts(oldDirectory.getContacts());

        TreeMap<Name, Contact> searchResults = newDirectory.searchContacts("");
        for (Name key : searchResults.keySet()) {
            System.out.println(searchResults.get(key));
        }
    }
}
