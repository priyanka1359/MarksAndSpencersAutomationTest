package com.mands.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.mands.pageObjects.MandSpageObjects;
import com.mands.pageObjects.ReusableHelperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MandStest extends ReusableHelperClass
{
	
	private MandSpageObjects mandsPageObjects = new MandSpageObjects();
	private ReusableHelperClass helper = new ReusableHelperClass();
	public String shirtBrand = null;
	public String shirtPrice = null;
	public String shirtType = null;
	public String shirtBrandFromBasket = null;
	public String shirtPriceFromBasket = null;
	public String shirtTypeFromBasket = null;
	
			
	@Given("^I have added a shirt to my bag$")
	public void I_have_added_a_shirt_to_my_bag() throws Throwable 
	{		
		helper.WaitForElementToBePresentAndContinueAfterTimeOut(mandsPageObjects.getLocator4MenTabFromHeaderMenu());
		assertTrue("Failed: Mens tab is not displayed on the M&S Landing Home Page, Plz check: ", helper.IsElementPresent(mandsPageObjects.getLocator4MenTabFromHeaderMenu()));
		mandsPageObjects.clickOnMenTabFromHeaderMenu();
		helper.WaitForElementToBePresentAndContinueAfterTimeOut(mandsPageObjects.getLocator4CasualShirtsLinkFromLeftSideMenu());
		assertTrue("Failed: Casual Shirts link under the left hand menu is not displayed, Plz check: ", helper.IsElementPresent(mandsPageObjects.getLocator4CasualShirtsLinkFromLeftSideMenu()));
		mandsPageObjects.clickOnCasualShirtsLinkFromLeftSideMenu();
		helper.WaitForElementToBePresentAndContinueAfterTimeOut(mandsPageObjects.getLocator4FirstShirtLink());
		assertTrue("Failed: First Shirt link is not displayed, Plz check: ", helper.IsElementPresent(mandsPageObjects.getLocator4FirstShirtLink()));
		shirtBrand = mandsPageObjects.getFirstShirtBrandName();
		shirtPrice = mandsPageObjects.getFirstShirtPrice();
		shirtType = mandsPageObjects.getFirstShirtType();
		mandsPageObjects.clickOnFirstShirtLink();
		helper.WaitForElementToBePresentAndContinueAfterTimeOut(mandsPageObjects.getLocator4SizeSelectionDropDown("1"));
		assertTrue("Failed: Size Selections drop down is not displayed which means we are not on size selection page, Plz check: ", helper.IsElementPresent(mandsPageObjects.getLocator4SizeSelectionDropDown("1")));
		mandsPageObjects.clickOnSizeDropDown();
		mandsPageObjects.setShirtSize("1");
		mandsPageObjects.clickOnAddToBagButton();
		assertEquals("Failed: Basket count is not same as expected, Plz check: ", "1", mandsPageObjects.getBasketCount());
		mandsPageObjects.clickOnBasketBag();
		helper.WaitForElementToBePresentAndContinueAfterTimeOut(mandsPageObjects.getLocator4ShirtBrandNameFromBasketBag());		
	}

	@When("^I view the contents of my bag$")
	public void I_view_the_contents_of_my_bag() throws Throwable 
	{
		helper.IsElementPresent(mandsPageObjects.getLocator4ShirtBrandNameFromBasketBag());
		helper.IsElementPresent(mandsPageObjects.getLocator4ShirtTypeFromBasketBag());
		helper.IsElementPresent(mandsPageObjects.getLocator4ShirtPriceFromBasketBag());
		shirtBrandFromBasket = mandsPageObjects.getShirtBrandNameFromBasketBag();
		shirtPriceFromBasket = mandsPageObjects.getShirtPriceFromBasketBag();
		shirtTypeFromBasket = mandsPageObjects.getShirtTypeFromBasketBag();
	}

	@Then("^I can see the contents of the bag include a shirt$")
	public void I_can_see_the_contents_of_the_bag_include_a_shirt() throws Throwable 
	{
		assertEquals("Failed: Shirt Brandname in the basket bag is not same as expected, Plz check: ", shirtBrand, shirtBrandFromBasket.toUpperCase());
		assertEquals("Failed: Shirt Price in the basket bag is not same as expected, Plz check: ", shirtPrice, shirtPriceFromBasket);
		assertEquals("Failed: Shirt Type in the basket bag is not same as expected, Plz check: ", shirtType, shirtTypeFromBasket);
	}


}
