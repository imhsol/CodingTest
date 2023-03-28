import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
       int[] answer = new int[id_list.length];
        
        //유저 신고 기록
        HashMap<String,Set<String>> reportList = new HashMap<>();
        //유저 신고 횟수
        HashMap<String,Integer> mailCnt = new HashMap<>();
        
        for(int i=0;i<id_list.length;i++) {
        	reportList.put(id_list[i], new HashSet<>());
        	mailCnt.put(id_list[i], 0);
        }
        
        //신고 기록
        for(int i=0;i<report.length;i++) {
        	int n = report[i].indexOf(" ");
        	String reportUser = report[i].substring(0,n);
        	String reportedUser = report[i].substring(n+1);
        	
        	reportList.get(reportedUser).add(reportUser);
        }
        
        //신고 횟수
        for(int i=0;i<id_list.length;i++) {
        	if(reportList.get(id_list[i]).size()>=k) {
        		for(int j=0;j<id_list.length;j++) {
        			if(reportList.get(id_list[i]).contains(id_list[j])==true) {
        				mailCnt.put(id_list[j], mailCnt.get(id_list[j])+1);
        			}
        		}
        	}
        }
        
        for(int i=0;i<id_list.length;i++) {
        	answer[i] = mailCnt.get(id_list[i]).intValue();
        }
        
        return answer;
    }
}