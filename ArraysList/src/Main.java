import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList grocerylist = new GroceryList();
    private static  MobilePhoneV2 mobilePhone = new MobilePhoneV2("720840978");

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===============================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println("Your city " + newCity + " already added");
                return false;
            } else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                System.out.println("Your city " + newCity + " successfully added");
                return true;
            }else {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    public static void main(String[] args) {


        LinkedList<String> placeToVisit = new LinkedList<String>();
        placeToVisit.add("Kyiv");
        placeToVisit.add("Lviv");
        placeToVisit.add("Kryvyi Righ");
        printList(placeToVisit);
        placeToVisit.add(1,"Dnipro");
        placeToVisit.add("Donetsk");
        placeToVisit.remove(4);


        boolean quit = false;
        int choice = 0;
        while(!quit){
            printActions();
            System.out.println("Enter your choice: " );
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }





    //---------------------------------------------------------------------------------------------------------------
    private static void updateContact(){
        System.out.println("Enter existing name");
        String name = scanner.nextLine();
        Contacts existingContact =  mobilePhone.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new mobile phone number");
        String newPhoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newPhoneNumber);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Update successfully");
        }
        else{
            System.out.println("Error while updating the record");
        }
    }

    private static void removeContact(){
        System.out.println("Enter existing name");
        String name = scanner.nextLine();
        Contacts existingContact =  mobilePhone.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }
        else{
            System.out.println("Error while updating the record");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing name");
        String name = scanner.nextLine();
        Contacts existingContact =  mobilePhone.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number " + existingContact.getPhoneNumber());

    }
    private static void addNewContact(){
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter new mobile phone number");
        String phone = scanner.nextLine();
        Contacts contacts = Contacts.createContact(name,phone);
        if(mobilePhone.addNewContact(contacts)){
            System.out.println("Contact added: " + name + " -> " + phone);
        }
        else {
            System.out.println("Cannot add, " + name + " already on phone");
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update existing an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }


    /*----------------------------------------------------------------------------------------*/
    public static void addItem(){
        System.out.print("Please enter the grocery Item: ");
        grocerylist.addGroceryItem(scanner.nextLine());
    }


    public static void modifyItem(){
        System.out.print("Enter item number: ");
        String itemNumber = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        grocerylist.modifyGroceryItem(itemNumber,newItem);
    }
    public static void removeItem(){
        System.out.print("Enter item number: ");
        String itemNumber = scanner.nextLine();
        scanner.nextLine();
        grocerylist.removedGroceryItem(itemNumber);
    }
    public static void searchForItem(){
        System.out.print("item to search for:  ");
        String searchItem = scanner.nextLine();
        if(grocerylist.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in out grocery list");
        }
        else{
            System.out.println(searchItem + " is not in our grocery list");
        }

    }

}
