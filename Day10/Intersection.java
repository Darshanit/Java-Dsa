import java.util.*;

class Intersection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Set<Integer> first = new HashSet<>();
        Set<Integer> intersection = new LinkedHashSet<>();

        // Read first array
        for (int i = 0; i < n; i++) {
            first.add(scan.nextInt());
        }

        // Read second array and find intersection
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (first.contains(num)) {
                intersection.add(num);
            }
        }

        // Print intersection
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}