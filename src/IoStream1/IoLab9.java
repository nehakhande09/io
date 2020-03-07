package IoStream1;

import java.io.Console;

public class IoLab9 {
	public static void main(String[] args) {
	      String str;   
		Console con=System.console();
		if(con == null)    
	        {   
	            System.out.print("No console available");   
	            return;   
	        }   
	        str = con.readLine("Enter your name: ");   
	        con.printf("Here is your name: %s\n", str);   
	   }   
}
		//System.out.println("enter the name");
		///String name=c.readLine();
		//System.out.println("Hello"+name);
	

