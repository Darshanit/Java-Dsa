import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        Stack<Character> st = new Stack<>();
        
        for(int i =0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        
        String rev = "";
        while(!st.isEmpty()){
            rev += st.pop();
        }
        
        if(s.equals(rev)){
            System.out.print("Palinedrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}