package IoStream1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IO5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try { 
			FileInputStream fin=new FileInputStream("C://Users/admin/Desktop/neha.txt");
			BufferedInputStream BufferedinputStream=new BufferedInputStream(fin);
			int i=0;
			while((i=BufferedinputStream.read())!=-1) {
				System.out.print((char)i);
				
			}
			}catch(IOException e) {
		
				
				e.getStackTrace();
		
	}
	}

}
