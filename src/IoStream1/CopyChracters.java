package IoStream1;

import java.io.FileReader;
import java.io.IOException;

public class CopyChracters {
	public static void main(String[] args) throws IOException {
		
	FileReader rd=null;
	FileWriter rw=null;
	try {
		rd=new FileReader("neha.txt");
		rw=new FileWriter("xyz.txt");
		int c;
		while((c=rd.read())!=-1) {
			rw.rw(c);
		}
		
	}finally {
		if(rd!=null) {
			rd.close();
			}
		if(rw!=null) {
			rw.close();
			
		}
	}}}
		
	
	
		
	


