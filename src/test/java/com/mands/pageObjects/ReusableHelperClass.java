package com.mands.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusableHelperClass 
{
	private static long Idle = 100;	
	private static long LongTimeout = 25000;
	public static WebDriver driver;	
	
		
	public void WaitForElementToBePresentAndContinueAfterTimeOut(String elementLocator) throws Exception
    {
    	boolean found = false;
        while (!found)
        {
            try
                {
                    if (driver.findElement(By.xpath(elementLocator)).isDisplayed());
                    {
                        found = true;
                        Thread.sleep(Idle);
                        break;
                    }
                }
            catch(Exception e){ }
         
            if (!found)
            {
                Thread.sleep(Idle);
                Idle = Idle + 1;
                if (Idle > LongTimeout)
                	found = true;
                Thread.sleep(Idle);
                	break;
            }
        }
    }
	
	public boolean IsElementPresent(String xpath)
	{		
		try
		{
			driver.findElement(By.xpath(xpath));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}	
	 
}
