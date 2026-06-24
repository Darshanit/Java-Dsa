import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {

            // Find minimum element in current row
            int minCol = 0;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < arr[i][minCol]) {
                    minCol = j;
                }
            }

            // Check if it is maximum in its column
            boolean saddle = true;
            for (int k = 0; k < n; k++) {
                if (arr[k][minCol] > arr[i][minCol]) {
                    saddle = false;
                    break;
                }
            }

            if (saddle) {
                System.out.println("Saddle Point: " + arr[i][minCol]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }
    }
}