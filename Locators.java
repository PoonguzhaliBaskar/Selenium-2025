package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	ChromeDriver driver=new ChromeDriver();

	public void Login(){
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Login user name and pwd
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		driver.findElement(By.id("password")).sendKeys("Demo");
		driver.findElement(By.className("decorativeSubmit")).click();
						
	}
	
	public void CreateAccount() {
		//Click on SRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.linkText("Create Account")).click();
				WebElement Accname1=driver.findElement(By.id("accountName"));
						Accname1.sendKeys("Test Account");
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				//Industry dropdown
				Select dropdown=new Select(driver.findElement(By.name("industryEnumId")));
				dropdown.selectByValue("IND_DISTRIBUTION");
				
				//Ownership dropdown
				Select ownership=new Select(driver.findElement(By.className("inputBox")));
				ownership.selectByVisibleText("S-Corporation");
				
				//Emp
				Select emp=new Select(driver.findElement(By.id("dataSourceId")));
                   emp.selectByValue("LEAD_EMPLOYEE");
                   
                //Campaign
                  Select camp=new Select(driver.findElement(By.id("")));
                  
                  //Create account
                  driver.findElement(By.className("smallSubmit")).click();
                  
                  
                  //Checking the account name
                  WebElement Accountname = driver.findElement(By.className("tabletext"));
                  String Name = Accountname.getText();
                  if(Name.contains(Accname1.getText())){
                	 System.out.println("Account name is correct");
                	  driver.close();
                  }
                   
	}
	

	public static void main(String[] args) {
       Locators exec=new Locators();
       exec.Login();
       exec.CreateAccount();
       
	}

}
