package IoStream1;

import java.io.File;

public class ExcelPoi {
	public static void main(String[] args) {
		File oldFile=new File("xyz.txt");
		File newFile=new File("xyz1.txt");
		
		System.out.println(oldFile.renameTo(newFile));
		
		
	}

}

