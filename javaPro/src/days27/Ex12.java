package days27;

import java.io.PrintStream;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 6. - 오후 4:45:46
 * @subject  
 * @content
 *                Piped[Reader]/ Piped[Writer] -  쓰레드 간에 데이터를 주고 받을 때 사용하는 스트림 클래스
 *                
 *                [ 표준 입출력 관련  스트림 ]
 *                1) InputStream   System.in                          <--  표준 입력 장치 
 *                2) PrintStream  System.out     println()/print()/printf() --> 표준 출력 장치
 *                3) PrintStream  System.err                                                    --> 표준 출력 장치
 */
public class Ex12 {

	public static void main(String[] args) {
		// 
		/*
		PrintStream   ps =  System.out;
		
		ps.println("홍길동");
		ps.printf("%s\n", "박현주");
		ps.print(false);
		*/
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
		
		// 화면(콘솔)에 출력
		// 에러 메시지 출력하는 스트림 객체 : err
		System.err.println("X");

	}

}
