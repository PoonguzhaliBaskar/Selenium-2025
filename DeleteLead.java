package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteLead {
       
	// ChromeOptions options=new ChromeOptions();
    ChromeDriver driver=new ChromeDriver();
    

	public void Login(){
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//Login user name and pwd
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	public void CreateAccount() throws InterruptedException {
		//Click on SRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.linkText("Phone")).click();
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9874562130");
				driver.findElement(By.linkText("Find Leads")).click();
				//Getting text
				WebElement element = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
				String text = element.getText();
				System.out.println(text);
				driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
				driver.findElement(By.linkText("Delete")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
                Thread.sleep(3000);
				Actions act=new Actions(driver);
				act.scrollToElement(driver.findElement(By.xpath("//div[contains (@class,'x-paging')]")));
			String text2 = driver.findElement(By.xpath("//div[contains (@class,'x-paging')]")).getText();
				System.out.println(text2);
				if(text!=text2) {
					System.out.println("Lead sucessfully deleted");
				}
				driver.close();
						
	}
				
	public static void main(String[] args) throws InterruptedException {
		
		// ChromeOptions options=new ChromeOptions();
	     // options.addArguments("guest");
	      DeleteLead obj=new DeleteLead();
	     	obj.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		   obj.Login();
		   obj.CreateAccount();

	}

}
