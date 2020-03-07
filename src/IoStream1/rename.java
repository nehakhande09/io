package IoStream1;

import java.io.File;

public class rename {
public static void main(String[] args) {
	File folder=new File("C:\\Users\\admin\\Desktop\\new");
	File files[]=folder.listFiles();
	int filecount=0;
	for(int i=0;i<files.length;i++) {
		if(files[i].isFile()) {
		System.out.println("old name"+files[i].getName());
		String newfilename=files[i].getName().replace("z","j");
		System.out.println("new name::"+newfilename);
		File f=new File("C:\\\\Users\\\\admin\\\\Desktop\\new\\"+newfilename);
		files[i].renameTo(f);
		filecount++;
		}
		
		}
	System.out.println("file count::"+filecount);
}
}
