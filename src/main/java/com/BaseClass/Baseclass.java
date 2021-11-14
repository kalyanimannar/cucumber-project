package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch (String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver","E:\\programs\\MavenProjects\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver","E:\\programs\\MavenProjects\\Driver\\chromedriver.exe");
				driver = new InternetExplorerDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\programs\\MavenProjects\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}else   {
			System.out.println("Invalid browserName");
		}
		driver.manage().window().maximize();
		return driver;
		}

	
	public static void navigateto(String Url) {
		driver.navigate().to("");
	}
	
	public static void sleep(int i) throws InterruptedException {
		Thread.sleep(2000);
		
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	
	
	public static void navigateback() {
		driver.navigate().back();
	}
	
	public static void navigateforward() {
		driver.navigate().forward();
	}
	
	public static void navigaterefresh() {
		driver.navigate().forward();
	}
	
	public static void geturl(String url) {
		driver.get("https://adactinhotelapp.com/");
	}
	
	public static void gettitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public static void getattribute(By bysearchbutton) {
		WebElement element = driver.findElement(bysearchbutton);
		System.out.println(element);
	}
	
	public void getcurrenturl(String currenturl) {
		String currenturl2= driver.getCurrentUrl();
		System.out.println(currenturl2);
	}
	
	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static void dropdownselection(WebElement element,String option,String input) {
		Select s = new Select(element);
		if(option.equals("index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);
		}else if (option.equals("value")) {
			s.selectByValue(input);
		}else if (option.equals("text")) {
			s.selectByVisibleText(input);
		}
	}
	public static void clickonelement(WebElement element) {
	element.click();
	}
	
	public static void inputtext(WebElement element,String inputvalue) {
	element.sendKeys(inputvalue);
	}
	
	public static void isenabled(WebElement element) {
		element.isEnabled();
	}
	
	public static void isdidplayed(WebElement element) {
		element.isDisplayed();
	}
	
	public static void isselected(WebElement element) {
		element.isSelected();
	}
	
	public static void simplealert() {
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
	}
	
	public static void confirmalert() {
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
	}
	
	public static void promptalert() {
		Alert promptalert = driver.switchTo().alert();
		promptalert.accept();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void dragdrop(WebElement drag,WebElement drop) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag,drop).build().perform();
	}
	
	public static void action(WebElement element){
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public static void frames(WebElement iframe)
	{
		//iframe.click();
		driver.switchTo().frame(0);
	}
	
	public static void takesscreenshot(String path) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(path);
		FileUtils.copyFile(srcfile, destfile);
	}
	
	public static void implicitwait() 
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public static void explicitwait(long seconds,WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void windowshandling()
	{
		driver.getWindowHandles();
	}
	
	public static void robot(WebElement element) throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void getselected()
	{
		Select select = new Select(driver.findElement(By.xpath("")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);
	}
	
	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


