import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(8, 6, 6, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три","два","один","пять"));


    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    private static void task1() {
        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.print(num);
            }
        }
    }

    private static void task2() {
        Collections.sort(nums);
        int prevNum = 0;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num);
                prevNum = num;
            }

        }
    }

    private static void task3() {
        Set<String> strings1 = new HashSet<>(strings);
        System.out.println(strings1);
    }

    private static void task4() {
        Map<String, Integer> string2 = new HashMap<>();


        for (String string: strings) {
            if (!string2.containsKey(string)) {
                string2.put(string, 1);

            }
            else {
                string2.put(string,string2.get(string)+1 );}

        }
        System.out.println("колличество строк "+ string2.keySet() + " = " + string2.values() + " соответственно");

    }


}
