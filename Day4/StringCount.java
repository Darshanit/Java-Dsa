import java.util.Scanner;
class StringCount{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] str = s.trim().split(" ");
		System.out.println(str[str.length-1].length());
		}
	}