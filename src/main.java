public class main {

    public static void main (String[] args) {
    PhoneBook phonebook = new PhoneBook();
    phonebook.addContact(new Contact("Tess", "31798799"));
    phonebook.addContact(new Contact("Signer", "45610070"));
    phonebook.addContact(new Contact("Signe", "123456"));
    phonebook.addContact(new Contact("adam", "78985500"));
    phonebook.addContact(new Contact("Lucas","61799999"));



    phonebook.findByName("ben");






    }
}
