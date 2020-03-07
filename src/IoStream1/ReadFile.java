package IoStream1;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try {
			String path="C://Users/admin/Desktop/neha.txt";
		    FileInputStream fis=new FileInputStream(path);
			int i=0;
			while((i=fis.read())!=-1){
				char c=(char)i;
				System.out.println(c);
			}
			fis.close();
			
		}catch(IOException e){
			
			e.printStackTrace();
			}
			
		
		
	}
}

