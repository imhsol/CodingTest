import java.util.ArrayList;
import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		int ans = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i=0; i<arr.length; i++) {

			String s = arr[i];
			
			ArrayList<Character> list = new ArrayList<>();
			list.add(s.charAt(0));
			
			for(int j=1; j<s.length(); j++) {
				
				char c = s.charAt(j);
				
				if(list.lastIndexOf(c)==j-1) {
					// list의 마지막 문자가 c와 같은 경우
					list.add(c);
				} else if(list.lastIndexOf(c)!=j-1 && !(list.contains(c))){
					// list의 마지막 문자가 c와 다르며 c를 포함하고 있지 않은 경우
					list.add(c);
				}
				
			}
			
			if(list.size()==s.length()) {
				ans++;
			}
			
		} //for
		
		System.out.println(ans);
	}
}