package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact addContact(String firstName, String lastName, String phoneNumber) {
      Contact contact = new Contact(firstName, lastName, phoneNumber);
      contactRepository.save(contact);
      return contact;

    }

    @Override
    public Contact findById(String id) {
        Optional<Contact> found = contactRepository.findById(id);
        if(found.isEmpty()) throw new NullPointerException("No contact found");
        return found.get();
    }

    @Override
    public void removeContact(Contact contact) {
        contactRepository.delete(contact);

    }

    @Override
    public void updateContact(String id, String newFirstName, String newLastName, String newPhoneNumber) {
        Contact contactToBeUpdated = new Contact(newFirstName,newLastName,newPhoneNumber);
        contactToBeUpdated.setId(id);
        contactRepository.save(contactToBeUpdated);
    }

    @Override
    public List<Contact> findByName(String Name) {
        List<Contact> result = new ArrayList<>();
        result.addAll(contactRepository.findByFirstName(Name));
        result.addAll(contactRepository.findByLastName(Name));
        return result;
    }


}
