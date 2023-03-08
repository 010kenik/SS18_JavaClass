package test;

public class 다음에_올_숫자 {

	public static void main(String[] args) {
		 //int [] common = { 1, 2, 3, 4 };           // a+(n-1)d
		   int [] common = { 2, 4, 8};          // a*r^(n-1)

		 System.out.println(  solution(common) );
	}
	
	public static int solution(int[] common) {
		// 등차수열 :  a+(n-1)d
		// 등비수열 :  a*r^(n-1)
        int answer = 0;
        int n = common.length  ;
        int a = common[0];
        int d = common[1]-common[0];          // 공차
        if( (a + (n-1)*d ) == common[n-1]) {  // 등차수열
        	answer = a + (n)*d;
        }else { 											    // 등비수열
        	int r = common[1]/common[0]; // 공비
        	answer = (int) (a*Math.pow(r, n));
        }
        return answer;
    }

}
