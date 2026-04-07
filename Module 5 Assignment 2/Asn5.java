import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add 4 items to each
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Mango");

        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(45);

        // Display fruits
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Display numbers
        System.out.println("\nNumbers:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // set() method
        fruits.set(1, "Strawberry");
        numbers.set(1, 50);

        System.out.println("\nAfter set():");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Use remove() method
        fruits.remove(2);
        numbers.remove(3);

        System.out.println("\nAfter remove():");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}