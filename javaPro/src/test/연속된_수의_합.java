package test;

import java.util.Arrays;

public class 연속된_수의_합 {

	public static void main(String[] args) {
		/*
	   num total 
		3	12	[3, 4, 5]
		5	15	[1, 2, 3, 4, 5]
		4	14	[2, 3, 4, 5]
		5	5	[-1, 0, 1, 2, 3]
		*/
		
//		int [ ] answer = solution(5, 15);
//		int [ ] answer = solution(3, 12);
		int [ ] answer = solution(4, 14);
		System.out.println( Arrays.toString(answer) );
	}
	
    public static int[] solution(int num, int total) {
        
        // 등차수열 : a + (n-1)*d
        int firstTerm ;
        if( num % 2 == 1 ) {
        	firstTerm = total/num - num/2;        	
        }else {
        	firstTerm = total/num - (num/2-1);
        }
        //System.out.println( firstTerm);
        int[] answer = new int[num];
        for (int i = 0; i < answer.length; i++) answer[i] += firstTerm + i;
        return answer;
        
    }

}










