import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
		LocalDate date = LocalDate.of(2016, a, b); //2016-05-24
		DayOfWeek dayOfWeek = date.getDayOfWeek(); //TUESDAY
		
		String answer = dayOfWeek.toString().substring(0,3);

		return answer;
    }
}