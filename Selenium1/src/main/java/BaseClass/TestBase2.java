package BaseClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ScePages.OwnerPage;

public class TestBase2 
{

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase2()
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\nmaddala\\eclipse-workspace\\SceTest\\src\\main\\java\\Config\\config.properties");
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
	}
	
	public static void initialization()
	{
		String BrowserName = prop.getProperty("Browser");
		
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(BrowserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("PageLoadTimeout")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("ImplicitWait")), TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	public void Wait(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void WaitToclickable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void MouseOver(WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public void actions(WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.click(element).build().perform();
	}
	
	public void ScrollDown(String ele)
	{
		OwnerPage pf = PageFactory.initElements(driver, OwnerPage.class);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	
		/* WebElement element= driver.findElement(By.xpath(ele));
		((JavascriptExecutor)driver).executeScript("scroll(0,900)");*/
	}
	
	public void sleep(long a)
	{
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

