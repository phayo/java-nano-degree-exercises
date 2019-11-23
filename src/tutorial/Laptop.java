package tutorial;

public class Laptop {
    private String harddisk;
    private String model;
    private boolean faulty;

    public Laptop(String hdd, String model) {
        this.harddisk = hdd;
        this.model = model;
        this.faulty = false;
    }

    public Laptop() {
    }

    public String getHdd() {
        return harddisk;
    }

    public void setHdd(String hdd) {
        this.harddisk = hdd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFaulty() {
        return faulty;
    }

    public void setFaulty() {
        this.faulty = !faulty;
    }
}
