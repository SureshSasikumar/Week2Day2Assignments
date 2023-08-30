package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	//String title = driver.getTitle();
	//System.out.println(title);
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Suresh");
	driver.findElement(By.id("lastNameField")).sendKeys("S");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sasi");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("D");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Selenium");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Best Platform");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sasisuresh.s@gmail.com");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Selenium");
    WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
    Select sec=new Select(state);
    sec.selectByVisibleText("New York");
    driver.findElement(By.name("submitButton")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("updateContactForm_description")).clear();
    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("good platfom to learn");
    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    String title = driver.getTitle();
	System.out.println(title);

	}

	private static WebElement findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}
}