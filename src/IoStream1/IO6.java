package IoStream1;

import java.io.FileReader;
import java.io.IOException;

public class IO6 {
	public static void main(String[] args) {
		try {
			String srcpath="C://Users/admin/Desktop/neha.txt";
			String destcpath="C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\IoStream\\\\abc.text";
			FileReader fr=new FileReader(srcpath);
			FileWriter fw=new FileWriter(destcpath);
			int i=0;
			while((i=fr.read())!=0) {
				fw.write(i);
				System.out.println((char)i);
				
			}
			
		}catch(IOException e) {
		e.getStackTrace();
		
	
	}
	}

}
