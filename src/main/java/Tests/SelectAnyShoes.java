package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Pages.ShoesDetailsPage;
import Pages.ShoesPage;
import Utilities.Helper;

public class SelectAnyShoes {
	
	static WebDriver driver;
	static Helper helperObject;
	static LandingPage landingPageObject;
	static ShoesPage shoesPageObject;
	static ShoesDetailsPage shoesDetailsPageObject;
	
	@BeforeClass
	public void setup() throws IOException
	{
		
		helperObject = new Helper();
		driver = helperObject.initialization(helperObject.browser, helperObject.url);
		landingPageObject = PageFactory.initElements(driver, LandingPage.class);
		shoesPageObject = PageFactory.initElements(driver, ShoesPage.class);
		shoesDetailsPageObject = PageFactory.initElements(driver, ShoesDetailsPage.class);
		
	}
	
	@Test
	public void searchShoes()
	{
		landingPageObject.clickSearchBox();
		
		landingPageObject.enterTextInSearchBox("shoes");
		
		landingPageObject.clickSearchButton();
		
		String url = driver.getCurrentUrl();
		boolean flag  = url.contains("https://www.amazon.com/s?k=shoes");
		Assert.assertTrue(flag);
	}
	
	@Test
	public void selectShoes()
	{
		
		shoesPageObject.clickShoes();
		
		String shoesDetailsName = shoesDetailsPageObject.getShoesDetailsName();
		
		Assert.assertEquals(shoesDetailsName, "Amazon Essentials Women's Loafer Flat");
		
	}
	
	@AfterClass
	public void closeSetup()
	{
		System.out.println("Tests Completed");
		
		driver.close();
	}
	
	
	
	

}
