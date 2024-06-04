package org.demo;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("monishav415@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Moni@1511");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement statedropdown = driver.findElement(By.id("state"));
			Select s=new Select(statedropdown);
			s.selectByVisibleText("Tamil Nadu");
			WebElement city = driver.findElement(By.xpath("//span[text()='Select City *']"));
			city.click();
			driver.findElement(By.xpath("//li[text()='Coimbatore']")).click();
			driver.findElement(By.xpath("//textarea[@class='select2-search__field']")).click();
			driver.findElement(By.xpath("//li[text()='Luxury']")).click();
			driver.findElement(By.xpath("//textarea[@class='select2-search__field']")).click();
			driver.findElement(By.xpath("//li[text()='Standard']")).click();
			driver.findElement(By.xpath("//textarea[@class='select2-search__field']")).click();
			driver.findElement(By.xpath("//li[text()='Deluxe']")).click();
			driver.findElement(By.xpath("//textarea[@class='select2-search__field']")).click();
			driver.findElement(By.xpath("//li[text()='Suite']")).click();
			driver.findElement(By.xpath("//textarea[@class='select2-search__field']")).click();
			driver.findElement(By.xpath("//li[text()='Studio']")).click();
			driver.findElement(By.xpath("//input[@class='form-control from hasDatepicker']")).click();
			driver.findElement(By.xpath("//a[text()='18']")).click();
			driver.findElement(By.xpath("//input[@class='form-control to hasDatepicker']")).click();
			driver.findElement(By.xpath("//a[text()='22']")).click();
			WebElement room = driver.findElement(By.id("no_rooms"));
			Select s1=new Select(room);
		s1.selectByVisibleText("1-One");
		WebElement adult = driver.findElement(By.id("no_adults"));
				Select s2=new Select(adult);
				s2.selectByVisibleText("2-Two");
				driver.findElement(By.id("no_child")).sendKeys("2");
				driver.switchTo().frame("hotelsearch_iframe");
				WebElement search = driver.findElement(By.id("searchBtn"));
				search.click();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				WebElement scroldown = driver.findElement(By.xpath("//h5[text()='Hilton Studio']"));
				js.executeScript("arguments[0].scrollIntoView(true)",scroldown);
				java.util.List<WebElement> Listofhotels = driver.findElements(By.xpath("//div[@class='fliter_box_inner mb-4']//h5"));
			for(WebElement l:Listofhotels) {
				
				String hotelname = l.getText();
				System.out.println("hotelname:  "+ hotelname);
				
			}
			java.util.List<WebElement> priceofhotels = driver.findElements(By.xpath("//div[@class='fliter_box_inner mb-4']//h2"));

for(WebElement p:priceofhotels) {
	String price = p.getText();
	System.out.println("hotel price:  "+ price);
}





				
	
	}
	
	

}
