package com.bloomtech.trees.autosearch.helpers;

import com.bloomtech.trees.autosearch.models.Name;

import java.util.Comparator;

public class NameComparator implements Comparator<Name> {
    //Compare firstNames while ignoring case
    @Override
    public int compare(Name o1, Name o2) {
        String name1 = o1.getFirstName();
        String name2 = o2.getFirstName();

        return name1.compareToIgnoreCase(name2);
    }
}

