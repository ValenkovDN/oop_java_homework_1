public class Juice extends Product{
    private String taste;
    public Juice (String name, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Сок со вкусом %s, %s", taste, super.toString());
    }
}
