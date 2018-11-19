import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Map;
import java.util.TreeMap;

public class Contacts {
    private Map<String,Person> contacts;

    public Contacts() {
        contacts = new TreeMap<>();
    }

    public boolean add(Person person) {
        if (person == null) {
            throw new NullPointerException();
        }
        if (contacts.get(person.getEmail()) != null) {
            return false;
        }
        contacts.put(person.getEmail(),person);
        return true;
    }

    public Person get(String email) {
        return contacts.get(email);
    }

    public ObservableList<Person> getList() {
        return FXCollections.observableArrayList(contacts.values());
    }
}
