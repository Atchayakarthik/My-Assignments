package week2.day0;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(200);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(200);
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("(//table//td[@class='we day'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		WebElement sleeper = driver.findElement(By.xpath("//label[@title='SLEEPER']"));
		driver.executeScript("arguments[0].click();",sleeper);
		
		

	}

}
