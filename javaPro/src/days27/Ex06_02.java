package days27;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 6. - 오후 12:00:51
 * @subject         Ex06.java          FileReader    days27\Ex01.java 읽어와서 출력
 * @content        Ex06_02.java    FileWriter     days27\Sample.txt 쓰기(파일저장)
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 12:12 수업 시작~
		String fileName = ".\\src\\days27\\Sample.txt";
		try (FileWriter writer = new FileWriter(fileName, true );){ // boolean append
			/*
			writer.append(char c); 
			writer.write(null);
			*/
			//writer.write("kenik");
			//writer.flush(); // 저장 + 스트림 비우기.
			
			//writer.write(100);		// 'd'
			// [Sample.txt]파일           <------- 파일쓰기----   writer 스트림 객체
			//                                                                                       [k e n i k 1 0 0 ]
			
			writer.append("홍길동");
			writer.flush(); // 저장 + 스트림 비우기.
			
			// Sample.txt 파일 +kenik 100 저장된 이유 ? 
			// 자동으로 writer.close()  /  자동으로 flush() 메서드를 호출
			System.out.println( " END ");
		} catch (IOException e) { 
			e.printStackTrace();
		}

	} // main

} // class









