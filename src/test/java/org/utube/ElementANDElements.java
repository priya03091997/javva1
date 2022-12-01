package org.utube;



import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementANDElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		WebElement srchbox = driver.findElement(By.id("twotabsearchtextbox"));
		srchbox.sendKeys("iphone"+Keys.ENTER);
		
		List<WebElement> iphone = driver.findElements(By.xpath("//img[@class='s-image']"));
	for (WebElement webElement : iphone) {
		String text = webElement.getText();
		
		System.out.println(text);
	}
			
			
			
		}
		
	}


