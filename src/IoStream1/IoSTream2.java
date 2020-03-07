package IoStream1;

import java.io.File;

public class IoSTream2 {
	public static void main(String[] args) {
		int count=0;
		File f =new File("c:\\selinium");
		String[]s=f.list();
		for(String s1 : s) {
			
			count++;
			System.out.println(s1);
			
			
		}
		
		System.out.println("the total no::"+count);
	}

}
