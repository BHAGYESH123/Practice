package seleniumgrid;





	import org.testng.annotations.Test;
	import org.testng.annotations.Test;
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class SeleniumGridTest 
	{
		public WebDriver driver;
		
		@Parameters ({"browser"})
		@BeforeTest
		public void openBrowser(String browsernm) throws MalformedURLException
		{
			if(browsernm.equalsIgnoreCase("chrome"))
			{
			System.out.println("In Chrome browser");
			DesiredCapabilities cap =new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WIN10);		
			System.setProperty("webdriver.chrome.driver", "F:\\cjc software\\chromedriver.exe");
			//String node="http://localhost:4444/wd/hub";
			String node="http://localhost:9890/wd/hub";		
			driver = new RemoteWebDriver(new URL(node),cap);
			System.out.println("Chrome browser is opened successfully");			
		    }else if(browsernm.equalsIgnoreCase("ie"))
		    {
		    	System.out.println("In IE browser");
		    	DesiredCapabilities cap= new DesiredCapabilities();
		    	cap.setBrowserName("internetExplorer");
		    	cap.setPlatform(Platform.LINUX);
		    	System.setProperty("webdriver.ie.driver", "F:\\Selenium Setup\\setup1\\11092019\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		    	String node="http://localhost:4444/wd/hub";
		    	//String node="http://localhost:9892/wd/hub";
		    	driver = new RemoteWebDriver(new URL(node),cap);
		    	System.out.println("IE browser is opeded successfully");
		    }else
		    {
		    	System.out.println("In firefox browser");
		    	DesiredCapabilities cap= new DesiredCapabilities();
		    	cap.setBrowserName("internetExplorer");
		    	cap.setPlatform(Platform.MAC);
		    	System.setProperty("webdriver.gecko.driver", "F:\\Selenium Setup\\setup1\\11092019\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		    	String node="http://localhost:4444/wd/hub";
		    	//String node="http://localhost:9894/wd/hub";
		    	driver = new RemoteWebDriver(new URL(node),cap);
		    	System.out.println("Firefox browser is opeded successfully");
		    }
		}
		
		@Test
		public void enterApplicationURL()
		{
			driver.get("http://www.newtours.demoaut.com/");
		}
		

	}

	
