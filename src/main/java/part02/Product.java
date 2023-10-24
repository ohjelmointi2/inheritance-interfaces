package part02;

/**
 * This class represents a product in a webshop application. The class will be
 * used as a base class for various product types in the next parts of the
 * exercise.
 *
 * The product class should have the following instance variables:
 * title (string), description (string) and price (double).
 *
 * You must create a constructor with the following signature:
 * public Product(String title, String description, double price)
 *
 * Store the arguments in the instance variables. Also, create getter methods
 * getTitle(), getDescription() and getPrice() to return the values of the
 * instance variables.
 *
 * Also, create a toString() method that returns a string representation of the
 * product. You can decide yourself how the string should look like, but it must
 * contain the title, description and price of the product.
 */
public class Product {
    /*
     * TODO: instance variables
     * TODO: constructor (String title, String description, double price)
     * TODO: getter methods
     * TODO: toString
     */

    private String title;
    private String description;
    private double price;

    public Product(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [title=" + title + ", description=" + description + ", price=" + price + "]";
    }
}
