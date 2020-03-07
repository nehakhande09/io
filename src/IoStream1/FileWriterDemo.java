package IoStream1;

import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("abc.text");
		fw.write(100);
		fw.write("durga\n software solution");
		fw.write(0);
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
		
		
	}

}
