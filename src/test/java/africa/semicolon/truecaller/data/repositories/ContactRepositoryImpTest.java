package africa.semicolon.truecaller.data.repositories;

import africa.semicolon.truecaller.data.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImpTest {
//    private ContactRepository contactRepository;
//
//    @BeforeEach
//    public void startWithThis() {
//        contactRepository = new ContactRepositoryImp();
//    }
//
//    @Test
//    void saveContact_countIsOneTest() {
//        Contact contact = new Contact();
//        contact.setFirstname("Oyinlola");
//
//        Contact savedContact = contactRepository.save(contact);
//        assertEquals(1, savedContact.getId());
//        assertEquals(1, contactRepository.count());
//    }
//
//    @Test
//    void saveContactTwice_countIsTwoTest() {
//        Contact contact = new Contact();
//        contact.setFirstname("Oyinlola");
//
//        Contact savedContact = contactRepository.save(contact);
//        assertEquals(1, savedContact.getId());
//        Contact savedContact2 = contactRepository.save(contact);
//        assertEquals(2, savedContact2.getId());
//        assertEquals(2, contactRepository.count());
//    }
//
//    @Test
//    void saveContact_findByIdReturnsContact() {
//        Contact contact = new Contact();
//        contact.setFirstname("Oyinlola");
//        Contact contact1 = new Contact();
//        contact1.setFirstname("Abiola");
//
//        Contact savedContact = contactRepository.save(contact);
//        Contact savedContact2 = contactRepository.save(contact1);
//
//        Contact foundContact = contactRepository.findById(1);
//        Contact secondContact = contactRepository.findById(2);
//
//
//        assertEquals(1, foundContact.getId());
//        assertEquals(2, secondContact.getId());
//        assertEquals("Oyinlola", foundContact.getFirstname());
//        assertEquals("Abiola", secondContact.getFirstname());
//    }
//    @Test
//    public void saveContact_findByFirstNameReturnsContactTest(){
//        Contact contact = new Contact();
//        contact.setFirstname("Oyinlola");
//        Contact contact1 = new Contact();
//        contact1.setFirstname("Dolapo");
//
//        Contact savedContact = contactRepository.save(contact);
//        Contact savedContact2 = contactRepository.save(contact1);
//
//        Contact foundContact = contactRepository.findByFirstName("Oyinlola");
//        Contact secondContact = contactRepository.findByFirstName("Dolapo");
//
//
//        assertEquals(1, foundContact.getId());
//        assertEquals(2, secondContact.getId());
//        assertEquals("Oyinlola", foundContact.getFirstname());
//        assertEquals("Dolapo", secondContact.getFirstname());
//    }
//    @Test
//    public void saveContact_updateContactByFirstNameTest(){
//        Contact contact = new Contact();
//        contact.setFirstname("Oyinlola");
//        Contact contact1 = new Contact();
//        contact1.setFirstname("Dolapo");
//
//        contactRepository.save(contact);
//        contactRepository.save(contact1);
//
//        Contact updatedContact = contactRepository.updateContactByFirstName(contact1,"Wale");
//        Contact editedContact = contactRepository.findById(2);
//
//
//        assertEquals("Wale",updatedContact.getFirstname());
//        assertEquals("Wale",editedContact.getFirstname());
//        }
//        @Test
//    public void saveContact_ContactCanBeDeleted(){
//            Contact contact = new Contact();
//            contact.setFirstname("Oyinlola");
//            Contact contact1 = new Contact();
//            contact1.setFirstname("Dolapo");
//
//            Contact savedContact = contactRepository.save(contact);
//            Contact savedContact2 = contactRepository.save(contact1);
//
//            boolean isContactDeleted = contactRepository.deleteContact(contact);
//            assertTrue(isContactDeleted);
//
//            Contact divorcedContact = contactRepository.findById(1);
//            assertEquals(2, divorcedContact.getId());
//            assertEquals("Dolapo", divorcedContact.getFirstname());
//            assertEquals(1,contactRepository.count());
//        }
//        @Test  public void saveContact_updateContactByLastNameTest(){
//            Contact contact = new Contact("Oyinlola", "Michael","0804523456");
//            contact.setLastname("Michael");
//            Contact contact1 = new Contact("Tola","Mogaji","09067453623");
//            contact1.setLastname("Mogaji");
//
//            contactRepository.save(contact);
//            contactRepository.save(contact1);
//
//            Contact updatedContact = contactRepository.updateContactByLastName(contact1,"Shola");
//            assertEquals("Shola",updatedContact.getLastname());
//        }
//        @Test public void saveContact_updateContactByPhoneNumberTest(){
//            Contact contact = new Contact("Oyinlola","Michael","08101654620");
//            contact.setPhoneNUmber("08101654620");
//            Contact contact1 = new Contact("Tola", "Mogaji","07051441713");
//            contact1.setPhoneNUmber("07051441713");
//
//            contactRepository.save(contact);
//            contactRepository.save(contact1);
//
//            Contact updatedContact = contactRepository.updateContactByPhoneNUmber(contact1,"08023306852");
//            assertEquals("08023306852",updatedContact.getPhoneNUmber());
//        }
//        @Test
//           public void saveContact_findByLastNameReturnsContactTest(){
//        Contact contact = new Contact();
//        contact.setFirstname("Oyinlola");
//        contact.setLastname("florence");
//
//        Contact contact1 = new Contact();
//        contact1.setFirstname("Dolapo");
//        contact1.setLastname("Shalewa");
//
//         contactRepository.save(contact);
//         contactRepository.save(contact1);
//
//        Contact foundContact = contactRepository.findByLastName("florence");
//        Contact secondContact = contactRepository.findByLastName("Shalewa");
//
//
//        assertEquals(1, foundContact.getId());
//        assertEquals(2, secondContact.getId());
//        assertEquals("florence", foundContact.getLastname());
//        assertEquals("Shalewa", secondContact.getLastname());
//    }
//
//
//
}
