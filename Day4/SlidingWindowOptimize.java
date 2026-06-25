import java.util.*;
class SlidingWindowOptimize{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array values:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = 3;
        
        int max=0;
        int sum=0;
        for(int i=0;i<k;i++){
			sum += arr[i];
		}
		int max = sum;
		for(int j=k;j<n;j++){
			sum = (sum - arr[j-k])+arr[j];
			max = Math.max(max,sum);
		}
        
        System.out.print("Max: "+max);
    }
}