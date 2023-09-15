import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ans = 0;
		
		if(str.length()==1) {
			ans=1;
			System.out.println(ans);
			return;
		}
		
		for(int i=str.length()-1; i>0; i--) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(i-1);
			
			if(c1=='=') {
				if(i>1 && (c2=='z' && str.charAt(i-2)=='d')) {
					i-=2;
				} else if(c2=='c' || c2=='s' || c2=='z') {
					i--;
				}
			}
			
			else if(c1=='-' && (c2=='c' || c2=='d')) {
					i--;
			}
			
			else if(c1=='j' && (c2=='l' || c2=='n')) {
					i--;
			}
			
			if(i==1) { // 단어 길이 짝수인 경우
				ans++;
			}
			
			ans++;
			
		} //for
		
		System.out.println(ans);
		
	}
	
}