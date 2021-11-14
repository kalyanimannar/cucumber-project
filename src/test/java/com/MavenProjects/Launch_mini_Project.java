package com.MavenProjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_mini_Project 
{    
	   public static void main(String[] args) throws  InterruptedException, IOException
		{
		System.setProperty("webdriver.chrome.driver","E:\\programs\\MavenProjects\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();
		
		Actions ac = new Actions(driver);
		WebElement add=driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=3&token=e817bb0705dd58da8db074c69f729fd8']"));
		ac.click(add).build().perform();
		Thread.sleep(2000);
		WebElement proced=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		ac.click(proced).build().perform();
		Thread.sleep(2000);
		WebElement summary = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		summary.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("akalyanikavi@gmail.com");
		WebElement psswrd = driver.findElement(By.xpath("//input[@id='passwd']"));
		psswrd.sendKeys("Kalsivcj@1987");
		Thread.sleep(2000);
		WebElement sign = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		sign.click();
		WebElement address = driver.findElement(By.xpath("//button[@name='processAddress']"));
		address.click();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		WebElement shipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		shipping.click();
		
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//jsExecutor.executeScript("wimdow.scrollBy(0,1000)");
		//jsExecutor.executeScript("wimdow.scrollBy(0,-400)");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Task\\screenshoot\\ss3.png");
		FileUtils.copyFile(source,dest);
		WebElement confirm = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		confirm.click();
	 }
		
}



