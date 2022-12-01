package org.utube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.snapdeal.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	
	driver.navigate().back();
	String title = driver.getTitle();
	System.out.println("Title of the page " +title);
	
	driver.navigate().forward();
	String title2  = driver.getTitle();
	System.out.println("Title of the page "+title2);
	
	driver.navigate().refresh();
	
	
	}

}
