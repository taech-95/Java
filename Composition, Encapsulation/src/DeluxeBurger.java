public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon","White", 14.54 );
        super.addHamburgerAdditiion1("Chips", 2.75);
        super.addHamburgerAdditiion2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAdditiion1(String name, double price) {
        System.out.println("Cannot add additional item to the deluxe burger");
    }

    @Override
    public void addHamburgerAdditiion2(String name, double price) {
        System.out.println("Cannot add additional item to the deluxe burger");
    }

    @Override
    public void addHamburgerAdditiion3(String name, double price) {
        System.out.println("Cannot add additional item to the deluxe burger");
    }

    @Override
    public void addHamburgerAdditiion4(String name, double price) {
        System.out.println("Cannot add additional item to the deluxe burger");
    }
}
