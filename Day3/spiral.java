// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int row = 3;
        int col = 3;
        
        int top = 0;
        int left = 0;
        int bottom = row -1;
        int right = col - 1;
        
        while(top <= bottom && left <=right){
            //left to right
            for(int i = left; i<=right;i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;
            //top to bottom
            for(int i=top; i<=bottom;i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;
            //right to left
            for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+ " ");
            }
            bottom--;
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
    
}