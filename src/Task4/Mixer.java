package Task4;

import java.util.LinkedList;

public class Mixer {

    static LinkedList<String> mixList(LinkedList<String> l1, LinkedList<String> l2)
    {
        LinkedList<String> mixedList = new LinkedList<>();
        for (int i = l2.size() - 1; i >= 0; i--)
        {
            mixedList.push(l2.get(i));
            mixedList.push(l1.get(i));
        }
        return mixedList;
    }
}
