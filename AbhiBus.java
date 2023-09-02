package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("pills-home-tab"));
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();   // doubt bec id end with number
		driver.findElement(By.xpath("//a[text()='2']")).click();
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.id("Bustypes4")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(@class,'noseats AvailSts')]")).getText()); //rut0 xpath 
		driver.findElement(By.xpath("//span[@class='book']")).click();
		driver.findElement(By.xpath("//a[@id='UO1-5ZZ']")).click(); // ruto 
		System.out.println(driver.findElement(By.xpath("//p[@class='left']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@id='seatnos']")).getText()); 
		System.out.println(driver.findElement(By.xpath("(//p[@class='left'])[2]")).getText());
		System.out.println(driver.findElement(By.id("ticketfare")).getText());
		Select bo = new Select(driver.findElement(By.name("boardingpoint_id")));
		bo.selectByIndex(9);
		Select dr = new Select(driver.findElement(By.name("droppingpoint_id")));
		dr.selectByIndex(3);
		
		System.out.println(driver.getTitle());
		//driver.close();

	}

}
