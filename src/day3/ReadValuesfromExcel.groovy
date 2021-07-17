package day3

import jxl.Sheet
import jxl.Workbook

class ReadValuesfromExcel {

	static void main(args) {
		File myfile= new File("C:\\Users\\ZainabShakkarwala\\Documents\\Python Assignments\\ZainabAssignment.xls")
		Workbook wb = Workbook.getWorkbook(myfile)
		Sheet sh= wb.getSheet(0)
		println ("Value stored at Index 0,0 is " + sh.getCell(0, 1).getContents())
		
		int rowcount= sh.getRows()
		int columncount = sh.getColumns()
		
		println("Rows value is: " + rowcount)
		println("Column value is: " + columncount)
		
		for (def i=0; i<rowcount; i++)
		{
			for (def j=0; j<columncount; j++)
			{
				String cellvalue= sh.getCell(j, i).getContents()
				println("Value stored at $j and $i is: " + cellvalue)
			}
		}
	}
}
