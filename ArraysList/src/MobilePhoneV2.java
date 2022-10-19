import java.util.ArrayList;

public class MobilePhoneV2 {
    private String myNumber;
    private ArrayList<Contacts> contacts;

    public MobilePhoneV2(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contacts>();
    }
    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition  = findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName()+", was not found");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+", was replaced by " + newContact.getName());
        return true;
    }


    public String queryContact(Contacts contacts){
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
        else{
            return null;
        }
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >=0){
            return this.contacts.get(position);
        }
        return null;
    }

    public boolean removeContact(Contacts contacts){
        int foundPosition  = findContact(contacts);
        if(foundPosition<0){
            System.out.println(contacts.getName()+", was not found");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contacts.getName() + " was deleted");
        return true;
    }

    public void printContacts(){
        System.out.println("Contact list");
        for (int i = 0; i < contacts.size() ; i++) {
            System.out.println((i+1)+"." + this.contacts.get(i).getName() +
                                " -> " + this.contacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contacts contact){
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < contacts.size(); i++) {
            Contacts contacts = this.contacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }


}
