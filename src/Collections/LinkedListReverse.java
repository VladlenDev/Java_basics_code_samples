package Collections;

import java.util.LinkedList;

public class LinkedListReverse {

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> lList) {
        LinkedList<Integer> revList = new LinkedList<>();

        lList.descendingIterator().forEachRemaining(revList::add);

        return revList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);
        System.out.println(reverseLinkedList(ll));
    }

}
