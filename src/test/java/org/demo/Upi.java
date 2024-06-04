package org.demo;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Upi {
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("monishav415@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Moni@1511");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement welcometext = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
		String usernameprint = welcometext.getText();
		System.out.println(usernameprint);
		WebElement statedropdown = driver.findElement(By.id("state"));
		Select s = new Select(statedropdown);
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
		driver.findElement(By.xpath("//a[text()='20']")).click();
		driver.findElement(By.xpath("//input[@class='form-control to hasDatepicker']")).click();
		driver.findElement(By.xpath("//a[text()='22']")).click();
		WebElement room = driver.findElement(By.id("no_rooms"));
		Select s1 = new Select(room);
		s1.selectByVisibleText("1-One");
		WebElement adult = driver.findElement(By.id("no_adults"));
		Select s2 = new Select(adult);
		s2.selectByVisibleText("2-Two");
		driver.findElement(By.id("no_child")).sendKeys("2");
		driver.switchTo().frame("hotelsearch_iframe");
		WebElement search = driver.findElement(By.id("searchBtn"));
		search.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroldown = driver.findElement(By.xpath("//h5[text()='Hilton Studio']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scroldown);
		WebElement hotel = driver.findElement(By.xpath("//h5[text()='Hilton Studio']"));
		String hotelname = hotel.getText();
		System.out.println(hotelname);
		WebElement price = driver.findElement(By.xpath("(//h2[text()='$ 1,400'])[2]"));
		String hotelprice = price.getText();
		System.out.println(hotelprice);
		driver.findElement(By.xpath("(//a[text()='Continue'])[1]")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		driver.findElement(By.xpath("//input[@id='own']")).click();
		WebElement salutation = driver.findElement(By.id("user_title"));
		Select s3 = new Select(salutation);
		s3.selectByVisibleText("Ms.");
		driver.findElement(By.id("first_name")).sendKeys("monisha");
		driver.findElement(By.id("last_name")).sendKeys("s");
		driver.findElement(By.id("user_phone")).sendKeys("9789376205");
		driver.findElement(By.id("user_email")).sendKeys("monishav415@gmail.com");
		driver.findElement(By.id("gst")).click();
		driver.findElement(By.id("gst_registration")).sendKeys("9043592058");
		driver.findElement(By.id("company_name")).sendKeys("Greens Tech OMR Branch");
		driver.findElement(By.id("company_address")).sendKeys("Thoraipakkam");
		driver.findElement(By.id("step1next")).click();
		driver.findElement(By.id("late")).click();
		driver.findElement(By.id("other_request")).sendKeys("need covered car parking");
		driver.findElement(By.id("step2next")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//h5[text()='UPI']")).click();
		driver.findElement(By.id("upi_id")).sendKeys("seleniumtraining@vbc");
		driver.findElement(By.id("submitBtn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}