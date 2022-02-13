package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoesDetailsPage {
	
	@FindBy (id = "productTitle")
	WebElement shoesDetailsName;
	
	public String getShoesDetailsName()
	{
		return shoesDetailsName.getText();
	}

}
