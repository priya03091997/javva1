package org.pac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	
	
	

	@BeforeClass
	public static void browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

	@Before
	public void before() throws IOException, InterruptedException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\priya\\Second\\FOLDER\\pi.png");
		FileUtils.copyFile(src, des);
Thread.sleep(3000);
	}

	@Test
	public void business() throws InterruptedException {
		WebElement gmail = driver.findElement(By.id("email"));
		gmail.sendKeys("priya123@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("priya123");
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		Thread.sleep(3000);
		
	}

	@After
	public void after() throws IOException, InterruptedException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\priya\\Second\\FOLDER\\pio.png");
		FileUtils.copyFile(src, des);	
		Thread.sleep(3000);
	}

	@AfterClass
	public static void after1() {
driver.close();

}
	}
