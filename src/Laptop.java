public class Laptop {
    
    private String model;
    private int ram;
    private int hdd;
    private String operatingSystem;
    private String color;

    public Laptop(String model, int ram, int hdd, String operatingSystem,
                    String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Model: " + model +
                ", RAM: " + ram + "GB" +
                ", HDD: " + hdd + "GB" +
                ", OS: " + operatingSystem +
                ", Color: " + color;
    }
}
