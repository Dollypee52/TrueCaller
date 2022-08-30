package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.repositories.ContactRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceImplTest {
//    private ContactService contactService;
//    private ContactRepository contactRepository = new ContactRepositoryImp();
//
//    @BeforeEach
//    void setUp(){
//        contactRepository = new ContactRepositoryImp();
//        contactService = new ContactServiceImpl();
//
//    }
//
//
//    @Test
//    void saveContact_findContactReturnContact(){
//            contactService.addContact("Dolapo", "Young", "98256783");
//
//            Contact contact = contactService.findById(1);
//            assertEquals("Dolapo", contact.getFirstname());
//            assertEquals("Young", contact.getLastname());
//            assertEquals("98256783", contact.getPhoneNUmber());
//            assertEquals(1, contactRepository.count());
//        }
//        @Test
//           public void saveContact_deleteContactTest(){
//           contactService.addContact("Shade","Dolapo","098765432");
//           contactService.addContact("funmi","pato","67548932");
//
//           Contact contactToBeDeleted = contactService.findById(1);
//           contactService.removeContact(contactToBeDeleted);
//
//           Contact contact =contactService.findById(1);
//           assertEquals("funmi",contact.getFirstname());
//           assertEquals("pato", contact.getLastname());
//           assertEquals("67548932",contact.getPhoneNUmber());
//           assertEquals(1, contactRepository.count());
//
//
//        }
//        @Test public void saveContact_updateContactTest(){
//            contactService.addContact("Shade","Dolapo","098765432");
//
//            Contact contactToBeUpdated = contactService.findById(1);
//            contactService.updateContact(contactToBeUpdated, "Bose");
//
//            Contact contact =contactService.findById(1);
//            assertEquals("Bose",contact.getFirstname());
//            assertEquals("Dolapo", contact.getLastname());
//            assertEquals("098765432",contact.getPhoneNUmber());
//            assertEquals(1, contactRepository.count());
//
//
//        }
//        @Test public void saveContact_findContactByFirstName(){
//        contactService.addContact("Dolapo","Fola","09876543");
//
//            Contact contact = contactService.findById(1);
//            contactService.findByFirstName("Dolapo");
//
//            assertEquals("Dolapo", contact.getFirstname());
//            assertEquals("Young", contact.getLastname());
//            assertEquals("98256783", contact.getPhoneNUmber());
//            assertEquals(1, contactRepository.count());
//        }
//
//
}