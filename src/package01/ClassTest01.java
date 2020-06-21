package package01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClassTest01 {

	@Test
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\BatchMarch2020\\jars\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();//for window maximize
	
		driver.findElement(By.cssSelector("#u_0_m")).sendKeys("Mahfuj");
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("Tuhin");
		driver.findElement(By.cssSelector("#u_0_r")).sendKeys("mahfujtuhin@gmail.com");
		driver.findElement(By.cssSelector("#u_0_u")).sendKeys("mahfujtuhin@gmail.com");
		driver.findElement(By.cssSelector("#u_0_w")).sendKeys("gopass");
		
		WebElement elem=driver.findElement(By.cssSelector("#month"));
		WebElement eled=driver.findElement(By.cssSelector("#day"));
		WebElement eley=driver.findElement(By.cssSelector("#year"));
		
		Select selm=new Select(elem);
		Select seld=new Select(eled);
		Select sely=new Select(eley);
		
		selm.selectByVisibleText("May");
		seld.selectByIndex(8);
		sely.selectByValue("1988");
		
		driver.findElement(By.cssSelector("#u_0_7")).click();
		driver.findElement(By.cssSelector("#u_0_13")).click();//Sign Up

	}

}
