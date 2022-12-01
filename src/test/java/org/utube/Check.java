package org.utube;

//import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
	int size = allcheckbox.size();
	System.out.println(size);

		/* click all the checkboxes
		for (WebElement webElement : allcheckbox) {
		 webElement.click();*/
		
		/*click first 2 checkboxes
		for (int i = 0; i < allcheckbox.size(); i++) {
			if (i < 2) {
				allcheckbox.get(i).click();
				String attribute = allcheckbox.get(i).getAttribute("id");
				System.out.println(attribute);

			}*/
		
	/*click last two checkbox
	for (int i =allcheckbox.size()-3; i < allcheckbox.size(); i++) {
			
				allcheckbox.get(i).click();
			
		}*/

		}

	}
