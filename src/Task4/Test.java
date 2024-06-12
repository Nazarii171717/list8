package Task4;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

    LinkedList<String> l1 = new LinkedList<>();
    LinkedList<String> l2 = new LinkedList<>();
    l1.add("3");
    l1.add("1");
    l1.add("7");
    l1.add("4");

    l2.add("5");
    l2.add("6");
    l2.add("0");
    l2.add("8");

    Mixer.mixList(l1,l2).forEach(System.out::println);
    }}
