package com.MavenProjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial 
{

	public static void main(String[] args) throws  InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","E:\\programs\\MavenProjects\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
}
}