package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	@FindBy (id = "twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy (id = "nav-search-submit-button")
	WebElement searchButon;
	
	public void clickSearchBox()
	{
		searchBox.click();
	}
	
	public void enterTextInSearchBox(String searchItem)
	{
		searchBox.sendKeys(searchItem);
	}
	
	public void clickSearchButton()
	{
		searchButon.click();
	}

}
