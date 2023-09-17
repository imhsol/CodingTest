import java.util.Arrays;
import java.util.Scanner;

class Main {
	
	public static void main(String[] ars) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toUpperCase();
		
		// 0-25
		int[] arr = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			int num = s.charAt(i); // 65-90
			arr[num-65]++;
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		int cnt = 0;
		int ans = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) {
				cnt++;
				ans = i;
			}
		}

		if(cnt>1) {
			System.out.println("?");
		} else {
			char c = (char)(ans+65);
			System.out.println(c);
		}
		
	}
	
}