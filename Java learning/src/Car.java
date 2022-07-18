public class Car extends Vechicle implements Info{

    private int ID=0;

    public Car(int id) {
        this.ID = id;
    }

    public Car(){

    }

    private int increaseID(int id){
        return id++;
    }

    @Override
    public void drive() {

    }

    @Override
    public void showInfo() {
        System.out.println("Car brand is " + getBrand());
        System.out.println("Car id is " + getID());
    }

    public <T> void genericMethod(T[] inputarray){
        for (T element:inputarray) {
            System.out.println("Here is your element " + element);

        }
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }
}
