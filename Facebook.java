package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	ChromeDriver driver=new ChromeDriver();

	
	public void launch() {
		//LAunching the URL with implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	
	public void createAccount() {
		driver.findElement(By.linkText("Create new account")).click();
		//First,surname and mobile
		driver.findElement(By.name("firstname")).sendKeys("Bala");
		driver.findElement(By.name("lastname")).sendKeys("Raman");
		driver.findElement(By.name("reg_email__")).sendKeys("Test123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
      
		//DOB dropdown
		Select DOB=new Select(driver.findElement(By.id("day")));
		DOB.selectByValue("2");
		Select Month=new Select(driver.findElement(By.id("month")));
		Month.selectByIndex(11);
		Select Year=new Select(driver.findElement(By.id("year")));
		Year.selectByValue("1994");
		
		//Radio button
		driver.findElement(By.id("sex")).click();
		
		//Signup
		driver.findElement(By.name("websubmit")).click();
		
	}
	
	public void close() {
		driver.close();
	}
	public static void main(String[] args) {
       Facebook exec=new Facebook();
       exec.launch();
       exec.createAccount();
       exec.close();
	}

}
