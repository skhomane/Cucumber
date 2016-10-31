package automationutility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverUnit {
	
	public static WebDriver selenium=null;

	public static WebDriver setup_ChromeDriver(){

		DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();
		try {
			selenium=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
			//System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//selenium=new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return selenium;		
	}
	
	public static WebDriver setup_IEDriver(){

		DesiredCapabilities desiredCapabilities=DesiredCapabilities.internetExplorer();
		try {
			selenium=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
			//System.setProperty("webdriver.ie.driver", "D:\\Downloads\\IEDriverServer_Win32\\IEDriverServer.exe");
			//selenium=new InternetExplorerDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return selenium;		
	}
	
	
}
