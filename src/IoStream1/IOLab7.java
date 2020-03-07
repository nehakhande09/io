package IoStream1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOLab7 {
	public static void main(String[] args) {
		try {
			InputStreamReader inputStreamReader=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(inputStreamReader);
			String name="";
			while(true) {
				System.out.println("Enter website::");
				name=br.readLine();
				System.out.println("you enter"+name);
				if(name.equals("www.javabykiran.com")){
					
					break;
				}
				
				
			}
			
			
			
			
			
	}catch(IOException e) {
		e.printStackTrace();
		
		
	}
	}

}
