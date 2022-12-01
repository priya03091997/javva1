package org.utube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleGOOGLE{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@maxlength='2048']")).sendKeys("trichy" + Keys.ENTER);
		driver.findElement(By.xpath("(//h3[text()='Tiruchirappalli - Wikipedia'])[1]")).click();
WebElement firstHEADING = driver.findElement(By.xpath("//h1[@id='firstHeading']"));
String text = firstHEADING.getText();
System.out.println(text);

}
}