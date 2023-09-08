import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = sc.nextInt();
		
		String ans = s.substring(i-1,i);
		
		System.out.println(ans);
	}
}