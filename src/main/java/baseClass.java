import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseClass {
public static WebDriver driver;	 
public static Select drop;
	

public static void initialise () {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Project\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
}

public static void staticDropdown() {
	WebElement dropdown = driver.findElement(By.xpath("//fieldset/child::select[@id='dropdown-class-example' and @name='dropdown-class-example']"));
	drop = new Select(dropdown);
	//drop.selectByIndex(0);
	drop.selectByValue("Option1");
	
			
}

public static void alert() {
	driver.findElement(By.id("alertbtn")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
}
public static void action() {
	Actions a = new Actions(driver);
	WebElement scroll = driver.findElement(By.xpath("//legend[contains(text(),'Web Table Fixed header')]"));
	a.scrollToElement(scroll).build().perform();
	
}


public static void main(String[] args) {
	 initialise ();
	 staticDropdown();
	 alert();
	 action();
	 System.out.println("There will be blank");
	 System.out.println("Blank Space");
	 
}

}
