package org.utube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplEnabSele {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		// is displayed

		WebElement dis = driver.findElement(By.id("small-searchterms"));
		boolean display = dis.isDisplayed();
		System.out.println(display);

		// enable

		WebElement enab = driver.findElement(By.id("small-searchterms"));
		boolean enabled = enab.isEnabled();
		System.out.println(enabled);

		// select

		WebElement male = driver.findElement(By.id("gender-male"));
		boolean selected = male.isSelected();
		System.out.println(selected);

		WebElement female = driver.findElement(By.id("gender-female"));
		boolean selected2 = female.isSelected();
		System.out.println(selected2);

		male.click();
		boolean selected3 = male.isSelected();
		System.out.println(selected3);
		
		driver.quit();

	}

}
