package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample extends BaseClass {
	public static void main(String[] args)  {
BaseClass b=new BaseClass();
b.launchBrowser();
b.launchUrl("http://adactinhotelapp.com/");

b.maximize();
PojoClass p=new PojoClass();
WebElement txtUser = p.gettxtUser();
b.insertText(txtUser, "PrithVikv");
b.insertText(p.gettxtpass(), "Moni@1511");
b.btnClick(p.getlogin());
WebElement location = p.getlocation();
Select s=new Select(location);
s.selectByVisibleText("London");
WebElement gethotels = p.gethotels();
Select s1=new Select(gethotels);
s1.selectByVisibleText("Hotel Creek");
WebElement getroomType = p.getroomType();
Select s2=new Select(getroomType);
s2.selectByVisibleText("Standard");
WebElement getroom = p.getroom();
Select s3=new Select(getroom);
s3.selectByVisibleText("1 - One");
b.insertText(p.getdateCheckIn(), "24/04/2024");
b.insertText(p.getdateCheckOut(), "25/04/2024");
WebElement adults = p.getadultsPerRoom();
Select s4=new Select(adults);
s4.selectByVisibleText("2 - Two");
b.btnClick(p.getsearch());
b.btnClick(p.getradio());
b.btnClick(p.getcon());
b.insertText(p.getname(), "Monisha");
b.insertText(p.getlastname(), "s");
b.insertText(p.getaddress(),"59/1,radhakrishnan street");
b.insertText(p.getccNo(),"3524665338281234");
WebElement ccType = p.getccType();
Select s5=new Select(ccType);
s5.selectByVisibleText("VISA");

WebElement month= p.getexpMonth();
Select s6=new Select(month);
s6.selectByIndex(11);

WebElement year= p.getexpYear();
Select s7=new Select(year);
s7.selectByVisibleText("2029");
b.insertText(p.getCVVNo(), "318");
b.btnClick(p.getbook());
WebElement or = driver.findElement(By.tagName("input"));

	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true)",or);
	
System.out.println(p.getorder().getText());

}}

	