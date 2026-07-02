import java.util.*;

class Union {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(scan.nextInt());
        }

        for (int i = 0; i < n; i++) {
            set.add(scan.nextInt());
        }

        System.out.println(set);
    }
}