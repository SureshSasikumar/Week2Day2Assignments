package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suresh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("90801");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("90pppp");
		WebElement dd=driver.findElement(By.id("day"));
		Select se=new Select(dd);
		se.selectByVisibleText("25");
		WebElement mo=driver.findElement(By.id("month"));
		Select s=new Select(mo);
		s.selectByVisibleText("Jan");
		WebElement yr=driver.findElement(By.id("year"));
		Select sec=new Select(yr);
		sec.selectByVisibleText("1994");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
	}

}
