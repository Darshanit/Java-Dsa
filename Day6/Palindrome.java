class Palindrome {
    public static void main(String[] args) {
        String str = "racecara";
        int l =0;
        int r = str.length()-1;
        
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                System.out.print("Not palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.print("palindrome");
    }
}