package pkgPizza;

public class Topping {
    private final String name;
    private double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static final Topping base = new Topping("Base de la Pizza", 30.0);
    public static final Topping tomate = new Topping("Tomate", 5.0);
    public static final Topping queso = new Topping("Queso", 15.0);
    public static final Topping pepperoni = new Topping("Pepperoni", 10.0);
    public static final Topping pepinillo = new Topping("Pepinillo", 3.0);
    public static final Topping jamon = new Topping("Jamon", 5.0);
    public static final Topping cebolla = new Topping("Cebolla", 5.0);
    public static final Topping tocino = new Topping("Tocino", 7.0);
    public static final Topping pinia = new Topping("Piña", 5.0);


    public static Topping[] getAllToppings() {
        return new Topping[]{base, queso, pepperoni, pepinillo, jamon, cebolla, tocino, pinia};
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }

    public final void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
