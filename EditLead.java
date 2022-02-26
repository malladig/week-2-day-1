package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver chd= new ChromeDriver();
		chd.get("http://leaftaps.com/opentaps/control/main");
		chd.manage().window().maximize();
		WebElement uname=chd.findElement(By.id("username"));
		uname.sendKeys("Demosalesmanager");
		WebElement pwd=chd.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement login=chd.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link=chd.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement tab=chd.findElement(By.linkText("Leads"));
		tab.click();
		WebElement cl=chd.findElement(By.linkText("Create Lead"));
		cl.click();
		WebElement cn=chd.findElement(By.id("createLeadForm_companyName"));
	    cn.sendKeys("ValueMomentum");
	    WebElement fn=chd.findElement(By.id("createLeadForm_firstName"));
	    fn.sendKeys("Gayathri");
	    WebElement ln=chd.findElement(By.id("createLeadForm_lastName"));
	    ln.sendKeys("Malladi");
	    WebElement localname=chd.findElement(By.id("createLeadForm_firstNameLocal"));
	    localname.sendKeys("gayathri");
	    WebElement deptname=chd.findElement(By.id("createLeadForm_departmentName"));
	    deptname.sendKeys("IT");
	     WebElement dsc= chd.findElement(By.id("createLeadForm_description"));
	     dsc.sendKeys("Test test");
	    chd.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("malladigayathriqa@gmail.com");
	    WebElement sp=chd.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd=new Select(sp);
	    dd.selectByVisibleText("New York");
	    
	    chd.findElement(By.className("smallSubmit")).click();
	    chd.findElement(By.linkText("Edit")).click();
	     WebElement cleardescription= chd.findElement(By.id("updateLeadForm_description"));
	     cleardescription.clear();
	    
	    chd.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing");
	    chd.findElement(By.name("submitButton")).click();

	   System.out.println("The title is"+chd.getTitle());

	}

}
