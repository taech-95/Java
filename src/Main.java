import java.io.File;
import java.util.*;


interface  Event {
    String message = "An event has been triggered";
    void printMessage();
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Computer computer1 = new Computer();
        computer1.setGPU("Nvidia");
        String computerGPU = computer1.getGPU();
        System.out.println(computerGPU);
        Car car1 = new Car();
        car1.showInfo();
        String [] stringArgs = {"Hello", "World"};
        Integer [] intArgs = {1,2,3,4,5};
        car1.genericMethod(stringArgs);
        car1.genericMethod(intArgs);
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.get(1);
        for (String element: list) {
            System.out.println(element);
        }
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();


        File file = new File( "text");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        if (number == 1) {
            Event event = new Event() {
                @Override
                public void printMessage() {
                    System.out.println(message);
                }
            };
            event.printMessage();
        }
        for (Languages languages: Languages.values()) {
            System.out.println(languages);
        }
    }
}
