package days27;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 6. - 오전 5:01:56
 * @subject  윤재민 - 예비군 훈련~
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		// 9:45 -> 팀장님 제출 + 통합 ->   9:50 제출..
		// 열거형(Enum) - 서로 관련된 상수를 선언한 것. +  모든 팀 성별(1,0, t/f, 'm'/'f')일관성,표준화 + 편리 + 코딩 가독성  
		
		// 카드 모양
		int cardType = 0 ; // 
		switch (  cardType ) {
		case Card.CLOVER: 			
			break;
		case Card.HEART:  
			break; 
		case 2: // 다이아몬드			
			break;
		case 3: // 스페이스
			break;
		}

	} // main

} // class


// Enum 열거형이름 { 상수1, ... } -> 컴파일 될 때   클래스로 변환..
// 열거형
class Card{
	// final(상수) + static(정적)
	static final int CLOVER=0;  
	static final int HEART=1;
	static final int DIAMOND=2;
	static final int SPACE=3;
}











/*
 * 1조_연봉1조          : [팀장]이태규(*), 김지은(*), 설경인(*), 윤재민(*), 홍성철, 김동현, 박상범, 이예진 	(화요일)
 * 2조_귀염2(이)조  : [팀장]하동호(*), 박진용(*), 이혜진(*), 김수민, 신희민, 진예림, 박현주 					(수요일)
 * 3조_자바를 잡아  : [팀장]박민종(*), 심성환(*), 이진우(*), 홍찬기(*), 김예지, 하지예 , 탁인혁 			(목요일)
 */    