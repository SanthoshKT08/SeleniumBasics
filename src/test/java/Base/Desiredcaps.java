package Base;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Desiredcaps {

	public static void main(String[] args) {


		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome Browser");
		caps.setVersion("80.1");
		caps.setPlatform(Platform.WIN10);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		
		
	}

}
