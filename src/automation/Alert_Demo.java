package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		driver.findElement(By.id("alertButton")).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("promtButton")).click();

		driver.switchTo().alert().sendKeys("Guru");

		driver.switchTo().alert().accept();

	}

}
