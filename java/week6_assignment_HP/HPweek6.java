package week6_assignment_HP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HPweek6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notification");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://store.hp.com/in-en/default");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Mouse over on Laptops menu and click on Pavilion
		Actions builder = new Actions(driver);
		WebElement Laptops = driver.findElementByXPath("(//span[text()='Laptops'])[1]");
		builder.moveToElement(Laptops).perform();
		WebElement pavilion = driver.findElementByXPath("(//span[text()='Pavilion'])[1]");
		builder.moveToElement(pavilion).click().perform();

		// Under SHOPPING OPTIONS -->Processor -->Select Intel Core i7
		// driver.switchTo().frame("lightningjs-frame-usabilla_live");
		Thread.sleep(1000);
		/*
		 * driver.findElementByXPath("(//span[text()='Processor'])[1]").click();
		 * driver.findElementByXPath("(//span[text()='Processor'])[1]").click();
		 */
		// driver.findElementByXPath("//button[@title='Close']").click();
		driver.findElementByXPath("(//span[text()='Processor'])[2]").click();
		driver.findElementByXPath("//span[text()='Intel Core i7']/preceding-sibling::input").click();
		Thread.sleep(5000);

		// Hard Drive Capacity -->More than 1TB
		// driver.findElementByXPath("//span[text()='Hard Drive Capacity']").click();
		// driver.findElementByClassName("loading-mask").click();
		// driver.findElementByXPath("//button[@title='Close']").click();
		driver.findElementByXPath("//span[text()='More than 1 TB']/preceding-sibling::input").click();
		Thread.sleep(2000);

		// Select Sort By: Price: Low to High
		
		  driver.findElementByXPath("(//select[@id='sorter'])[1]").click();
		  driver.findElementByXPath("(//option[@value='price_asc'])[1]").click();
		  Thread.sleep(2000);
		  
		 

	}

}
