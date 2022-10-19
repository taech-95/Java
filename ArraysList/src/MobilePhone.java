import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<>();

    public void addContact(Contacts contacts){
       if(!this.contacts.contains(contacts.getName())){
           this.contacts.add(contacts);
       }
    }

    public void modifyContact(Contacts oldContact, Contacts newContact){
        if(newContact.getName()!= oldContact.getName()){
            oldContact.setName(newContact.getName());
        }
    }

    public void removeContact(Contacts contacts){
        this.contacts.remove(contacts);
    }

    public int findContact(Contacts contacts){
        return this.contacts.indexOf(contacts);
    }

    public void printContact(){
        System.out.println("You have " + contacts.size() + " Items in your grocery list");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }



}
