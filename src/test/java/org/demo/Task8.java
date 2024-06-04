package org.demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task8 {
	public static void main(String[] args) throws InterruptedException {
		boolean flag=false;
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("monishav415@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Moni@1511");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//input[@class='form-control from hasDatepicker']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='18']")).click();
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
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	WebElement scrolldown = driver.findElement(By.xpath("//label[text()='Price low to high']"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);

		driver.findElement(By.xpath("//label[text()='Name Descending']")).click();
		List<String>devnamedesc=new ArrayList<String>();
		List<String>qanamedesc=new ArrayList<String>();
		List<WebElement> hotelname = driver.findElements(By.xpath("//div[@class='fliter_box_inner mb-4']//h5"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		for(WebElement h:hotelname) {
		
			String hotel = h.getText();
			devnamedesc.add(hotel);
		
			}
		System.out.println(devnamedesc);
		qanamedesc.addAll(devnamedesc);
		Collections.reverse(qanamedesc);
		System.out.println(qanamedesc);
		
		if(qanamedesc.equals(devnamedesc)) {
			
			System.out.println("names are desending order");
			flag=true;
		}
		else {
			flag=false;
			System.out.println("names are not desending order");
		}
		
		
	}}
