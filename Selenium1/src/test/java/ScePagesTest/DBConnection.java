package ScePagesTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClass.TestBase2;

public class DBConnection 
{
	WebDriver driver;
	String url = "https://www.redbus.in/";
	@Test
	public void redBus() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("label[class='db text-trans-uc']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal' or @class='rb-calendar']//following::td[3]"))));
		int TotalDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//following::tr[10]/td]")).size();
		System.out.println(TotalDates);
		
		for (int i = 0; i < TotalDates; i++) 
		{			
			String date = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal' or @class='rb-calendar']//following::td[3]")).get(i).getText();
			if (date.equalsIgnoreCase("17")) 
			{
				
				driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal' or @class='rb-calendar']//following::td[3]")).get(i).click();
				break;
			} 
		}
		
		
		
		
		
	}

}
