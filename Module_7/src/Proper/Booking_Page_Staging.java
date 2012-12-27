package Proper;


import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Booking_Page_Staging {
	static int k=1;
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();


	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://staging.setmore.com/bookanappointmentnew.do?uniqueKey=fd52deaf-3f1d-47dc-92b9-4e494f097223";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	
	@Test
	public void testNewtestcaseforsetmore() throws Exception {	
		try{
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id='service']")).click();
		driver.findElement(By.xpath("//*[@id='sf1451346846809348_Testing Sasikala one_15']")).click();				
		driver.findElement(By.xpath("//*[@id='sasikala test']")).click();		
		driver.findElement(By.xpath("//*[@id='date']")).click();
				//System.out.println("coming inside");
				//System.out.println("inside j");
		ArrayList<String> temp=null;
		
		if (isElementPresent( ) )	{
			System.out.println("What row value here="+k);
			temp=	aRowData(k);
		    System.out.print("After Funtion: ="+temp);
		if(temp!=null&&temp.size()>0) 
			k++;
		System.out.println("Will print rowNumber ="+temp.get(0));	
	    driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys(temp.get(0));
	    driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys(temp.get(1));
		driver.findElement(By.xpath("//*[@id='phone_num']")).sendKeys(temp.get(2));
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(temp.get(3));
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys(temp.get(4));
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys(temp.get(5));
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys(temp.get(6));
		driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(temp.get(7));
		driver.findElement(By.xpath("//*[@id='comments']")).sendKeys(temp.get(8));		
		driver.findElement(By.xpath("//*[@id='main_col']/div[2]/div/ul/li[4]/form/div/input")).click();
		driver.findElement(By.xpath("//*[@id='main_col']/div[2]/div/ul/li[5]/div[4]/div[1]")).click();
		
		System.out.println("Before="+(--k)+"-After-"+(++k));
		  }
		}
		catch(Exception e){
			//System.out.println("After the booking");
		e.printStackTrace();
		}  
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
		int iteratingDATA=1;
		
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
		do{
			//System.out.println("Going to execute again iteratingDATA["+iteratingDATA+"]");
			setUp();
			testNewtestcaseforsetmore();
		iteratingDATA++;
		//driver.quit();
		}
		while(iteratingDATA<=1);
	}

		public boolean isElementPresent( ) 
		{ try 
		{ 
			driver.findElement(By.className("datepickerSelected")).isDisplayed();
			driver.findElement(By.className("datepickerSelected")).click();
			//System.out.println("inside text");		
			String foo = driver.findElement(By.xpath("//*[@id='time_sheet']/ul/li")).getText();
			if(foo.equalsIgnoreCase("Non Working Day") || foo.equalsIgnoreCase("No slot available")){
			assertEquals(foo, "Non Working Day");
			assertEquals(foo, "No slot available");
			//System.out.println("non working day");
			driver.quit();
		    return false;
			} else
			{ 
				 System.out.println("coming inside table data");
				 String [] timings={"morning", "afternoon", "evening"};
				 for (String lTimingsBookings : timings) {
					 WebElement dateprint = driver.findElement(By.className(lTimingsBookings));
					 List<WebElement> dp = dateprint.findElements(By.tagName("a")); 
					 for(WebElement tdElement : dp) { 
//					    System.out.println("Print available date"+tdElement.getText()); 				 
					    String[] splittingData=tdElement.getText().split(" ");
					    if(splittingData.length==2){
					    	//System.out.println("coming inside the split");
						    String finalTimePicker = "//*[@id='id_"+splittingData[0]+"_"+splittingData[1]+"']";
						    System.out.println("coming after the split="+finalTimePicker);
						    driver.findElement(By.xpath(finalTimePicker)).click();
						    System.out.println("finalTimePicker="+finalTimePicker);
					    }
					 
					 }
				}
				  
				 return true;
			}
				
		}
		catch (NoSuchElementException e) { 
			//System.out.println("Before booking ");
			return false; } }

            private boolean assertEquals(String foo, String string) {
			if(foo.equalsIgnoreCase("Non Working Day") || foo.equalsIgnoreCase("No slot available") ){return false; }
			else
				return true;
}
            
ArrayList<String> dataHolder = new ArrayList<String>();
 
 /*public void xlsxreader(){
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
            dataHolder.add(datatable.getCellData("Sheet1", j, i));		          		    	      
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
 */

public ArrayList<String> aRowData(int rowNo){
		Xls_Reader datatable = new Xls_Reader("C:\\Users\\user\\Desktop\\import contact fomats\\Book1.xlsx");
		int column = datatable.getColumnCount("Sheet1");
		ArrayList<String> somrProblem= new ArrayList<String>();
		somrProblem.clear();
		if(somrProblem.isEmpty())
			for(int j=0; j<column;j++)
		{
			{
				somrProblem.add(datatable.getCellData("Sheet1", j, rowNo));			
			}
			
	   }	
		
		System.out.println("["+rowNo+"]Total data b4re rtn--"+somrProblem);
		return somrProblem;
	}
	
}

    

