package inheritance.webshop;

/**
 * This class represents a vehicle in a webshop application. Vehicles are
 * products, but they have some additional properties that other products do not
 * have, such as the manufacturer, the model name and the model year.
 *
 * By using inheritance, you can create a Vehicle class that inherits the
 * existing logic from the Product class, and add the additional properties and
 * methods that are specific to vehicles. You can avoid duplicating code and
 * also make the Vehicle class compatible with any code that expects a Product
 * object.
 *
 * In this exercise, you need to make the Vehicle class inherit the Product
 * class. Here, you will need to use the `extends` keyword. You also need to add
 * the following private instance variables to the class: manufacturer (string),
 * modelName (string) and modelYear (int).
 *
 * The constructor of the Vehicle class is already present, but you will need to
 * complete its implementation. Note that the three first arguments are
 * inherited from the Product class, and you need to call the constructor of the
 * Product superclass to initialize them. The three last arguments are specific
 * to the Vehicle class, and you need to create instance variables for them in
 * this class.
 *
 * Like in the Product class, create getter methods for the instance variables.
 * Also, create a toString() method that returns a string representation of the
 * vehicle. You can decide yourself how the string should look like, but it must
 * contain both the product properties and the vehicle properties. You can
 * either use the toString() method of the Product class (super.toString()) to
 * get the product properties, or you can call individual getter methods of the
 * Product class.
 *
 * Read more at https://dev.java/learn/inheritance/
 */
public class Vehicle {

    public Vehicle(String title, String description, double price, String manufacturer, String modelName,
            int modelYear) {
    }
}
