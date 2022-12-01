package org.sel;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("IPHONE", Keys.ENTER);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		

		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

	//	Thread.sleep(5000);
	//	driver.findElement(By.id("add-to-cart-button")).click();
		
		Set<String> window = driver.getWindowHandles();
		System.out.println(window);

	}
}
