package days28;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 7. - 오전 7:21:41
 * @subject    gab == 510
 * @content  [ RandomAccessFile ]
 *                      랜덤하게       +   접근       + 파일  스트림
 *                      파일의 어느 위치에나 읽기/쓰기가 가능한 장점이 있는 스트림.
 *                      readXXX()
 *                      writeXXX()
 *                      seek(  위치 )
 *                                               
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		String s = "I Love normal Java";
		String q = "javabook";
		
		// RandomAccessFile을 사용해서  파일 쓰기(저장)
		String name = ".\\src\\days28\\ranom.txt";
		String mode = "rw";   // read, write
		try(  RandomAccessFile raf = new RandomAccessFile(name, mode) ) {
			// raf.getFilePointer();  파일 포인터
			raf.writeBytes(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터 치면 진행합니다. ");
		System.in.read(); // 일시 정지
		System.in.skip( System.in.available()  ) ;  // 13, 10 제거
		
		try(  RandomAccessFile raf = new RandomAccessFile(name, mode) ) {
			// 임이의 위치로 FP 이동시킨 후 쓰기
			raf.seek(   7  );  // 파일포인터( file-pointer ) == 파일 위치
			raf.writeBytes( q );
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("> 엔터 치면 진행합니다. ");
		System.in.read(); // 일시 정지
		System.in.skip( System.in.available()  ) ;  // 13, 10 제거
		
		try(  RandomAccessFile raf = new RandomAccessFile(name, mode) ) {
			// 임이의 위치로 FP 이동시킨 후 쓰기
			// I_Love
			raf.seek(   2  );  // 파일포인터( file-pointer ) == 파일 위치
			String line = raf.readLine();
			System.out.println( line );
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" end ");
	}// main

} // class


/*
 *  mode =  "rw"  "r"  "rwd"   "rws"
 *  seek( pos )
 *  writeXXX()
 *  readXXX()
 *  skipBytes( n )  지정된 n 만큼 바이트를 건너뛴는 메서드 
 *  length()  파일의 크기를 반환하는 메서드 ( byte )
 * */







/*
 * 1조_연봉1조          : [팀장]이태규(*), 김지은(*), 설경인(*), 윤재민(*), 홍성철, 김동현, 박상범, 이예진 (화요일)
 * 2조_귀염2(이)조  : [팀장]하동호(*), 박진용(*), 이혜진(*), 김수민, 신희민, 진예림, 박현주 (수요일)
 * 3조_자바를 잡아  : [팀장]박민종(*), 심성환(*), 이진우(*), 홍찬기(*), 김예지, 하지예 , 탁인혁 (목요일)
 */