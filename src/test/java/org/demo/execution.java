package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class execution {
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
		driver.findElement(By.xpath("//a[text()='15']")).click();
		driver.findElement(By.xpath("//input[@class='form-control to hasDatepicker']")).click();
		driver.findElement(By.xpath("//a[text()='16']")).click();
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
		driver.findElement(By.xpath("//h5[text()='Credit/Debit/ATM Card']")).click();
		WebElement cardtype = driver.findElement(By.id("payment_type"));
		Select s4 = new Select(cardtype);
		s4.selectByVisibleText("Debit Card");
		WebElement selectcard = driver.findElement(By.id("card_type"));
		Select s5 = new Select(selectcard);
		s5.selectByVisibleText("Visa");
		driver.findElement(By.id("card_no")).sendKeys("5555555555552222");
		driver.findElement(By.id("card_name")).sendKeys("monisha");
		WebElement month = driver.findElement(By.id("card_month"));
		Select s6 = new Select(month);
		driver.findElement(By.id("submitBtn")).click();
		s6.selectByVisibleText("January");
		WebElement year = driver.findElement(By.id("card_year"));
		Select s7 = new Select(year);
		s7.selectByVisibleText("2027");
		driver.findElement(By.id("cvv")).sendKeys("317");
		driver.findElement(By.id("submitBtn")).click();
		WebElement orderid = driver.findElement(By.xpath("//h2[@class='couppon-code']"));
		System.out.println(orderid.getText());

		driver.findElement(By.xpath("//button[text()='My Booking']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement order = driver.findElement(By.xpath("(//div[@class='col-md-5'])[1]"));
		System.out.println(order.getText());

		WebElement name = driver.findElement(By.xpath("(//h5[text()='Hilton Studio'])[1]"));
		System.out.println(name.getText());
	
		WebElement prrice = driver.findElement(By.xpath("(//strong[text()='Rs 1,652'])[1]"));
		System.out.println(prrice.getText());
		driver.findElement(By.xpath("(//button[@class='edit btn filter_btn'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//input[@value='2024-05-16']")).click();
		driver.findElement(By.xpath("//a[text()='18']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		WebElement message = driver.findElement(By.xpath("//li[text()='Booking updated successfully']"));

		System.out.println(message.getText());
		WebElement order1 = driver.findElement(By.xpath("(//div[@class='col-md-5'])[1]"));
		System.out.println(order1.getText());

		WebElement name1 = driver.findElement(By.xpath("(//h5[text()='Hilton Studio'])[1]"));
		System.out.println(name1.getText());
	
		WebElement prrice1 = driver.findElement(By.xpath("(//strong[text()='Rs 1,652'])[1]"));
		System.out.println(prrice1.getText());
		
		driver.findElement(By.xpath("//a[text()='Cancel'][1]")).click();
		
		driver.switchTo().alert();
		al.accept();
		WebElement cancelmsg = driver.findElement(By.xpath("//li[text()='Your booking cancelled successfully']"));
	System.out.println(cancelmsg.getText());
		}}