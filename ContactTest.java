import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    void testValidContact() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Elm St");
        assertNotNull(contact);
    }

    @Test
    void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Elm St"));
    }

    @Test
    void testInvalidPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "John", "Doe", "12345", "123 Elm St"));
    }
}