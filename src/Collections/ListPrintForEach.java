package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrintForEach {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Luke, ");
        list.add("I ");
        list.add("am ");
        list.add("your ");
        list.add("father");

        printList(list);
        printListForEach(list);

    }

    public static void printList(List<String> list) {

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public static void printListForEach(List<String> list) {
        list.forEach(System.out::print);
    }

}
