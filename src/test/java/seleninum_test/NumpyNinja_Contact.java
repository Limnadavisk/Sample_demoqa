package seleninum_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumpyNinja_Contact {
public void NumpyNinjaContact_test() {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/vijayabharathi/eclipse-workspace-bharathi/SDET117_Selenium/src/test/resources/drivers/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.numpyninja.com/contact");
		
		
		WebElement frstName = driver.findElement(By.name("first-name"));
		frstName.sendKeys("Limna");		
		
		WebElement lastName = driver.findElement(By.id("input_comp-l1c0ku01"));
		lastName.sendKeys("Sojan");	
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("limnadavisk@gmail.com");
			
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("8189667610");
		
		WebElement query = driver.findElement(By.id("textarea_comp-l1c0ku07"));
		query.sendKeys("when next SDET batch will start ?");
		
		WebElement sendBtn = driver.findElement(By.id("comp-l1c0ku0e3"));
		sendBtn.click();
		
		//driver.close();
}
		
		

	public static void main(String[] args) {
		
		NumpyNinja_Contact obj = new NumpyNinja_Contact();
		obj.NumpyNinjaContact_test();

	}

}
