package IoStream1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelsheetRead {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\admin\\eclipse-workspace\\IoStream\\employee1.xlsx"));  
		//creating workbook instance that refers to .xlsx file  
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		//creating a Sheet object to retrieve the object  
		Sheet sheet=wk.getSheetAt(0);  
		//evaluating cell type   
		FormulaEvaluator formulaEvaluator=wk.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
		for(Cell cell: row)    //iteration over cell using for each loop  
		{  
		switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
		{  
		case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
		//getting the value of the cell as a number  
		System.out.print(cell.getNumericCellValue()+ "\t\t");   
		break;  
		case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
		//getting the value of the cell as a string  
		System.out.print(cell.getStringCellValue()+ "\t\t");  
		break;  
		}  
		}  
		System.out.println();  
		}  
		}  
		 
		
	}


