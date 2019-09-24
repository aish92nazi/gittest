package gittest;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitTest {
	@Test
public void loginTest() throws IOException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayisha\\Downloads\\chromedriver.exe");
	WebDriver wd= new ChromeDriver();
	wd.get("https://www.google.com/");
	WebElement s= wd.findElement(By.name("q"));
	s.sendKeys("Chennai");
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("F:\\testng\\git-test\\screenshot\\sample.jpg"));
	}
}
