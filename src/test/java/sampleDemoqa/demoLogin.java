package sampleDemoqa;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoLogin {
	public static void selenumTest() {
	//static HashMap<String, Double> Limna;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\limna\\eclipse-workspace\\Sample_demoqa\\src\\test\\resources\\driver\\chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions();
	//chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER); //Only wait for HTML
	chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	//chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);  wait for none
	chromeOptions.addExtensions(new File("C:\\Users\\limna\\eclipse-workspace\\Sample_demoqa\\src\\test\\resources\\CRXfile\\BlockSite-Block-Websites-Stay-Focused.crx"));
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://demoqa.com/books");
	driver.findElement(By.id("login")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoqa.com/login");
	driver.findElement(By.id("userName")).sendKeys("Limna");
	driver.findElement(By.id("password")).sendKeys("dummypassword");
	driver.findElement(By.id("newUser")).submit();
	//driver.findElement(By.id("newUser")).click();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoqa.com/register");
	driver.findElement(By.id("firstname")).sendKeys("Limna ");
	driver.findElement(By.id("lastname")).sendKeys("Koonjakkaran");
	driver.findElement(By.id("userName")).sendKeys("Limna");
	driver.findElement(By.id("password")).sendKeys("dummypassword");
	//WebElement test = driver.findElement(By.id("firstname"));
	chromeOptions.addExtensions(new File("C:\\Users\\limna\\eclipse-workspace\\Sample_demoqa\\src\\test\\resources\\CRXfile\\BlockSite-Block-Websites-Stay-Focused.crx"));
	// way 1 direct way
	List<WebElement> inputElements = driver.findElements(By.tagName("DIV"));
	System.out.println(inputElements);
	//System.out.println(driver.findElement(By.id("DIV")));
	
	//way 2 indirect way when we dont know about the exsistance of web element
	List<WebElement> dummyElements = driver.findElements(By.id("output"));
	
	if(dummyElements.size() >= 1) {
		System.out.println(driver.findElement(By.id("output")));
	}
	
	chromeOptions.addExtensions(new File("C:\\Users\\limna\\eclipse-workspace\\Sample_demoqa\\src\\test\\resources\\CRXfile\\BlockSite-Block-Websites-Stay-Focused.crx"));
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement test = driver.findElement(By.id("userNumber"));
	System.out.println(test.getAttribute("maxlength"));
	System.out.println(test.getCssValue("font-size"));
	System.out.println(test.getCssValue("font-family"));
	System.out.println(test.getLocation().x);
	System.out.println(test.getLocation().y);
	System.out.println(test.getRect());
	WebElement test1 = driver.findElement(By.id("dateOfBirth-label"));
	System.out.println(test1.getText());
	//if
	driver.findElement(By.id("dateOfBirthInput")).click();
	//Drop down
	WebElement SelectBox = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]"));
	
	List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[6]"));
	for(WebElement option : options) {
		option.click();
		//Thread.sleep(1000);
	}
	
	List<WebElement> options2 = driver.findElements(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[124]"));
	for(WebElement option : options2) {
		option.click();
		//Thread.sleep(1000);
	}
	List<WebElement> options3 = driver.findElements(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]"));
	for(WebElement option : options3) {
		option.click();
		//Thread.sleep(1000);
	}
	String subjectCheckInput = "English~Chemistry~Commerce~Economics~Social Studies~Computer Science";
	String[] entinputs = subjectCheckInput.split("~");
	for(String entinput: entinputs) {
		driver.findElement(By.id("subjectsInput")).click();
		driver.findElement(By.id("subjectsInput")).sendKeys(entinput, Keys.ARROW_DOWN,Keys.ENTER);
		
	}
	
	String chxBoxInput = "Sports~Reading~Music";
	
	String[] inputs = chxBoxInput.split("~");
	for(String input : inputs)
	{
		if(input.equalsIgnoreCase("Sports")) {
			driver.findElement(By.id("hobbies-checkbox-1")).click();
		}
		if(input.equalsIgnoreCase("Reading")) {
			driver.findElement(By.id("hobbies-checkbox-2")).click();
		}
		if(input.equalsIgnoreCase("Music")) {
			driver.findElement(By.id("hobbies-checkbox-3")).click();
		}
	}
	
	
	//System.out.println("The Output of the IsSelected " +driver.findElement(By.id("DIV")));
	//driver.findElement(By.id("recaptcha-anchor")).click();
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView();", "recaptcha-anchor");
	
//	chromeOptions.addExtensions(new File("C:\\Users\\limna\\eclipse-workspace\\Sample_demoqa\\src\\test\\resources\\CRXfile\\BlockSite-Block-Websites-Stay-Focused.crx"));
//	driver.findElement(By.id("recaptcha-anchor")).click();
//	System.out.println("The Output of the IsSelected " +driver.findElement(By.id("recaptcha-anchor")).isSelected());
//	System.out.println("The Output of the IsEnabled " +driver.findElement(By.id("recaptcha-anchor")).isEnabled()); 
//	System.out.println("The Output of the IsDisplayed " +driver.findElement(By.id("recaptcha-anchor")).isDisplayed()); 
//	
	//driver.findElement(By.id("register")).click();
	
	}
	
	public static void main(String[] args) {
		
		selenumTest();
	}

}
