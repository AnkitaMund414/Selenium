package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frotendlogin {
	@Test
	public static void LoginNow() throws InterruptedException
	{
	//Initializing the Driver
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//Open browser
	driver.get("https://accounts.datoms.io/login");

	//Finding element for login Form
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
	driver.findElement(By.xpath("//*[@id='form_submit_btn']")).click();

	

	//Extracting the error messgae
	WebElement ErrorMSG = driver.findElement(By.xpath("//*[@id='show_message']"));
	Thread.sleep(3000);
	String error_msg = ErrorMSG.getText();
	System.out.println("The error msg is "+error_msg);

	driver.quit();

	}
}

	