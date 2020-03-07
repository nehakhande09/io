package IoStream1;

import java.io.File;

public class ToDisplayOnlyFileNme {
	public static void main(String[] args) {
		
		int count=0;
		File f=new File("C:\\Users\\admin\\Desktop");
		String[] s=f.list();
		for(String s1 :s) {
			File f1=new File("s");
			{
				count++;
				System.out.println("123");
			}
			if(s1.isEmpty())//isDirectory only repacement
			System.out.println("345");
			
			
			
		}
		System.out.println();
	}

}
