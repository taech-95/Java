import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " Items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findGroceryItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position, newItem);
        }
    }


    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item at position " + (position + 1)+ " was modified");
    }

    public void removedGroceryItem(String item){
        int position = findGroceryItem(item);
        if(position>=0){
            removedGroceryItem(position);
        }
    }
    public void removedGroceryItem(int position){
        groceryList.remove(position);
    }



    private int findGroceryItem(String item){
       return groceryList.indexOf(item);
    }

    public boolean onFile(String searchItem){
        int position = findGroceryItem(searchItem);
        if(position>=0){
            return true;
        }
        else{
            return false;
        }
    }


}
