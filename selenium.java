package JavaPrograms;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium {
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver= new ChromeDriver();
			//WebDriverWait wait=new WebDriverWait(driver, 20);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        driver.get("http://www.automationpractice.pl/index.php");
			driver.manage().window().maximize();
			
	        Wait<WebDriver>  wait =new FluentWait<WebDriver>(driver)
	        		.withTimeout(Duration.ofSeconds(10))
	        		.pollingEvery(Duration.ofSeconds(2))
	        		.withMessage("custom ")
	        		.ignoring(NoSuchElementException.class);
	        
		
			
			//Thread.sleep(2000);
			
			
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"))).click();
			driver.findElement(By.id("email")).sendKeys("kalpesh421993@rediffmail.com");
			driver.findElement(By.name("passwd")).sendKeys("Maxi@12mm");
			driver.findElement(By.name("SubmitLogin")).click();
			
			//WebElement guru99seleniumlink;
			//guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "")));
			
			//js.executeScript("window.scrollBy(0,500);");
			
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("selectProductSort")).click();
			js.executeScript("window.scrollBy(0,500);");

			
		}
}
