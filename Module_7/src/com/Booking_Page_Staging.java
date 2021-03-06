package com;


import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


import com.*;
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
		    System.out.print("After Funtion: ="+dataHolder);
		if(temp!=null&&temp.size()>0) 
		System.out.print("DATA HOLDER ="+temp.get(k));	
	  /*  driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys(dataHolder.get(1));
	    driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys(dataHolder.get(2));
		driver.findElement(By.xpath("//*[@id='phone_num']")).sendKeys(dataHolder.get(3));
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(dataHolder.get(4));
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys(dataHolder.get(5));
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys(dataHolder.get(6));
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys(dataHolder.get(7));
		driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(dataHolder.get(8));
		driver.findElement(By.xpath("//*[@id='comments']")).sendKeys(dataHolder.get(9));		
		driver.findElement(By.xpath("//*[@id='main_col']/div[2]/div/ul/li[4]/form/div/input")).click();
		driver.findElement(By.xpath("//*[@id='main_col']/div[2]/div/ul/li[5]/div[4]/div[1]")).click();*/
		k++;
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
					    System.out.println("Print available date"+tdElement.getText()); 				 
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
public ArrayList<String> aRowData(int rowNo){
	//Change the file location based on the xlsx file location  
		Xls_Reader datatable = new Xls_Reader("C:\\Users\\user\\Desktop\\import contact fomats\\Book1.xlsx");
		int column = datatable.getColumnCount("Sheet1");
		ArrayList<String> somrProblem= new ArrayList<String>();
		somrProblem.clear();
		if(somrProblem.isEmpty())
		for(int i=1; i<=rowNo;i++)
		{
			for(int j=0; j<column;j++)
			{
				somrProblem.add(datatable.getCellData("Sheet1", j, i));			
			}
	   }		
		System.out.println("["+rowNo+"]Total data b4re rtn--"+somrProblem);
		return somrProblem;
		
	}
	
}

    

