package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn1 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);

driver.navigate().to("https://www.amazon.in/Puma-Mens-Poly-Suit-High/dp/B098TY6N2V/ref=sr_1_9?pf_rd_i=1968024031&pf_rd_m=A1K21FY43GMZF8&pf_rd_p=0a17d713-08fe-46a6-9a3a-94903ba09a77&pf_rd_r=0BVXERHQ8XM0F5FV7N7F&pf_rd_s=merchandised-search-14&pf_rd_t=101&qid=1681295170&refinements=p_85%3A10440599031%2Cp_n_pct-off-with-tax%3A2665401031%2Cp_n_feature_nineteen_browse-bin%3A11301357031%2Cp_89%3APuma%2Cp_72%3A1318477031&rnid=1318475031&rps=1&s=apparel&sr=1-9");
WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
addtocart.click();
WebElement check = driver.findElement(By.xpath("//*[@class=\"a-button-input\"]"));
check.click();
driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
WebElement del = driver.findElement(By.xpath("//*[@class=\"a-color-link\"]"));
del.click();


}
}








