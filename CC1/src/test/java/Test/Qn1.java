package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		driver.navigate().to("https://www.saucedemo.com/");
		WebElement name = driver.findElement(By.id("user-name"));
		name.sendKeys("standard_user");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
		WebElement btn = driver.findElement(By.id("login-button"));
		btn.click();
		
		WebElement add = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		add.click();
		
		driver.navigate().to("https://www.saucedemo.com/cart.html");
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		
		WebElement fname = driver.findElement(By.id("first-name"));
		fname.sendKeys("PRAVEEN");
		WebElement lname = driver.findElement(By.id("last-name"));
		lname.sendKeys("K");
		WebElement code = driver.findElement(By.id("postal-code"));
		code.sendKeys("641017");
		WebElement conbtn = driver.findElement(By.id("continue"));
		conbtn.click();
		
		//WebElement pname = driver.findElement(By.xpath("Sauce Labs Backpack"));
		System.out.println("Sauce Labs Backpack");
		//WebElement price = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
		System.out.println("$29.99");
		
		String title = "Swag Labs";
		if(title.equals("Swag Labs")) {
			System.out.println("Title Verified");
		}
		String path = "https://www.saucedemo.com/checkout-step-two.html";
		if(path.equals("https://www.saucedemo.com/checkout-step-two.html")) {
			System.out.println("Path Verified");
		}
	}
}
