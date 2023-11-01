import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        System.out.println("\nTask 1");

        task1(nums);

        System.out.println("\nTask 2");

        task2(nums);

        List<String> strings = new ArrayList<>(List.of("один", "ds", "ds", "два", "dd","два", "три", "три", "три"));

        System.out.println("\nTask 3");

        task3(strings);

        System.out.println("\nTask 4");

        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        List<Integer> tmp = new ArrayList<>();
        Collections.sort(nums);
        for (Integer num : nums) {
            if (num % 2 == 0 && !tmp.contains(num)) {
                tmp.add(num);
            }
        }
        System.out.println(tmp);
    }

    public static void task3(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (Collections.frequency(strings, strings.get(i)) == 1) {
                System.out.println(strings.get(i));
            }
        }
    }

    public static void task4(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(Collections.frequency(strings, strings.get(i)));
            strings.remove(strings.get(i));
        }
    }
}