package org.pac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("PriyaDharshini0307");
		WebElement pas = driver.findElement(By.id("password"));
		pas.sendKeys("4P58L4");
		WebElement lng = driver.findElement(By.id("login"));
		lng.click();
		
	    WebElement srch = driver.findElement(By.xpath("//td[@class='login_title']"));
		String text = srch.getText();
		System.out.println(text);
		
		WebElement dropdown1 = driver.findElement(By.id("location"));
		
		Select select=new Select(dropdown1);
		select.selectByVisibleText("Los Angeles");
		
		WebElement ht = driver.findElement(By.id("hotels"));
		Select htt=new Select(ht);
		htt.selectByIndex(3);
		
		WebElement type = driver.findElement(By.id("room_type"));
		Select typeroom=new Select(type);
		typeroom.selectByIndex(3);
		
		WebElement dropdown2 = driver.findElement(By.id("room_nos"));
		Select select1=new Select(dropdown2);
		select1.selectByIndex(3);
		
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.clear();
		date.sendKeys("31/10/2022");
		
		WebElement date2 = driver.findElement(By.id("datepick_out"));
		date2.clear();
		date2.sendKeys("01/11/2022");
		
		WebElement adu = driver.findElement(By.id("adult_room"));
		Select select2=new Select(adu);
		select2.selectByIndex(4);
		
		Thread.sleep(3000);
		WebElement btnn = driver.findElement(By.xpath("//input[@value='Search']"));
		btnn.click();

		WebElement tt = driver.findElement(By.xpath("//td[@class='login_title']"));
		String text2 = tt.getText();
		System.out.println(text2);
	
		WebElement clc = driver.findElement(By.id("radiobutton_0"));
		clc.click();
		
		WebElement conBtn = driver.findElement(By.id("continue"));
		conBtn.click();
		
		WebElement txtw = driver.findElement(By.xpath("(//td[@class='login_title'])[2]"));
		String text3 = txtw.getText();
		System.out.println(text3);
		
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("priya");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("dharshini");
		
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("chennai");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1234569877894561");
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select select4=new Select(ccType);
		select4.selectByVisibleText("VISA");
		
		WebElement ccExp = driver.findElement(By.id("cc_exp_month"));
		Select select5=new Select(ccExp);
		select5.selectByIndex(9);
		
		WebElement ccExpY = driver.findElement(By.id("cc_exp_year"));
		Select select6=new Select(ccExpY);
		select6.selectByIndex(10);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("233");
		
		WebElement bn = driver.findElement(By.id("book_now"));
		bn.click();
		
		Thread.sleep(5000);
		
		WebElement id = driver.findElement(By.xpath("//input[@name='order_no']"));
	String s=id.getAttribute("value");
	System.out.println(s);
	
	driver.quit();
		
		
		
	}
	

	}


