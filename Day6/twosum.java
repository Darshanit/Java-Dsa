import java.util.*;
class twosum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array values : ");
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element :");
        int target = sc.nextInt();
        
        int left = 0;
        int right = arr.length-1;
        
        while(left<right)
        {
            int sum = arr[left] + arr[right];
            
            if(sum==target)
            {
                System.out.print("Indices: "+left + " " + right);
                return;
            }
            
            else if(sum<target)
            {
                left++;
            }
            
            else{
                right--;
            }
        }
        System.out.println("-1  -1");
    }
}