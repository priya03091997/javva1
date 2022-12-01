package org.utube;

import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllDriver {
	public static void main(String[] args) {
		// WebDriverManager.firefoxdriver().setup();
//	WebDriver driver=new FirefoxDriver();

		// WebDriverManager.edgedriver().setup();
		// WebDriver driver=new EdgeDriver();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://frontend.nopcommerce.com/");
		
		System.out.println("Title of the page "+driver.getTitle());
		System.out.println("Current url "+ driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		

	}

}