

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import Proper.Xls_Reader;




public class Reading_XLS_Files {

   // POI API integration http://poi.apache.org/
	
	//http://poi.apache.org/spreadsheet/quick-guide.html
	
	public ArrayList<String> aRowData(int rowNo){
		Xls_Reader datatable = new Xls_Reader("C:\\Users\\user\\Desktop\\import contact fomats\\Book1.xlsx");
		int column = datatable.getColumnCount("Sheet1");
		ArrayList<String> dataHolder= new ArrayList<String>();
		for(int i=1; i<=rowNo;i++)
		{
			for(int j=0; j<column;j++)
			{
				dataHolder.add(datatable.getCellData("Sheet1", j, i));			
			}
	   }
		return dataHolder;
	}
	
	public static void main(String[] args) {		
	Xls_Reader datatable = new Xls_Reader("C:\\Users\\user\\Desktop\\import contact fomats\\Book1.xlsx");
	int rowone = datatable.getRowCount("Sheet1");
	int column = datatable.getColumnCount("Sheet1");
	System.out.println("Column : ="+column);
	System.out.println("Row Count: ="+rowone);	
	ArrayList<String> dataHolder = new ArrayList<String>();
	List<ArrayList<String>> finaldata = Arrays.asList(dataHolder);
	System.out.println("final data ="+finaldata);
	for(int i=1; i<=rowone;i++)
	{
		
		for(int j=0; j<column;j++)
		{
			dataHolder.add(datatable.getCellData("Sheet1", j, i));			
		}
		    	      
	       
   }
	
	
	Iterator<ArrayList<String>> iterator = finaldata.iterator();
	while (iterator.hasNext()) {
		System.out.println("Iterator Next="+iterator.next());
	}

		System.out.println("#3 for advance");
		for (ArrayList<String> temp : finaldata) {
			System.out.println("temp= "+temp);
		}

		System.out.println("#4 while");
		int k = 0;
		while (k < finaldata.size()) {
			System.out.println(finaldata.get(k));
			k++;
		}
		
 }
}
