package days27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 6. - 오후 3:20:53
 * @subject  
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {
		// 바이트 스트림
		InputStream   is = System.in;
		// [][][]  3바이트
		System.out.print("한글 한 문자 입력 ? ");
		// 바이트 -> 문자 변환 스트림 클래스 InputStreamReader 클래스
		// 보조 스트림 
		InputStreamReader isr = new InputStreamReader(is) ;
		
		// [키보드]  byte ->  System.in 바이트스트림 -> InputStreamREader
		//                                                                          문자 읽어들이는 스트림
		int n = isr.read();
		
		System.out.println(  (char) n );
		
		// [키보드]  byte -> System.in바이트스트림 -> 문자 InputStreamREader -> 문자열 라인 단위 처리 . . 보조스트림BufferedReader
		// BufferedReader		 br = new BufferedReader(new InputStreamReader(System.in));
		// br.readLine();
		
		// BufferedInputSteam/ BufferedOutputStream 보조스트림
		// 바이트 스트림 + 버퍼 기능 처리할 수 있는 보조스트림
		
		/*
		byte [] cbuf = new byte[3];		
		int n = is.read(cbuf);
		System.out.println(  "배열에 저장된 바이트의 수 : "  +  n   );
		
		for (byte b : cbuf) {
			System.out.println(  b  );
		}
		*/
		/*
		String s = new String(cbuf);
		char c =  s.charAt(0);
		System.out.println( c );
		*/
		
		// InputStream[Reader]
		// 문자 스트림
		// 바이트 -> 문자 변환하는 스트림 클래스 
		
		/*
		System.out.print("한 문자 입력 ? ");
		int b =  is.read(); // 1바이트    []
		System.out.println(    (char)b );
		*/

	} // main

} // class












