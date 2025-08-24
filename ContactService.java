import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact with ID " + contact.getContactId() + " already exists.");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found.");
        }
        contacts.remove(contactId);
    }

    public void updateContact(String contactId, Contact updatedContact) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found.");
        }
        contacts.put(contactId, updatedContact);
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}