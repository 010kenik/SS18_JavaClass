package days28;

import java.io.File;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 7. - 오후 12:04:47
 * @subject   폴더  생성, 삭제.
 * @content 
 */
public class Ex02_06 {

	public static void main(String[] args) {
		// c:\\upload 폴더 확인 해서 없으면 폴더 생성
		//                                             있으면 폴더 삭제
		String pathname = ".\\upload";
		File f = new File(pathname);
		
		if (  !f.exists() ) {  // 폴더가 존재하지 않는다. -> 폴더 생성
			
			System.out.println( f.mkdir()  );  // make directory    true
			// f.mkdirs();
			
		} else {  // 폴더 존재한다. -> 폴더 삭제 

			System.out.println( f.delete() );             // boolean  폴더/파일 삭제,   하위 폴더 X
			// f.deleteOnExit(); // void    프로그램 종료할 때 파일 삭제
			                              // 임시파일 생성 -> 사용 ->임시 파일 삭제
			
		}

	} // main

} // class








