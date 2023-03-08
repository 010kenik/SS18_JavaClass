package days28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author ♈ k§nik
 * @date 2023. 3. 7. - 오후 2:51:10
 * @subject  직렬화 설명
 * @content 
 */
public class Ex04_02 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
 		
		String fileName = ".\\src\\days28\\child.ser";
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child c =  (Child) ois.readObject();
		
		System.out.println(   c.name +" / " + c.age  );
		
		System.out.println(" end ");

	} // main

} // class








