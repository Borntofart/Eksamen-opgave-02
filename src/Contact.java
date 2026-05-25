public class Contact {

    //attributer
    String name;
    String PhoneNumber;

//constructor
    Contact(String name, String PhoneNumber) {
        this.name = name;
        this.PhoneNumber = PhoneNumber;

    }
//Getter
    public String getName(){
        return name;
    }
    public  String PhoneNumber() {
        return PhoneNumber;
    }

    public String toString() {
        return name + " - " + PhoneNumber;
    }

}
