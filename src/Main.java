public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Computer computer1 = new Computer();
        computer1.setGPU("Nvidia");
        String computerGPU = computer1.getGPU();
        System.out.println(computerGPU);
    }
}
