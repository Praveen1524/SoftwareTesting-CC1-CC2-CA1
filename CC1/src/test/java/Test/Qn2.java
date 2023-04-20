package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn2 {

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
		
		WebElement filter = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		filter.click();
		String prod1="Sauce Labs Backpack";
		WebElement filterdesc = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
		System.out.println(prod1);
		filterdesc.click();
		String prod2="Test.allTheThings() T-Shirt (Red)";
		System.out.println(prod2);
		WebElement filter3 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
		filter3.click();
		String prod3="Sauce Labs Onesie";
		System.out.println(prod3);
		WebElement filter4 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
		filter4.click();
		String prod4="Sauce Labs Fleece Jacket";
		System.out.println(prod4);

	}
}
