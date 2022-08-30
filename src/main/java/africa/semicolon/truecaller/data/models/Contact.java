package africa.semicolon.truecaller.data.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Document("Contacts")
public class Contact {
    @Id
    private String id;

    @NonNull
    private String firstname;
    @NonNull
    private String lastname;
    @NonNull
    private String phoneNUmber;

}
