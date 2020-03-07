package IoStream1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {
	public static void main(String[] args) {
		try {
			String sourcepath="C://Users/admin/Desktop/neha.txt";
			String destinationrpath="C:\\Users\\admin\\eclipse-workspace\\IoStream\\abc.text";
			FileInputStream fis=new FileInputStream(sourcepath);
			FileOutputStream fos=new FileOutputStream(destinationrpath);
            int i=0;
            while((i=fis.read())!=-1) {
            	fos.write(i);
            	
            }
            fis.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
			
		}
	}

}
