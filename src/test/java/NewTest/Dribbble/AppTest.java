package NewTest.Dribbble;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AppTest extends App{ 

	
	WebDriver driver = new ChromeDriver();
	
	
	
	
	@BeforeTest
	public void mySetup() {
		
		driver.get("https://dribbble.com");

		driver.manage().window().maximize();
		
		 driver.navigate().refresh();
		
		}
	
	
	
	@Test (priority = 1 , enabled = false)
	public void Sign_Up() throws InterruptedException {
		
		driver.get("https://dribbble.com/signup/new");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn2.btn2--large.btn2--tertiary.btn2--full-width.margin-b-40")).click();
		
		int randomIndex = rand.nextInt(5);
		WebElement FirstName = driver.findElement(By.id("user_name"));
	    String RandomFirstName =firstname[randomIndex];
	FirstName.sendKeys(RandomFirstName);
	 
	//int randomIndex2 = rand.nextInt(5);
	
	WebElement LastName = driver.findElement(By.id("user_login"));
		//String randomLastName = lastname[randomIndex2];
	LastName.sendKeys(randomlastname);
	
	username = RandomFirstName + randomlastname ;
	
	int randomnumber =rand.nextInt(2345);
	
	WebElement Email = driver.findElement(By.id("user_email"));
	
	String randomemail = RandomFirstName + randomlastname  + randomnumber + "@gmail.com";
	Email.sendKeys(randomemail);
	
	WebElement password = driver.findElement(By.id("user_password"));
			password.sendKeys("P@ssw0rd");
			
			driver.findElement(By.id("user_agree_to_terms")).click();

	  
	WebElement create_btn =driver.findElement(By.xpath("//input[@value=\"Create Account\"]"));
		create_btn.click();
		 driver.get("https://dribbble.com");
		
		
	}
	
	
	
		
		
	

	
		
		
		
		
	
	  
	
	
	@Test (priority = 2, enabled = false)
	public void Login () throws InterruptedException {
		
		
		driver.findElement(By.cssSelector(".site-nav__login.btn2.btn2--medium")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("login")).sendKeys("ramafared88@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("123456");
		//WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
		 //continueButton.click();
		
		
		//driver.navigate().back();
		
		
	}
	
	
	
	
	
	
	
	
	@Test (priority = 3, enabled = false)
	public void Popular_Designs () throws InterruptedException {
		

		//Thread.sleep(40000);  
		WebElement Explore_Btn = driver.findElement(By.linkText("Explore"));
		Explore_Btn.click();
		
		Thread.sleep(3000); 
		WebElement Popular_items = driver.findElement(By.id("main"));


		List<WebElement> items = Popular_items.findElements(By.tagName("li"));

		int Random_index = rand.nextInt(items.size());
		
		
		
		WebElement Random_item = items.get(Random_index);
		Random_item.click();
		
		
		
		Thread.sleep(10000);
		
		WebElement likeInOverlay = driver.findElement(By.xpath("//div[contains(@class, 'shot-overlay')]//a[@title='Like this shot']"));

		likeInOverlay.click();
		

				
		String Actual_Result = driver.getCurrentUrl();
		AssertJUnit.assertTrue(Actual_Result.contains("shots"));
		

		
		
		
	}
	
	
	@Test (priority = 4 , enabled = false)
	public void Actions () throws InterruptedException {
		
		
		Thread.sleep(40000);

WebElement Hire_Designer_Btn = driver.findElement(By.linkText("Hire a Designer"));

		
		Actions actions = new Actions(driver);


		actions.moveToElement(Hire_Designer_Btn).perform();

	
		Thread.sleep(2000);
		
		WebElement Browse_Freelancers_Btn = driver.findElement(By.linkText("Browse Freelancers"));
		Browse_Freelancers_Btn.click();
		
		List<WebElement> avatars = driver.findElements(By.className("user-card-profile__avatar"));
		String originalWindow = driver.getWindowHandle();

		int index = rand.nextInt(avatars.size());
		avatars.get(index).click();
		
	

		// الانتقال للتبويب الجديد
		for (String windowHandle : driver.getWindowHandles()) {
		    if (!windowHandle.equals(originalWindow)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 300)");
		Thread.sleep(2000);

		WebElement followBtn = driver.findElement(By.cssSelector("a.btn2.btn2--tertiary.tipsy-mobile-disabled.follow"));
		followBtn.click();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	@Test (priority = 5 , enabled = false)
	public void Find_job () throws InterruptedException {
		
		
		
		Thread.sleep(1000);  
		WebElement Find_Jobs_Btn = driver.findElement(By.linkText("Find Jobs"));
		Find_Jobs_Btn.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("window.scrollTo(0,700)");
		Thread.sleep(5000);
		
		WebElement CheckBoxDiv = driver.findElement(By.cssSelector(".checkbox-radio-group"));

		List<WebElement> CheckBoxes = CheckBoxDiv.findElements(By.tagName("input"));

		if (!CheckBoxes.isEmpty()) {
		   
		    int index = rand.nextInt(CheckBoxes.size());
		    CheckBoxes.get(index).click();
		}
		
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("Amman");
		driver.findElement(By.id("anywhere")).click();
		driver.findElement(By.id("fulltime")).click();
		
		driver.findElement(By.className("js-job-submit")).click();
		js.executeScript("window.scrollTo(0,900)");
	
		
		String Actual_Result = driver.getCurrentUrl();
		AssertJUnit.assertTrue(Actual_Result.contains("jobs"));
		
		
		
	}


		@Test(priority = 6 , enabled = true)
		public void Contact_Us () throws InterruptedException {
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver ;
		
			js.executeScript("window.scrollTo(0,5200)");
			Thread.sleep(3000);
			
			WebElement Contact_btn = driver.findElement(By.linkText("Support"));
			Contact_btn.click();
			
			js.executeScript("window.scrollTo(0,700)");
			
			Thread.sleep(5000);
			
			WebElement Most_Viewed = driver.findElement(By.cssSelector("section.rounded-card"));
			
			List<WebElement> list = Most_Viewed.findElements(By.tagName("div"));
			
			int index = rand.nextInt(list.size());
			
			WebElement Random_item = list.get(index);
			Random_item.click();
			
			
			
			String Actual_Result = driver.getCurrentUrl();
			AssertJUnit.assertTrue(Actual_Result.contains("help"));
			
		
		
		}
		
		@Test(priority = 7 , enabled = false)
		public void  ResponsiveTest () {
			   
			
			Dimension[] sizes = {
				    new Dimension(360, 640),
				   // new Dimension(390, 844),
				    new Dimension(768, 1024),
				   // new Dimension(1366, 768)
				};

				for (Dimension size : sizes) {
				    driver.manage().window().setSize(size);

			driver.get("https://dribbble.com");

				}
		
	
		
		}
		
		
		@Test(priority = 8 , enabled = false)
		public void Logout () throws InterruptedException {
			
			

			Thread.sleep(5000);
			
			WebElement profileImg = driver.findElement(By.className("photo"));

			
			Actions actions = new Actions(driver);


			actions.moveToElement(profileImg).perform();

		
			Thread.sleep(2000);

			WebElement SignOutBtn = driver.findElement(By.xpath("//button[text()='Sign Out']"));
			SignOutBtn.click();

			WebElement LoginBtn = driver.findElement(By.linkText("Log in"));
			Assert.assertTrue(LoginBtn.isDisplayed());
			
			
			

			
			
		}
		
		
		
		
		
		
		
		
		
	}




	
	

 
