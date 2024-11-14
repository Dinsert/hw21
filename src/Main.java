import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(-1, 1, -1100, -1111, 500, 4, 5, 5, 6, 7));
        for (Integer num : nums1) {
            if (num % 2 != 0) {
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
        System.out.println();

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

            List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
            Map<String, Integer> wordCounts = new HashMap<>();
            for (String word : strings) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
            for (int count1 : wordCounts.values()) {
                System.out.println(count1);
            }

            List<String> list = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
            Map<String, Integer> map = new HashMap<>();
            for (String arrayList : list) {
                if (!map.containsKey(arrayList)) {
                    map.put(arrayList, 1);
                } else {
                    map.put(arrayList, map.get(arrayList) + 1);
                }
            }
            System.out.println(map.values());

            List<String> stringList = new ArrayList<>(List.of("P", "Pi", "Ivan", "Pp", "02", "Ivan", "P"));
            Set<String> set = new HashSet<>();
            for (String string : stringList) {
                if (!set.contains(string)) {
                    set.add(string);
                } else {
                    set.remove(string);
                }
            }
            System.out.println(set);
        }
    }
}
