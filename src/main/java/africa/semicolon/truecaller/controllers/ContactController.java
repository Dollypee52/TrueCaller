package africa.semicolon.truecaller.controllers;

import africa.semicolon.truecaller.services.ContactService;
import africa.semicolon.truecaller.services.ContactServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
    public class ContactController {
        private ContactService contactService = new ContactServiceImpl();

        @PostMapping("/contact")
        public String addContact(@RequestBody RequestDto requestDto){
            contactService.addContact(requestDto.getFirstName(), requestDto.getLastName(), requestDto.getPhoneNumber());
            return "Added Successfully";
        }

       @GetMapping("/contact/{firstName}")
        public String findByFirstName(@PathVariable String firstName){
            return contactService.findByName(firstName).toString();
        }

        }
@Data
@AllArgsConstructor
@NoArgsConstructor
class RequestDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;

}


