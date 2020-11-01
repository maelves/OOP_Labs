public class Car
{
    private String brand;
    private int year_fab;
    private String color;
    private double price;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear_fab() {
        return year_fab;
    }
    public void setYear_fab(int year_fab) {
        this.year_fab = year_fab;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Car(String brand, int year_fab, String color, double price)
    {

        this.brand = brand;
        this.year_fab = year_fab;
        this.color = color;
        this.price = price;
    }

    public int compareTo(Car car) {
        if (price > car.price)
            return -1;
        else if (price == car.price)
            return 0;
        return 1;
    }
}
