package IoStream1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;

public class ExcelSheet2Database {
	public static void main(String[] args) {
		String jdbcURL="jdbc:mysql://localhost:3306/empoyee";
		String username="user";
		String password="password";
		
		String excelpath="employee.xlsx";
		int size=10;
		Connection connection=null;
		try {
			
			long start=System.currentTimeMillis();
			FileInputStream inputstream=new FileInputStream("");
			XSSFworkbook wk=new XSSFworkbook();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
