package lec5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class lec5 {
	WebDriver driver = new ChromeDriver();
	String myURL = "https://www.saucedemo.com/";

	@BeforeTest
	public void BeforeTest() {

		driver.manage().window().maximize();

	}

	@Test
	public void MyTest() {
		driver.get(myURL);

		WebElement Username = driver.findElement(By.name("user-name"));
		WebElement Password = driver.findElement(By.name("password"));
		WebElement LOGINBUTTON = driver.findElement(By.name("login-button"));
		Username.sendKeys("problem_user");
		Password.sendKeys("secret_sauce");
		LOGINBUTTON.click();
		
		
		

		List<WebElement> addToCart = driver.findElements(By.className("btn"));
		for (int i = 0; i < addToCart.size(); i++) {
			addToCart.get(i).click();
		}
	}

	@AfterTest
	public void AfterTest() {

	}

}
