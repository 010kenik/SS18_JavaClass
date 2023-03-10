package days02;

/**
 * @author kenik
 * @date  2023. 1. 27. - 오후 3:18:51
 * @subject      ㄱ. 정수계열   - byte(1), short(2), [int(4)], long(8) 
 * @content 
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// 예) 사람의 나이를 저장하는 age 변수를 선언하고
		//      20 정수로 초기화하고 
		//     "나이=20살" 출력
		
		// 나이 
		// (1) 정수
		// (2) 범위   1 ~ 125
		
		// int,short,byte,long - %d
		byte age = 20;
		System.out.printf("나이=%d살\n", age);
		
		System.out.println("end");
		
		/*
		// 국어 점수를 저장할 변수를 선언
		//  1) 정수               byte, short, int, long
		//            표현 범위    1        2           4   8
		//  byte     [][][][][][][][]  2^8가지 == 256                   -128    ~ 127
		//  short   [][][][][][][][] [][][][][][][][]  2^16가지== 65536 -32768~32767
		//              2^32가지 == 4,294,967,296 == 42억가지    -21억~21억
		//  int        [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]
		//              2^64가지 == 18,446,744,073,709,551,616 == 1800경  -900경~900경 
		//   long    [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]  
		//  2) 범위   0 ~ 100
		
		//  2진수 :  0,1
		//  8진수 : 0,1,2,3,4,5,6,7
		//  10진수 : 0,1,2,3,4,5,6,7,8,9
		//  16진수 : 0,1,2,3,4,5,6,7,8,9, A(10), 11, 12, 13, 14,F(15)
		
		// 진법변환
		// 10진법 <-> 2진수
		// 16진법 <-> 2진수
		
		// []      0, 1        2가지             0/1
		// [][]   00 01 10  11  4가지     0~3

		byte kor = 0;
		kor = 100;
		System.out.printf("kor = %d\n", kor);
		
		// Duplicate local variable kor		 
		kor = 67;
		System.out.printf("kor = %d\n", kor);
		*/

	} // main

} // class










