package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Practice {
	@Test
	
	public void test() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir+"\\Resource\\Drivers\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser Launched");
		
		driver.get("https://www.flipkart.com/");
		
		String actualUrl="https://www.flipkart.com/";
		String expectedUrl= driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		WebElement username_input=driver.findElement(By.xpath("//label//span[text()='Enter Email/Mobile number']"));
		WebElement password_input=driver.findElement(By.xpath("//label//span[text()='Enter Password']"));
		WebElement login_button=driver.findElement(By.xpath("//button//span[text()='Login']"));
		
		String Username = "AutomationTesting";
		String Password = "AutomationTesting";
		username_input.sendKeys(Username);
		password_input.sendKeys(Password);
		
		String UserNameEntered= username_input.getText();
		String PasswordEntered= password_input.getText();
		Assert.assertEquals(UserNameEntered, Username);
		Assert.assertEquals(PasswordEntered, Password);
		login_button.click();
		
		WebElement Cross_Button = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		Cross_Button.click();
		
		WebElement Label_Mobile = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		Label_Mobile.click();
		
		WebElement Label_Electronics =driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Label_Electronics);
		
		WebElement Label_Speakers =driver.findElement(By.xpath("//a[@title='Speakers']"));
		Label_Speakers.click();
		
		WebElement Label_BluetoothSoundbar =driver.findElement(By.xpath("//a[@title='F&D T 200X 70 W Bluetooth Soundbar']"));
		Label_BluetoothSoundbar.click();
		
		WebElement Label_AddToCart =driver.findElement(By.xpath("//button[text()='Add to Cart']"));
		Label_AddToCart.click();
		
		
		}
				
	}


