public class Computer {
    private int RAM;
    private String GPU;
    public Computer() {
        System.out.println("Computer is called");
    }


    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }
}
