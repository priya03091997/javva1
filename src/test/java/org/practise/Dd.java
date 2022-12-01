package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dd {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement ddn = driver.findElement(By.id("cars"));
		Select select=new Select(ddn);
		List<WebElement> options = select.getOptions();
		for (WebElement element : options) {
			String attribute = element.getAttribute("value");		
		//	System.out.println(attribute);
			select.selectByValue(attribute);
			select.deselectByVisibleText("Saab");
		}	
		}	
		}
		
	
	
	
	
	
	


