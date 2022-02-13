package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoesPage {
	
	@FindBy (xpath = "//div[@cel_widget_id = 'MAIN-SEARCH_RESULTS-7']")
	WebElement firstShoes;
	
	@FindBy (xpath = "//span[text() = 'Amazon Essentials Women's Loafer Flat']")
	WebElement firstShoesName;
	
	public String getShoesName()
	{
		return firstShoesName.getText();
	}
	
	public void clickShoes()
	{
		firstShoes.click();
	}

}
