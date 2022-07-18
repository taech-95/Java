public abstract class Vechicle {
    private int ID;
    private final String brand = "Audi";

    public String getBrand(){
        return brand;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public abstract void drive();
}

