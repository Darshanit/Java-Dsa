import java.util.*;

class CheckDupli {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        int k =3;
        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        for(int i =0;i<=n-k;i++){
            boolean result = false;
            for(int j = i;j<i+k;j++){
                if(arr[j] == arr[i+k]){
                    System.out.print(result = true);
                    return;
                }
            }
        }
    }
}