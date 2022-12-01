package org.pac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\priya\\Second\\FOLDER\\picc.png");
		FileUtils.copyFile(src, des);
Thread.sleep(3000);
WebElement gmail = driver.findElement(By.id("email"));
gmail.sendKeys("priya123@gmail.com");
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("priya123");
WebElement btn = driver.findElement(By.name("login"));
btn.click();
Thread.sleep(3000);
TakesScreenshot ts=(TakesScreenshot)driver;
File sr = ts.getScreenshotAs(OutputType.FILE);
//File de = new File("C:\\Users\\priya\\Second\\FOLDER\\pizu.png");
File de=new File("C:\\Users\\priya\\Second\\JACKY\\jagan.png");
FileUtils.copyFile(sr, de);	
Thread.sleep(3000);
driver.close();



	}

}
