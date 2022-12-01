+package org.utube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();

		WebElement drp = driver.findElement(By.id("input-country"));
	Select sel = new Select(drp);

		// sel.selectByVisibleText("Afghanistan");

		// sel.selectByValue("2");
		
		// sel.selectByIndex(1);

		//without using select method 
		
		List<WebElement> options = sel.getOptions();
		for (WebElement web : options) {
			if (web.getText().equals("Afghanistan"))
				
					{
				
				web.click();
				
			}

		}
		
	//	drp.sendKeys("Afghanistan");
	}
}
