package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws Throwable {

		File f = new File("E:\\programs\\MavenProjects\\src\\test\\java\\com\\properties\\com\\TestData.Properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("Url");
		return url;
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
 
	}

	public String getpassword() {
		String password = p.getProperty("password");
       return password;

	}
	
	public String getcardno() {
		String cardno =p.getProperty("cardno");
		return cardno;
		

	}
	
	public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
