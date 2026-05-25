//skal impotere arrayliste det er sådan her
import java.util.ArrayList;


public class PhoneBook {
//laver arraylisten husk den skal være private eller public jeg laver den public fordi jeg gerne vil have fat i den i Main
public ArrayList<Contact> contacts = new ArrayList<>();


//metoder
public void addContact(Contact c){
    contacts.add(c);
}

public Contact findByName(String name) {
    for (Contact c : contacts ) {
        if (c.getName().equals(name)) {
            System.out.println("fandt " + name);
            return c;

        }
    }

    return null; //hvis intet
}

public void visContacts() {
    for (Contact c : contacts) {
        System.out.println(c);
    }
}



}
