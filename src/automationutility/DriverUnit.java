package automationutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUnit {
	
	public static WebDriver selenium=null;

	public static WebDriver setup_ChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		selenium=new ChromeDriver();
		return selenium;		
	}
	
	public static WebDriver setup_IEDriver(){
		System.setProperty("webdriver.ie.driver", "D:\\Downloads\\IEDriverServer_Win32\\IEDriverServer.exe");
		selenium=new InternetExplorerDriver();
		return selenium;		
	}
	
	
}
