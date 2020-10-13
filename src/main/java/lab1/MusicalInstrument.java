package lab1;


public class MusicalInstrument {
    private boolean isPresent;
    private String name;
    private String builders;
    private double price;
    private int yearOfManufacture;
    private double weight;

    public MusicalInstrument(String name,String builders, double price, int yearOfManufacture, double weight) {
        isPresent=true;
        this.name=name;
        this.builders=builders;
        this.price=price;
        this.yearOfManufacture=yearOfManufacture;
        this.weight=weight;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilders() {
        return builders;
    }

    public void setBuilders(String builders) {
        this.builders = builders;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}






