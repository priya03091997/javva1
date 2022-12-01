package org.pac;

import java.io.File;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Excel {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			WebElement ski = driver.findElement(By.id("Skills"));
			Select select=new Select(ski);
			List<WebElement> options = select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				WebElement ele = options.get(i);
				String text = ele.getText();
			
			
				File file=new File("C:\\Users\\priya\\Second\\FOLDER\\priyaaaaa.xlsx");
				Workbook workbook=new XSSFWorkbook();
				Sheet Sheet = workbook.createSheet("piya");
				
					Row cRow = Sheet.createRow(0);
					Row createRow = Sheet.createRow(1);
					Cell cl = cRow.createCell(0);
					createRow.createCell(1);
					
					cl.setCellValue(text);
					cl.setCellValue(text);
					
					
					
			
				
			
				FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
				
		
			
				
				
				
			}
				
	}
}
			
			
			
	


