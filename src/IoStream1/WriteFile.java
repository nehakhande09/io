package IoStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try {
			String path="C://Users/admin/Desktop/neha.txt";
			FileOutputStream fos=new FileOutputStream(path);
			String s="java by kiran Add-karve nagar pune";
			byte b[]=s.getBytes();
			fos.write(b);
			System.out.println("sucessfully written");
			fos.close();
			}catch(IOException e){
				e.printStackTrace();
			
		}
	}

}
