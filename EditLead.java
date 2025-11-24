package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class EditLead extends DeleteLead{
	    
	public void EditLead()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//Company name
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Test LEaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bala");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raman");
		driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("Local  name Raman");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
        driver.findElement(By.name("importantNote")).sendKeys("Test Desc");
        Actions actions = new Actions(driver);
     // Scroll down by 500 pixels
     actions.scrollByAmount(0, 500).perform();
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Bala_poo@yahoo.com");
        Select state=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
        state.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        //Edit
        driver.findElement(By.className("subMenuButton")).click();
        driver.findElement(By.name("description")).clear();
        //important note
        driver.findElement(By.name("importantNote")).sendKeys("Note Added");
        //submit
        driver.findElement(By.name("submitButton")).click();
        String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
        System.out.println(text);
        driver.close();
	}

	public static void main(String[] args) {
		 EditLead obj=new EditLead();
	     	obj.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     	obj.Login();
	     	obj.EditLead();

	}

}
