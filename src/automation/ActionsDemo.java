package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/");

//driver.get("https://demoqa.com/droppable");



driver.manage().window().maximize();

Actions a = new Actions (driver);

WebElement d  = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//a.click(d).build().perform();

a.contextClick(d).build().perform();

Robot R=new Robot();
R.keyPress(KeyEvent.VK_DOWN);
R.keyPress(KeyEvent.VK_ENTER);

WebElement CS = driver.findElement(By.xpath("//a[text()='Customer Service']"));

a.contextClick(CS).build().perform();

Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);

WebElement E = driver.findElement(By.xpath("//a[text()=' Electronics ']"));

a.contextClick(E).build().perform();

Robot r1=new Robot();
r1.keyPress(KeyEvent.VK_DOWN);
r1.keyPress(KeyEvent.VK_ENTER);




//WebElement drag = driver.findElement(By.id("draggable"));

//WebElement drop = driver.findElement(By.id("droppable"));

//a.clickAndHold(drag).moveToElement(drag).release(drop).build().perform();



 int size = driver.getWindowHandles().size();
 
 System.out.println(size);
 
Set<String> allwind =  driver.getWindowHandles();

for(String aw:allwind) {
	
	String title = driver.switchTo().window(aw).getTitle();
	
	System.out.println(title);
}

String pw = driver.getWindowHandle();

System.out.println(pw);


	
	String Actual_title = "Help - Amazon Customer Service";
	
	for(String aw:allwind) {
		
		if(driver.switchTo().window(aw).getTitle().equals(Actual_title)) {
			break;
		
		
		}
	}
		
		for(String aw:allwind) {
			
			if(!aw.equals(pw)) {
				
				driver.switchTo().window(aw);
				driver.close();
			}
			
		}
	}
	
	}

	

