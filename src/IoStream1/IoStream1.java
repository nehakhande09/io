package IoStream1;

import java.io.File;
import java.io.IOException;

public class IoStream1 {
	
	public static void main(String[] args) throws IOException {
		File f=new File("abc.text");
		{
		System.out.println(f.exists());
		f.exists();//boolean
		}
		f.createNewFile();//boolean
		System.out.println("1234");
		
	}

}
