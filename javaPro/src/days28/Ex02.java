package days28;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 7. - 오전 10:20:32
 * @subject   [ File 클래스 ]
 * @content  1) 가장 많이 사용되는 입출력 대상( 중요 )
 *                    2) File 클래스는   파일 + 폴더(디렉토리)
 *                    3) 생성자 + 메서드
 *                        File( fileName )
 *                        File( String pathName, String fileName)
 *                                .\src\days28           Ex01.java
 *                        File( File 경로, String fileName)
 *                        File( URI )
 *                        
 *                        getName() 파일명 반환하는 메서드
 *                        getPath()                 경로를 반환하는 메서드 
 *                        getAbsolutePath()          " 
 *                        getCanoicalPath()           "
 *                        
 *                        pathSeparator : 경로(path) 구분자 - 운영체제마다 다른다. 
 *                                  
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		// String pathname = ".\\src\\days28\\Ex01.java";
		String pathname = ".\\src\\days28";
		File parent = new File(pathname);
		
		// System.out.println(    parent.isDirectory()   ); // 디렉토리 true
		// System.out.println(    parent.isFile()   );  // 파일   false
		String child = "Ex01.java";
		File file = new File( parent ,  child );
		System.out.println(   file.getName()  ); // Ex01.java
 		String fileName = file.getName();
 		int pos =  fileName.indexOf(".");
 		System.out.println( fileName.substring(0, pos) );// 순수한 파일명  Ex01
 		System.out.println( fileName.substring(pos) );// 확장자           .java
 		
 		System.out.println(   file.getPath()   );  // .\src\days28\Ex01.java
 		System.out.println(   file.getAbsolutePath()   );  // E:\Class\SS18Class\Workspace\JavaClass\javaPro\.\src\days28\Ex01.java
 		System.out.println(   file.getCanonicalPath()   );  // E:\Class\SS18Class\Workspace\JavaClass\javaPro\src\days28\Ex01.java

 		// 파일이 속해 있는 디렉토리 
 		System.out.println(  file.getParent()  );     // .\src\days28
 		System.out.println(  File.pathSeparator ); // ;                                 :
 		System.out.println(  File.separator );         // \                              /
 		
 		
 		
	} // main

} // class







