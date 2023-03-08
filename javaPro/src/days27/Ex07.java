package days27;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 6. - 오후 2:21:46
 * @subject  
 * @content            [  메모리 스트림 ]
 *                                - 주로 다른 곳에 입,출력하기 전에     메모리 상에 데이터를 임시로 저장해서 사용할 목적.
 *                                
 *                                Byte                ByteArray[InputStream]/ByteArray[OutputStream]  바이트 스트림  X
 *                                Char                 CharArray[Reader] / CharArray[Writer]  문자 스트림                            X
 *                                String              String[Reader] / String[Writer]  문자 스트림                                          O 
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		// ByteArray[InputStream]/ByteArray[OutputStream]
		byte [] buf = { 0, 1,2,3,4,5,6,7,8,9 }; 
		// byte []  -> bais  메모리 스트림 생성. -> while() 읽기. -> [baos 메모리스트림]  -> byte[]
		//                                                                    쓰기                        toByteArray();
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);  // 읽기 용도 스트림
		ByteArrayOutputStream  baos = new ByteArrayOutputStream();
		int b ;
		while(  ( b =  bais.read() ) != -1 ) {
			System.out.println( b );
			baos.write(b);
		}
		// bais.close() X
		
		byte []  outBuf =  baos.toByteArray();
		
		System.out.println(  Arrays.toString(outBuf) );  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
	} // main

} // class













