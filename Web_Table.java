package webTable.com;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Web_Table {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		
		//Particular cell data
		WebElement particular_cell = driver.findElement(By.xpath("//table[@id='shopping']/tbody/tr[3]/td[1]"));
		String particular_cell_text = particular_cell.getText();
		System.out.println(particular_cell_text);
		
		//All Data
		List<WebElement> all_data = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td"));
		for(WebElement al : all_data) {
			String altext = al.getText();
			System.out.println(altext);
		}
		
		//Specific Row
		List<WebElement> specific_row = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr[2]/td"));
		for(WebElement sr : specific_row) {
			String srtext = sr.getText();
			System.out.println(srtext);
		}
		
		//Specific Column
		List<WebElement> specific_col = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[2]"));
		for (WebElement sc : specific_col) {
			String sctext = sc.getText();
			System.out.println(sctext);
			if(sctext.equals("Raj")) {
				driver.findElement(By.id("second")).click();
			}
		}
	}
}
