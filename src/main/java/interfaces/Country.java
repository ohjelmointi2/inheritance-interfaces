package interfaces;

/**
 * Improve this class by implementing the Comparable interface. The class should
 * be comparable based on the population of the country.
 *
 * The Comparable interface defines only one method: compareTo. The method
 * should compare the population of the "current" country (this) to the
 * population of the "other" country (the argument of the method). The method
 * should return a negative number if the population of this country is smaller
 * than, a positive number if it is larger than, and 0 if it is equal to the
 * population of the other country.
 */
public class Country {

    private final String name;
    private final int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return this.name + ", population: " + this.population;
    }

    // TODO: implement the compareTo method. You also need to use the `implements`
    // keyword in the class declaration above.
}
