import java.util.*;

class EvenOdd {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        int e = 0, o = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arr[i] = even.get(e++);
            else
                arr[i] = odd.get(o++);
        }

        System.out.println(Arrays.toString(arr));
    }
}