package JavaPrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail2 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		List<String> chromeFlags = new ArrayList<String>();
		Collection<String> flags = Arrays.asList("--disable-blink-features=AutomationControlled", 
				"--start-maximized",
				"--disable-web-security", "--allow-running-insecure-content",
				"--disable-component-extensions-with-background-pages");

		// Add Chrome flags
		chromeFlags.addAll(flags);
		options.addArguments(chromeFlags);

		// Create WebDriver instance
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Hi.....");

		// Now you can use the WebDriver instance to navigate, etc.

		driver.get(
				"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ARZ0qKL6g7_Wn1MJSaLwSAURAdVq0XNgblwUBh1cJD6k87m1lOdiOybN1JEnN-U0Et0uNfc9Yy4-jw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1225728385%3A1712156673353837&theme=mn&ddm=0");

		WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement nextButton = driver.findElement(By.xpath("//button//span[text()='Next']"));
		emailField.sendKeys("k80471950@gmail.com"); // replace with your actual email
		nextButton.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement passwordField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type ='password']")));
		passwordField.sendKeys("Maxi@12mm");

		WebElement nextb = driver.findElement(By.xpath("//button//span[text()='Next']"));
		nextb.click();

		WebElement Composeb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-I T-I-KE L3']")));
		Composeb.click();

		WebElement ToField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':c4']")));
		ToField.sendKeys("kalpesh421993@gmail.com");

		WebElement Hovercard = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='aXS']")));
		Hovercard.click();

		WebElement SubjectField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':8i']")));
		SubjectField.sendKeys("Imp notice");

		WebElement writebox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=':9s']")));
		writebox.sendKeys("Hello this is kalpesh pawar,i have extensive experience in Automation testing");

		WebElement sendbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=':88']")));
		sendbutton.click();

		

		// Close the WebDriver instance
		driver.quit();

	}

}
