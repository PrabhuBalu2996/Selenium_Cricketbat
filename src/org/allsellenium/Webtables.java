package org.allsellenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\workspace\\Selenum_Webtable\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement tbody = driver.findElement(By.className("dataTable"));
		List<WebElement> trows = tbody.findElements(By.tagName("tr"));
		
		for(int i=0;i<trows.size();i++){
			
			WebElement rows = trows.get(i);
			List<WebElement> tdatas = rows.findElements(By.tagName("td"));
			for(int j=0;j<trows.size();j++){
				WebElement indata = tdatas.get(j);
				String text = indata.getText();
				System.out.println(text);
			}
			
		}
		driver.close();
	}

}
