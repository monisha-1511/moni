package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.id("email")).sendKeys("monishav415@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Moni@1511");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("hotelsearch_iframe");
		WebElement search = driver.findElement(By.id("searchBtn"));
		search.click();
		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebElement invalidstate = driver.findElement(By.id("invalid-state"));
		String stateerror = invalidstate.getText();
		System.out.println(stateerror);
		WebElement invalidcity = driver.findElement(By.id("invalid-city"));
		String cityerror = invalidcity.getText();
		System.out.println(cityerror);
		WebElement invaliddate = driver.findElement(By.id("invalid-check_in"));
		String dateerror = invaliddate.getText();
		System.out.println(dateerror);
		WebElement invaliddateout = driver.findElement(By.id("invalid-check_out"));
		String dateouterror = invaliddateout.getText();
		System.out.println(dateouterror);
		WebElement selectroom = driver.findElement(By.id("invalid-no_rooms"));
		String roomerror = selectroom.getText();
		System.out.println(roomerror);
		WebElement selectadult = driver.findElement(By.id("invalid-no_adults"));
		String adulterror = selectadult.getText();
		System.out.println(adulterror);

	}
}
