package days27;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 6. - 오전 10:17:50
 * @subject  
 * @content
 *
 */
public class Ex03 {
   //                                   0          1            2             3
	// enum Direction { EAST=100, SOUTH=200, WEST=300, NORTH }
	
	// The constructor Ex03.Direction(int) is undefined
	enum Direction { 
		   EAST(100, ">"), SOUTH(200, "V"), WEST(300, "<"), NORTH(400, "^");
            private final int value;
            private final String symbol;
            /*
			Direction(int value) {
				  this.value= value;
			}
			*/
			Direction(int value, String symbol) {
				this.value = value;
				this.symbol = symbol;
			}
			public int getValue() {
				return this.value;
			}
			public String getSymbol() {
				return this.symbol;
			}
			
			// 추상 메서드 선언할 수 있더라..
			//abstract int test(int v);
	}
	
	/*
	enum Direction { EAST, SOUTH, WEST, NORTH }  열거형(enum) 선언
	     ↓
	클래스 변환
		  ↓
	class Direction{
	     static final Direction EAST = new Direction("EAST");
	     static final Direction SOUTH = new Direction("SOUTH");
	     static final Direction WEST = new Direction("WEST");
	     static final Direction NORTH = new Direction("NORTH");
	}     
	
	enum Direction { EAST(100), SOUTH(200), WEST(300), NORTH(400) }
	    ↓
	클래스 변환
	class Direction{
	     static final Direction EAST = new Direction("EAST");
	     static final Direction SOUTH = new Direction("SOUTH");
	     static final Direction WEST = new Direction("WEST");
	     static final Direction NORTH = new Direction("NORTH");
	     
	     static int value;
	     public Direction(int){
	     
	     }
	} 
	*/
	
	public static void main(String[] args) {
		
		// Direction 이라는 열거형의    ordinal() 메서드는 열거형 상수의 정의된 순서를 반환하는 메서드 
		//                                                                              내가 원하는 정수값으로 설정하고 싶다. 
		// 자바는  (정수값)
		  
		 Direction [] dArr = Direction.values();
		 for (Direction d : dArr) {
			System.out.println( d.name() +" - " + d.getValue() +" - " +d.getSymbol() );
		}
	}

}












