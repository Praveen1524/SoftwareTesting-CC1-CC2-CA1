package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Qn2 {
    public static void main( String[] args ) throws InterruptedException
    {
    	        WebDriverManager.chromedriver().setup();
    	    	ChromeOptions co=new ChromeOptions();
    	    	co.addArguments("--remote-allow-origins=*");
    	    	WebDriver driver=new ChromeDriver(co);
    	    	driver.manage().window().maximize();
    	    	driver.get("https://www.amazon.in/gp/product/B07Y5BKQ5R/ref=ewc_pr_img_1?smid=A1WYWER0W24N8S&psc=1");
    	    	driver.findElement(By.id("add-to-cart-button")).submit();
    	    	String t=driver.getTitle();
    	    	System.out.println(t);
    	    	
    	    	
    	    	String cart=driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
    	     	if(cart.equals("Added to cart"));
    	     		System.out.println("1.  Verified that Product added to cart ");
    	     		
    	     		driver.navigate().back();
        	    	
        	    	WebElement sort1=driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
                	sort1.click();
                	Select select=new Select(sort1);
                	select.selectByIndex(1);
                	
                	String drop=driver.findElement(By.xpath("//*[@id=\"quantity\"]")).getText();
        	     	if(drop.equals("2"));
        	     		System.out.println("3.  Verified that Product is updated to cart ");	
    }
}


//package Project;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Qn2 {
//
//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver;
//		ChromeOptions co =new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		
//		driver=new ChromeDriver(co);
//		driver.navigate().to("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		search.click();
//		search.sendKeys("footwear");
//		System.out.println("footwear");
//		search.clear();
//		WebElement filter = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
//		filter.click();
//	}
//}
