package part03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * This class demonstrates how to use the List interface in Java. The List
 * interface is a part of the Java standard library and it defines methods for
 * working with lists. Several classes, such as ArrayList and LinkedList,
 * implement the List interface, so they can be used as a List.
 *
 * It is often a good idea to use the List interface instead of the ArrayList or
 * LinkedList classes directly. This way your code can operate on any type of a
 * list, not just on ArrayLists or LinkedLists. This makes your code more
 * flexible and compatible with code written by other people.
 *
 * See https://stackoverflow.com/a/2575454 for discussion about the topic.
 */
public class Exercise3 {

    /**
     * Uncomment the lines marked with "fixme" and fix compilation errors.
     *
     * When uncommenting the lines one by one, you will notice that the getFirst
     * and getLast methods in this class only accept ArrayLists and LinkedLists and
     * cause compilation errors when given any other type.
     *
     * In this exercise, your task is to fix the methods so that they accept any
     * list of Strings.
     */
    public static void main(String[] args) {
        // A list of programming languages. We don't know the actual type of the list:
        List<String> languages = List.of("java", "python", "javascript", "typescript", "c++", "kotlin", "c#");

        // Two lists with the same content, but known implementations:
        ArrayList<String> array = new ArrayList<>(languages);
        LinkedList<String> linked = new LinkedList<>(languages);

        System.out.println(getFirst(array));
        // System.out.println(getLast(array)); // FIXME: this does not compile

        System.out.println(getLast(linked));
        // System.out.println(getFirst(linked)); // FIXME: this does not compile

        // FIXME: neither of these compile:
        // System.out.println(getFirst(languages));
        // System.out.println(getLast(languages));

    }

    /**
     * Returns the first element of the given list.
     */
    public static String getFirst(ArrayList<String> list) {
        /*
         * Note that this method now takes an {@code ArrayList<String>} as an
         * argument. However, the logic in the method should work with any list.
         *
         * Make this method more flexible by changing the argument to accept any
         * type that implements the List<String> interface.
         */
        return list.get(0);
    }

    /**
     * Returns the last element of the given list.
     */
    public static String getLast(LinkedList<String> list) {
        // Same as above, change this method to accept any type of list.
        return list.get(list.size() - 1);
    }

    /**
     * Bonus 🚀!
     *
     * This method returns a random element from the given list. However, this
     * method is even more flexible than the previous ones, as it can not only be
     * used with lists of Strings, but with lists of any type.
     *
     * In this example the method is generic, which means that it has a type
     * parameter. The type parameter is defined in the method signature and its name
     * is "T", but you can use any name you want. The type parameter is used in both
     * the parameter and return value, so Java knows that the return value is always
     * of the same type as the argument. This way you can call the method with lists
     * of Strings and Java knows it returns a String. Simlarly, with a list of
     * Integers, or any other type, Java knows the return value is of the same type.
     *
     * If you find this kind of stuff interesting, you can read more about generics
     * at dev.java: https://dev.java/learn/generics/intro/. If you rather spend your
     * time on something else, feel free to skip this method 😂.
     */
    public static <T> T getRandom(List<T> list) {
        // The size of the list is used to generate a random index.
        int index = new Random().nextInt(list.size());

        // The type parameter can be used within the method body just like any type.
        T randomElement = list.get(index);
        return randomElement;
    }
}
