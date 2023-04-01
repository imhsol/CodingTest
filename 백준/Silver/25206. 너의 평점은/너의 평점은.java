import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			double creditSum = 0;
			double sum = 0;
			
			for(int i=0;i<20;i++) {
				String str = br.readLine();
				
				String grade = str.substring(str.lastIndexOf(" ")+1);
				String creditStr = str.substring(str.indexOf(" ")+1,str.lastIndexOf(" "));
				Double credit = Double.parseDouble(creditStr);

				switch(grade) {
					case "A+": sum += credit*4.5; break;
					case "A0": sum += credit*4.0; break;
					case "B+": sum += credit*3.5; break;
					case "B0": sum += credit*3.0; break;
					case "C+": sum += credit*2.5; break;
					case "C0": sum += credit*2.0; break;
					case "D+": sum += credit*1.5; break;
					case "D0": sum += credit*1.0; break;
					case "F": sum += credit*0.0; break;
					default: continue;
				}
				
				creditSum += credit;
			}
			
			double average = sum/creditSum;
			System.out.println(average);
			br.close();
	}
}