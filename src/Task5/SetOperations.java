package Task5;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    static Set<String> intersection(HashSet<String> set1, HashSet<String> set2)
    {
        Set<String> intersectionOfSets = new HashSet<>(set1);
         intersectionOfSets.retainAll(set2);
         return intersectionOfSets;
    }

    static Set<String> union(HashSet<String> set1, HashSet<String> set2)
    {
        Set<String> unionOfSets = new HashSet<>(set1);
        unionOfSets.addAll(set2);
        return unionOfSets;
    }

    static Set<String> differance(HashSet<String> set1, HashSet<String> set2)
    {
        Set<String> differanceOfSets = new HashSet<>(set1);
        differanceOfSets.removeAll(set2);
        return differanceOfSets;
    }

}
