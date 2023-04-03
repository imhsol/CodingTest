import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int max = arr[cnt-1];
		double sum = 0;
		
		for(int i=0;i<cnt;i++) {
			sum += (double)arr[i]/max*100;
		}
		
		System.out.println(sum/cnt);
		
	}
}