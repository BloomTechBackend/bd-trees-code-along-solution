package com.bloomtech.trees.autosearch;

import com.bloomtech.trees.autosearch.models.Contact;
import com.bloomtech.trees.autosearch.models.Name;

public class Datasource {
    public final PhoneDirectory oldDirectory = new PhoneDirectory();
    public final PhoneDirectory newDirectory = new PhoneDirectory();

    public Datasource() {
        oldDirectory.addContact(
                new Contact(
                    Name.builder()
                        .withFirstName("Alice")
                        .withLastName("Chan")
                        .build(),
                    "1",
                    "achan@email.com"
                )
        );
        oldDirectory.addContact(
                new Contact(
                        Name.builder()
                                .withFirstName("Amiyah")
                                .withLastName("Coles")
                                .build(),
                        "2",
                        "acoles@email.com"
                )
        );
        oldDirectory.addContact(
                new Contact(
                        Name.builder()
                                .withFirstName("Oliver")
                                .withLastName("Dunn")
                                .build(),
                        "9",
                        "odunn@email.com"
                )
        );
        oldDirectory.addContact(
                new Contact(
                        Name.builder()
                                .withFirstName("Arjan")
                                .withLastName("Piper")
                                .build(),
                        "4",
                        "apiper@email.com"
                )
        );
        oldDirectory.addContact(
                new Contact(
                        Name.builder()
                                .withFirstName("Brett")
                                .withLastName("Riggs")
                                .build(),
                        "7",
                        "briggs@email.com"
                )
        );
        oldDirectory.addContact(
                new Contact(
                        Name.builder()
                                .withFirstName("Brennan")
                                .withLastName("Mosley")
                                .build(),
                        "6",
                        "bmosley@email.com"
                )
        );
        oldDirectory.addContact(
                new Contact(
                        Name.builder()
                                .withFirstName("Amy")
                                .withLastName("Phelps")
                                .build(),
                        "3",
                        "aphelps@email.com"
                )
        );

        newDirectory.addContact(
                new Contact(
                        Name.builder()
                                .withFirstName("Brendan")
                                .withLastName("Healy")
                                .build(),
                        "5",
                        "email@email.com"
                )
        );
        newDirectory.addContact(
                new Contact(
                        Name.builder()
                                .withFirstName("Brian")
                                .withLastName("Andersen")
                                .build(),
                        "8",
                        "email@email.com"
                )
        );
    }
}
