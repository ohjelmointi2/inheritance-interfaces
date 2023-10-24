package interfaces;

import java.util.Arrays;
import java.util.List;

/**
 * You can use this main method to verify that your changes to the Country class
 * work as expected. Actual automated testing is done using JUnit tests.
 */
public class CountryMain {

    public static void main(String[] args) {
        // https://en.wikipedia.org/wiki/Nordic_countries, 9.8.2023
        Country d = new Country("Denmark", 5_894_687);
        Country f = new Country("Finland", 5_587_442);
        Country i = new Country("Iceland", 354_234);
        Country n = new Country("Norway", 5_509_591);
        Country s = new Country("Sweden", 10_261_767);

        List<Country> countries = Arrays.asList(d, f, i, n, s);
        countries.sort(null); // A null value indicates that the elements' natural ordering should be used

        for (Country c : countries) {
            System.out.println(c);
        }
    }
}
