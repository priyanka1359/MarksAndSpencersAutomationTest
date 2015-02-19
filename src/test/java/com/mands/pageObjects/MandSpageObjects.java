package com.mands.pageObjects;

import org.openqa.selenium.By;

public class MandSpageObjects extends ReusableHelperClass
{
	
	private String menHeaderMenu = "//a[contains(@id,'SC_Level_1_586')]/span"; //"//div[@id='main-nav']//li/a[@href='http://www.marksandspencer.com/c/men']";
	private String casualShirts = "//div[@class='box g5']/div/div[4]//a[@href='http://www.marksandspencer.com/l/men/casual-shirts']";
	private String firstShirt = "//div[@id='product-listing']//li[@id][1]//div[@class='detail']//a[@href]";
	private String shirtBrand = "//div[@id='product-listing']//li[@id][1]//div[@class='detail']/span[@class='brand-title']";
	private String price = "//div[@id='product-listing']//li[@id][1]//div[@class='detail']//div[@class='product-price']//dd";
	private String sizeDropDown = "//div[@id='sizeDropDown']/div/span";
	private String sizeSelection = "//div[@id='sizeDropDown']//ul[@class='option-list']/li[%s]";
	private String addToBag = "//input[@id='basket_P22361098']";
	private String basketCount = "//span[@id='viewBagCountHeader']";
	private String basketBag = "//ul[@class='basket']//a[@class='header-link']";
	private String shirtBrandFromBasketBag = "//li[@class='order-item  ']//div[@class='product-info-wrap']/div";
	private String shirtTypeFromBasketBag = "//li[@class='order-item  ']//div[@class='product-info-wrap']//h3[@class='heading-product']/a";
	private String shirtPriceFromBasketBag = "//li[@class='order-item  ']//div[@class='order-detail inverse price-detail']/p";
		
	public String getLocator4MenTabFromHeaderMenu()
	{
		return this.menHeaderMenu;
	}
	
	public void clickOnMenTabFromHeaderMenu()
	{
		driver.findElement(By.xpath(menHeaderMenu)).click();
	}
	
	public String getLocator4CasualShirtsLinkFromLeftSideMenu()
	{
		return this.casualShirts;
	}
	
	public void clickOnCasualShirtsLinkFromLeftSideMenu()
	{
		driver.findElement(By.xpath(casualShirts)).click();
	}
	
	public String getLocator4FirstShirtLink()
	{
		return this.firstShirt;
	}
	
	public void clickOnFirstShirtLink() throws Exception
	{
		driver.findElement(By.xpath(firstShirt)).click();
		Thread.sleep(5000);
	}
	
	public String getFirstShirtBrandName()
	{
		return driver.findElement(By.xpath(shirtBrand)).getText();
	}
	
	public String getFirstShirtPrice()
	{
		return driver.findElement(By.xpath(price)).getText();
	}
	
	public String getFirstShirtType()
	{
		return driver.findElement(By.xpath(firstShirt)).getText();
	}
	
	public void clickOnSizeDropDown()
	{
		driver.findElement(By.xpath(sizeDropDown)).click();
	}
	
	public String getLocator4SizeSelectionDropDown(String row)
	{
		return String.format(sizeSelection, row);
	}
	
	public void setShirtSize(String row) throws Exception
	{
		driver.findElement(By.xpath(String.format(sizeSelection, row))).click();
		Thread.sleep(5000);
	}
	
	public String getLocator4AddToBagButton()
	{
		return this.addToBag;
	}
	
	public void clickOnAddToBagButton() throws Exception
	{
		driver.findElement(By.xpath(addToBag)).click();
		Thread.sleep(5000);
	}
	
	public String getBasketCount()
	{
		return driver.findElement(By.xpath(basketCount)).getText();
	}
	
	public void clickOnBasketBag() throws Exception
	{
		driver.findElement(By.xpath(basketBag)).click();
		Thread.sleep(5000);
	}
	
	public String getLocator4ShirtBrandNameFromBasketBag()
	{
		return this.shirtBrandFromBasketBag;
	}
	
	public String getShirtBrandNameFromBasketBag()
	{
		return driver.findElement(By.xpath(shirtBrandFromBasketBag)).getText();
	}
	
	public String getLocator4ShirtTypeFromBasketBag()
	{
		return this.shirtTypeFromBasketBag;
	}
	
	public String getShirtTypeFromBasketBag()
	{
		return driver.findElement(By.xpath(shirtTypeFromBasketBag)).getText();
	}
	
	public String getLocator4ShirtPriceFromBasketBag()
	{
		return this.shirtPriceFromBasketBag;
	}
	
	public String getShirtPriceFromBasketBag()
	{
		return driver.findElement(By.xpath(shirtPriceFromBasketBag)).getText();
	}	
	
}

