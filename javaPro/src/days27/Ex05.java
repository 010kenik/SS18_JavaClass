package days27;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 6. - 오전 11:25:00
 * @subject   자바 입출력(IO) / 팀  프로젝트 ( 수,목 ) -> 금 발표 + 오라클 수업~
 * @content  스레드/네트워크 X, (람다식과 스트림) X
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * [ 자바의 입출력( IO) ]
		 * 1. Input, Output의 약자
		 *    입력         출력  == 입출력
		 * 2.  컴퓨터 내부(프로그램)     --   데이터를 수,송신  ----    외부 장치( 프로그램)
		 * 3. 예) 
		 *     키보드 장치              --> 데이터 수신 -->    프로그램   -- 데이터 송신 -->       모니터
		 *    (표준입력장치)                                              처리                                            ( 표준출력 장치)
		 *    System.in                                                                                                       System.out
		 *  4. 자바의 모든 입출력은 스트림(stream)이라는 개념으로 이루어진다. 
		 *  5. 스트림 (stream )
		 *      1) 빨대 , 흐르는 물
		 *      2) 단방향이기 때문에 스트림은 2가지 종류가 있다.
		 *            ㄱ. 읽기(입력용) 스트림
		 *            ㄴ.  쓰기(출력용) 스트림 
		 *   6. 자바의 스트림은   2가지 종류 구분
		 *      1) 문자(텍스트) 스트림
		 *          - 읽기(입력용) 스트림 :  최상위 부모 클래스 Reader
		 *          - 쓰기(출력용) 스트림 :  최상위 부모 클래스  Writer
		 *          - 1문자 = 2바이트 = 유니코드 2바이트   == char
		 *          - 한문자, 문자열, 문자 배열
		 *          
		 *          예) XXXReader, XXXWriter
		 *          - FileReader / FileWriter : 파일을 문자로 읽기/쓰기 할 수 있는 스트림
		 *             BufferedReader/ BufferedWriter
		 *             InputStreamReader
		 *          
		 *      2) 바이트(이진) 스트림     
		 *      	 - 읽기(입력용) 스트림 :  최상위 부모 클래스 InputStream
		 *          - 쓰기(출력용) 스트림 :  최상위 부모 클래스 OutputStream
		 *          - FileInputStream / FileOutputStream : 파일을 바이트로 읽기/쓰기 할 수 있는 스트림
		 *          - 1바이트(8비트)
		 *          - 바이트, 바이트 배열, 정수(int)    
		 *          
		 *    6. 보조 스트림 -  어떤 스트림의   IO를 더 쉽도록  보조 역할을 하는 스트림      
		 *         FileReader reader = new FileReader("test.ini");
		            BufferedReader br = new BufferedReader(reader);
		             - BufferedReader 는  문자 스트림이고, 보조 스트림이다. 
		 * */ 

		

	 
	}

}

/*
*                           표 15-1 입력스트림,                  출력 스트림의 종류
*          1) 파일 :            File[InputStream]         File[OutputStream]
*          2) 메모리:          ByteArray[]                  ByteArray[]
*          3) 프로세스:   calc.exe 계산기 실행파일 , 메모리 할당 실행 중이 프로그램을 프로세스
*                                 Piped[]                             Piped[]
*           4)오디오장치:       Audio[]                        Audio[]
*                                    StringBuffer[]             StringBuffer[]
*           
*           등등
*                      표 15-2 InputStream,                   OutputStream 메서드
*                      표 15-5 Reader                             Writer
*                      abstract int read() 1바이트         abstract void write( int b )
*                      int read(byte[] b)                       void write( byte [] b)
*                      int read(byte [] b, int off, int len)  void write(byte [] b, int off, int len)
*                      위의 메서드 이해~~   ***
*               
*                p 871 보조스트림 종류 (  표 15-3 )
*                      입력스트림                출력스트림
*                      Filter[]                   Filter[]            필터를 이용한 입출력 처리
*                      Buffered[]             Buffered[]      버퍼를 이용한 입출력 + 성능 향상
*                      Data[]                    Data[]             기본형 8가지를 데이터 처리하는 기능
*                      Sequence[]               X                   두 개의 스트림을 하나로 연결
*                      LineNumber[]           X                   읽어온 데이터의 라인 번호를 카운트
*                      Object[]                  Object[]          데이터를 객체단위로 읽고 쓰기 ( 직렬화/역직렬화 )
*                            X                      PrintStream    버퍼를 이용하며, 추가적인 print 기능
*                                                    PrintStream   System.out.      printf(), println(), print()
*                     Pushback[]                  X               버퍼를 이용해서 읽어온 데이터를 다시 돌리는 기능
*                                                                              (  unread , push back to buffer )                                     
*                
*               p 872. 문자 스트림 - Reader, Writer
*                2:00 수업 시작~             
*                  Reader                 Writer
*                  File[]                    File[]
*                  CharArray[]          CharArray[]
*                    Piped[]               Piped[]
*                    String[]             String[]
*                  
*/
