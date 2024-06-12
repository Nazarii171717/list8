package Task5;
import java.util.HashSet;
public class Test {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add("Black");
        set1.add("Yellow");
        set1.add("Red");
        set1.add("Blue");

        set2.add("Black");
        set2.add("Yellow");
        set2.add("Orange");
        set2.add("Pink");


        System.out.println("Intersection: ");
        SetOperations.intersection(set1, set2).forEach(System.out::println);
        System.out.println();
        System.out.println("Union: ");
        SetOperations.union(set1, set2).forEach(System.out::println);
        System.out.println();
        System.out.println("Difference of 1st with 2nd: ");
        SetOperations.differance(set1, set2).forEach(System.out::println);
        System.out.println();
        System.out.println("Difference of 2nd with 1st: ");
        SetOperations.differance(set2, set1).forEach(System.out::println);
    }
}
