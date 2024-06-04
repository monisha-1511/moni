package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base1 {
	public static WebDriver driver;
	
		public WebDriver launchBrowser() {
			 driver=new ChromeDriver();
			return driver;
			}
		
		public void launchUrl(String url) {
			
			driver.get(url);
			}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void btnClick(WebElement element) {
		element.click();
		
		}
	public void InsertText(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	
public void method() {
	System.out.println("method creation");
}
		
	

}
