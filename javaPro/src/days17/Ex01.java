package days17;

/**
 * @author ♈ kenik
 * @date 2023. 2. 17. - 오전 6:46:28
 * @subject        단일 상속 / 다중 상속
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		// 9:35 제출
		// 10:33~ 
		//  왜? 자바는 다중 상속을 지원하지 않는가 ? 
		//     ㄴ 서로 다른 ( B, C) 클래스로부터 상속 받은 멤버(필드) 간의 이름이 같은 경우 
		//                 어떻게 구별할 수 있는 방법이 없다. ( 단점, 문제점 ) 
		//      ㄴ c++           다중 상속 가능
		
		//   [ -> 인터페이스를 사용해서 다중 상속을 대신한다.. ]
		

	} // main

} // class


class TV{
	// TV 필드, 생성자, 메서드 
}

class VCR{
	// VCR 필드, 생성자, 메서드	
}

// 단일 상속
/*
class TVCR extends TV{
	// TV 필드,  메서드 
	
}
*/

// 다중 상속 - 문법 에러  => 자바는 다중 상속을 지원하지 않는다. 
/*
class TVCR extends TV,  VCR{
	
}
*/

//인자 == 인수
// 가변인자, 가변인수
// 실인자(실인수), 가인자(가인수)
/*
 * int result = sum( 10, 20);  // 메서드 호출  실인수
 * 
 * 메서드 선언부분 
 * public int sum( int a, int b){  // 가인수 
 *   return a+b;
 * }
 * 
 * */















/*
 * 1조_연봉1조 : [팀장]이태규(*), 김지은(*), 설경인(*), 윤재민(*), 홍성철, 김동현, 박상범 (화요일) 
 * 2조_귀염2(이)조 : [팀장]하동호(*), 박진용(*), 이혜진(*), 김수민, 신희민, 진예림, 박현주 (수요일) 
 * 3조_자바를 잡아 : [팀장]박민종(*), 심성환(*), 이진우(*), 홍찬기(*), 김예지, 하지예 , 탁인혁 (목요일)
 */

