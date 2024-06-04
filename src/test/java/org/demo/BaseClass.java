package org.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
public static WebDriver driver;

public void browserLaunch(String browserType) {
	
switch(browserType) {

case "chrome":
	
	driver=new ChromeDriver();
	break;
	
case "ie":
	driver=new InternetExplorerDriver();
	
	break;
	case "edge":
	driver=new EdgeDriver();
	
}}
public void launchUrl(String url) {
	driver.get(url);
		}
public String getProjectPath() {
	
	return System.getProperty("user.dir");
			
			}
public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
	Properties p=new Properties();
	p.load(new FileInputStream(getProjectPath()+"\\config\\config.properties"));
	Object obj = p.get(key);
	String value=(String)obj;
	return value;
	}
public void maximize() {
	driver.manage().window().maximize();
	}
public void insertText(WebElement element,String value) {
	element.sendKeys(value);
}
public void btnClick(WebElement element) {
	element.click();
}
public void quitBrowser() {
	
	driver.quit();
}
public void getPageUrl() {
	String currentUrl = driver.getCurrentUrl();
}
public void getPageTitle() {
	String title = driver.getTitle();
}
public void text(WebElement element) {
	String text = element.getText();
	
}}
