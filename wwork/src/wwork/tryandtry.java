package wwork;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class tryandtry {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Su//Downloads//drivers1//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.switchTo().activeElement().sendKeys("supriya");
		
		String value = driver.findElement(By.id("username")).getAttribute("type");
		
		System.out.println(value);
		
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
		String text = driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("title");
		
		
		System.out.println("tooltip message is  :"+ text);
		
		String text2 = driver.findElement(By.xpath(("//a[contains(text(),'actiTIME Inc.')]"))).getText();
		
		System.out.println("link text is  :"+text2);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='menuTable']//div[@class='popup_menu_container'])[1]")).click();
		
		
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
        r.keyRelease(KeyEvent.VK_CONTROL);
        
        r.keyRelease(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_DELETE);*/
		
		
		
	}

}
