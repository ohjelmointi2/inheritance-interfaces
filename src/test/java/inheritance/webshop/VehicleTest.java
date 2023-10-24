package inheritance.webshop;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    private Vehicle fiesta = new Vehicle("Car", "A car", 1_900.0, "Ford", "Fiesta", 2010);

    @Test
    void vehicleClassMustInheritProductClass() {
        assertTrue((Object) fiesta instanceof Product, "The Vehicle class must inherit the Product class");
    }

    @Test
    void methodsFromSuperClassMustReturnCorrectValues() {
        ProductTest.checkMethod(fiesta, "getTitle", "Car");
        ProductTest.checkMethod(fiesta, "getDescription", "A car");
        ProductTest.checkMethod(fiesta, "getPrice", 1_900.0);
    }

    @Test
    void manufacturerMustBePresentAndReturnTheCorrectValue() {
        ProductTest.checkMethod(fiesta, "getManufacturer", "Ford");
    }

    @Test
    void modelMustBePresentAndReturnTheCorrectValue() {
        ProductTest.checkMethod(fiesta, "getModel", "Fiesta");
    }

    @Test
    void yearMustBePresentAndReturnTheCorrectValue() {
        ProductTest.checkMethod(fiesta, "getYear", 2010);
    }

    @Test
    void toStringMustContainAllFields() {
        String str = fiesta.toString();

        assertTrue(str.contains("Car"));
        assertTrue(str.contains("A car"));
        assertTrue(str.contains("1900"));
        assertTrue(str.contains("Ford"));
        assertTrue(str.contains("Fiesta"));
        assertTrue(str.contains("2010"));
    }
}
