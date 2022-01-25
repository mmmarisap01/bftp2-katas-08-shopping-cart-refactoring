public class Product {
    private final int id;
    private final String name;
    private final double price;
    private final boolean has25PercentDiscount;

    public Product(int id, String name, double price, boolean has25PercentDiscount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.has25PercentDiscount = has25PercentDiscount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean has25PercentDiscount() {
        return has25PercentDiscount;
    }
}
