package lec5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lecc5 {
	WebDriver driver = new ChromeDriver();

	String	myURL ="file:///C:/Users/Sujood%20Al%20jondi/Desktop/disk/automation/New%20folder/index.html";

	@BeforeTest
	public void BeforeTest() {

		driver.manage().window().maximize();
		
	}
	@Test
	public void MyTest(){
		driver.get(myURL);
		List<WebElement> labletest=driver.findElements(By.className("lableeee"));
		
		for(int i=0;i<2;i++)
			System.out.println(labletest.get(i).getText());
		
		
	}
}
