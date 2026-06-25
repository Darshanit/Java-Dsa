import java.util.*;
class SlidingWindow{
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
        
        for(int i=0;i<=arr.length-k;i++)
        {   
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum=sum+arr[j];
            }
            max = Math.max(sum,max);
        }
        
        System.out.print("Max: "+max);
    }
}