// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Leader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[n-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(max);
        for(int i = n-2;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.print(list);
    }
}