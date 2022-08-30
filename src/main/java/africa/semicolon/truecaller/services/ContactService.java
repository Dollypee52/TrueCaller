package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;

import java.util.List;

public interface ContactService {

    Contact addContact(String firstName, String lastName, String phoneNumber);

    Contact findById(String id);

    void removeContact(Contact contact);

    void updateContact(String id, String newFirstName,String newLastName,String newPhoneNumber);


     List<Contact > findByName(String Name);
}
