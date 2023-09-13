import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length()-1;
		
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(len)) {
				System.out.println(0);
				return;
			}
			len--;
		}
		
		System.out.println(1);
	}
	
}