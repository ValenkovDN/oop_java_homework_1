public class Chocolate extends Product{


    private String taste;
    private String brand;
    public Chocolate(String name, String brand, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return String.format("%s, со вкусом %s, %s", brand, taste, super.toString());
    }
}