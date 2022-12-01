package org.utube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[@class='analystic' and @aria-expanded='true']")).click();
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("WELCOME");
}
}