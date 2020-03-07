package IoStream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FR {
	

	public static void main(String[] args) throws IOException {
		Reader fis = new FileReader("xyz.txt");
		BufferedReader br = new BufferedReader(fis);//readline method
		int count = 0;
		String xx =null;
		while ((xx =br.readLine() )!= null) {
			
			if(xx.contains("java")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
