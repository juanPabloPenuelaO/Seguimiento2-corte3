package biConsumer;

public class Cars {
    private String brand;
    private String color;
    private int model;
    private String state;

    public Cars(String brand, String color, int model, String state) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.state = state;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
