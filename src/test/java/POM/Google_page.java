package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.api.robot.Key;

public class Google_page {
	
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
	 WebElement google_search_text_field;
	
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")
	private WebElement google_search_button;
	
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]")
	private WebElement Feeling_lucky_button;
	
	@FindBy(xpath = "//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")
	private WebElement Google_image_link;
	
	@FindBy(xpath = "//*[@id=\"gbwa\"]/div/a")
	private WebElement Google_apps_icon;
	
	@FindBy(xpath = "//*[@id=\"fsr\"]/a[1]")
	 WebElement privacy_link;
	
	@FindBy(xpath = "//*[@id=\"fsr\"]/a[2]")
    WebElement terms_link;	
	
	

	 public Google_page (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	public void Search_something_in_google()
	{
		google_search_text_field.sendKeys("selenium" + Key.ENTER);
	}
	
	public void Click_search_button()
	{
		google_search_button.click();
	}
	
	public void Click_feeling_lucky_button()
	{
		Feeling_lucky_button.click();
	}
	
	public void click_term()
	{
	terms_link.click();	
	}
	
	public void click_policy()
	{
		privacy_link.click();
	}
	public void Click_images_link()
	{
		Google_image_link.click();
	}


}
