package Dropdown_Handling_SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_selectByIndex {						//Select class is used to handle the dropdown
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
			
		//xpath of country single_select_dropdown
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='select3']"));
			
			Select s1=new Select(dropdown);
			s1.selectByIndex(3);
		
			
	}

}
