import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(-1, 1, -1100, -1111, 500, 4, 5, 5, 6, 7));
        for (Integer num : nums1) {
            if (num % 2 == 1 || num % 2 == -1) {
                System.out.println(num);
            }
        }

        System.out.println();

        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> treeSet = new TreeSet<>(nums2);
        for (Integer integer : treeSet) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

        System.out.println();

        List<String> strings1 = new ArrayList<>(List.of("P", "Pi", "Ivan", "Pp", "02", "Ivan", "P"));
        List<String> result = new ArrayList<>();
        int count = 0;
        int i = 1;
        while (count < strings1.size() - 1) {
            if (!result.contains(strings1.get(count)) && strings1.get(count).equals(strings1.get(i))) {
                result.add(strings1.get(count));
            }
            if (i == strings1.size() - 1) {
                i = ++count;
            }
            i++;
        }
        strings1.removeAll(result);
        System.out.println(strings1);

        List<String> strings2 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        int counter = 0;
        int amount = 1;
        for (int j = 1; j < strings2.size(); j++) {
            if (strings2.get(counter).equals(strings2.get(j))) {
                strings2.remove(j);
                j--;
                amount++;
            }
            if (j == strings2.size() - 1) {
                System.out.println(amount);
                amount = 1;
                if (counter == strings2.size() - 2) {
                    System.out.println(amount);
                }
                j = ++counter;
            }

        }
    }
}