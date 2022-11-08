package automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
	public static WebDriver driver;
	public static int totalNumberOfProducts;
	public static int miniPrice;
	
	public static void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");

	driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
			
	}
	
	// Task 1

	public static void productsCount() {
		
		List <WebElement> allProducts = driver.findElements(By.xpath("//li[@class='product-base']"));
		
		totalNumberOfProducts = allProducts.size();
	
	System.out.println("Total count Of Products is :"+totalNumberOfProducts);
	
	}
	
	//Task 2
	
	
	public static void miniumPriceOfallProducts () {
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		List<WebElement> allPrices = driver.findElements(By.xpath("//li[@class='product-base']//descendant::div[@class='product-price']//descendant::span[@class='product-discountedPrice']"));
		List<WebElement> allPrices2 = driver.findElements(By.xpath("//li[@class='product-base']//descendant::div[@class='product-price']"));
		for(WebElement price:allPrices2) {
			String substring = "";
			String priceText = price.getText().replaceAll("Rs. ", "");
			if(priceText.length()==4) {
				 substring = priceText.substring(0,3);
			}else if(priceText.length()==3){
				 substring = priceText.substring(0,3);
			}
			
			
			int priceValue = Integer.parseInt(substring);
			
			priceList.add(priceValue);
		}
		
		miniPrice = Collections.min(priceList);
		System.out.println("Minimum Price of all product is: "+miniPrice);
		
	}
	public static void minimumPriceProductName(int price) {
		////li[@class='product-base']//descendant::div[@class='product-price']//descendant::span[@class='product-discountedPrice']//ancestor::div[@class='product-price']//preceding-sibling::h3[@class='product-brand']
		WebElement minimumPriceProductName = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()="+price+"]//ancestor::div[@class='product-price']//preceding-sibling::h3[@class='product-brand'][1]"));
		String productName = minimumPriceProductName.getText();
		System.out.println(productName);
	}
	
	public static void main(String[] args) {
		browserLaunch();
		productsCount();
		miniumPriceOfallProducts ();
		minimumPriceProductName(miniPrice);
	}
	
	}


