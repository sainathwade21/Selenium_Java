package TakesScreenshot;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way_5 {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		EventFiringWebDriver e = new EventFiringWebDriver(driver);
		File src = e.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/img05.png");
		Files.copy(src, dest);
		
		driver.quit();
	
	}

}
