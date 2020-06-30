package week6_assignment_HP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomcar {
	public static String highPricedCarRide;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		
		// Click on the Start your wonderful journey link
		driver.findElementByXPath("//a[@class='search']").click();
		Thread.sleep(2000);
		
		//In the Search page, Click on any pick up point under POPULAR PICK-UP
		//driver.findElementByXPath("(//div[@class='items picked'])[1]").click();
		driver.findElementByXPath("//div[text()='Popular Pick-up points']/following-sibling::div").click();
		
		// Click on the Next button
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(1000);
		// Specify the Start Date as tomorrow Date
		String startDate= driver.findElementByXPath("(//div[@class='day low-price'])[1]").getText();
		System.out.println(startDate);
		driver.findElementByXPath("(//div[@class='day low-price'])[1]").click();
		
		
		// Click on the Next Button
		driver.findElementByXPath("//button[text()='Next']").click();
		//Confirm the Next day of Start Date and Click on the Done button
		String comparedate= driver.findElementByXPath("//div[@class='day picked low-price']").getText();
		System.out.println(comparedate);
		if(startDate.equals(comparedate))
		{
			System.out.println("Date matched");
		}
		else
		{
			System.out.println("Date not matched");
		}
		driver.findElementByXPath("//button[text()='Done']").click();
		
		//In the result page, capture the number of results displayed.

		Map<String,String> map = new LinkedHashMap<String,String>(); //create map to store key and value pairs.
		
		List<WebElement> carNames = driver.findElementsByXPath("//div[@class='details']/h3"); //get all car names in list
		
		List<WebElement> carPrices = driver.findElementsByXPath("//div[@class='price']");//get all car prices in list
		
		//Iterate through each list and add car name and car price to map respectively.
		for (int i = 0; i <carNames.size(); i++) {
			
			String carNameKey = carNames.get(i).getText(); //get Car name
			
			String carPriceValue = carPrices.get(i).getText().replaceAll("[^0-9]", ""); //get car price
		
			map.put(carNameKey,carPriceValue);		//add car name and car price to map
			
		}	
		
		//Get the size of map(number of results displayed)
		System.out.println("No of results dispalyed is:"+map.size());
		
		//Find the highest priced car ride.
		String highestPriceDisplayed = Collections.max(map.values()); //Highest Car price displayed
		System.out.println("Highest Car Price Displayed is:"+highestPriceDisplayed);
		
		for (Entry<String, String> eachEntry : map.entrySet()) {
			if ((eachEntry.getValue()).equals(highestPriceDisplayed)) 
			{
				
				highPricedCarRide = eachEntry.getKey(); //highest priced car ride
				System.out.println("Highest priced car is: "+highPricedCarRide);
			}
		}
		
		
		/*
		 * List<WebElement> cardetails =
		 * driver.findElementsByXPath("//div[@class='component-car-item']"); int
		 * carcount=cardetails.size();
		 * System.out.println("Count of cars is "+cardetails.size()); //Find the highest
		 * priced car ride Map<String,Integer> carMap=new HashMap<String,Integer>(); for
		 * (int i=1;i<=carcount;i++) {
		 * 
		 * 
		 * String
		 * carname=driver.findElementByXPath("(//div[@class='details']/h3)["+i+"]").
		 * getText(); String
		 * caramount=driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText
		 * (); caramount=caramount.replaceAll("\\D",""); int carPrice =
		 * Integer.parseInt(caramount); System.out.println(carname+","+carPrice);
		 * 
		 * carMap.put(carname,carPrice); } System.out.println(carMap);
		 */
		
		
		
		
		

	}

}
