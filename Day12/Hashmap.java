import java.util.*;

class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N Size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}