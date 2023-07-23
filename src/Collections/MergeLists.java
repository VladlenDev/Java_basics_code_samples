package Collections;

import java.util.ArrayList;
import java.util.List;

public class MergeLists {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        List<String> list2 = new ArrayList<>();
        list2.add("2");

        System.out.println(merge2(list1, list2)); // [1, 2]
    }

    public static List<String> merge2(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

}
