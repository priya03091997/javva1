package org.utube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/login");
		driver.manage().window().maximize();
		
		WebElement userNAME = driver.findElement(By.id("Username"));
		userNAME.sendKeys("priya123@gmail.com");
		String attribute = userNAME.getAttribute("value");
		System.out.println(attribute);
		
		userNAME.clear();
		userNAME.sendKeys("DARSHU");
		
		
		
	}
	

}
