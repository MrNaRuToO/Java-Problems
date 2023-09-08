package pages;
import org.apache.commons.collections4.ListUtils;
import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);

        // Merge lists using Apache Commons Collections
        List<Integer> mergedList = ListUtils.union(list1, list2);

        System.out.println("Merged List: " + mergedList);
    }
}
