public class ContactsController {
    private Contacts contacts;
    private Person selectedPerson;

    public ContactsController(Contacts contacts) {
        this.contacts = contacts;
        selectedPerson = new Person();
    }

    public void addPerson(String fname, String lname, String email) {
        Person person = new Person(fname,lname,email);
        contacts.add(person);
    }

    public Person getSelectedPerson() {
        return selectedPerson;
    }

}
