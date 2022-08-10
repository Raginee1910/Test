//package stepDefinition;
//
//
//
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.pageobjects.PageObjects;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.messages.types.Duration;
//
//public class HomeScreen {
//
//	static WebDriver driver;
//
//	
//	@Given("open chrome browser")
//	public void openBrowser() {
//		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		    driver= new ChromeDriver();
//		    driver.manage().window().maximize();
//		    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
//	}
//   
//	@And("Navigate to home screen")
//	public void navigate_to_home_screen() {
//	   driver.get("https://www.facebook.com/");
//	}
//
//	@Then("verify title {string}")
//	public void verify_title(String title) {
//	  String actualTitle= driver.getTitle();
//	  
//	  if(actualTitle.equalsIgnoreCase(title))
//	  {
//		  System.out.println("title matched");
//	  }
//	  
//	  
//	}
//	@And("close the browser")
//	public void closeBrowser() {
//		System.out.println("close the Browser");
//	}
//	
//	@Given ("validate user on login screen")
//	public void verfiyhomeScreen() {
//		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		    
//		System.out.println("I m in");
//	}
//
//	
//	  @And("enter both {string} and {string} check")
//	  public void enterUserNameAndPassword(String user, String pass) {
//	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys(user);
//		  
//		
//	  driver.findElement(By.id("email")).clear();
//	  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pass);
//		
//	  driver.findElement(By.id("passContainer")).clear();
//	  driver.findElement(By.xpath("//button[@name='login']")).click(); }
//	 
//	
//		  
//		  
//	@And("click on login button")
//	public void clickOnLoginbtn() {
//		System.out.println("I m out");
//	}
//	
//	@Given("print scenario second")
//	public void print_scenario_scenario() {
//		System.out.println("second scenario");
//	}
//	
//	@Then("check console")
//	public void CheckConsole() {
//		System.out.println("checking console");
//	}
//	
//	@And("I fill in your message with")
//	public void i_fill_in(String docString) {
//	    System.out.println(docString);	
//	}
//	
//	@And("looking for DataTables Example")
//	public void printDatatableValues(DataTable value) {
//		List<Map<String, String>> data = value.asMaps(String.class, String.class);
//		 for(Map<String, String> outComes: data) {
//			 System.out.println(outComes.get("A"));
//			 outComes.get("A");
//		 }
//	
//	}
//	
//	
//
//	@Given("run third scenario")
//	public void runThirdScenario() {
//		System.out.println("run third scenario");
//		}
//	
//	@And("check time")
//	public void checkTime() {
//		System.out.println("checking time");
//	}
//	
//	@When("you have clock")
//	public void youHaveClock() {
//		System.out.println("you have clock");
//	}
//	 
//		@And("enter username and password")
//		public void enterusernameAndPass(DataTable data)  {
//	
//			List<Map<String, String>> ldata= data.asMaps(String.class,String.class);
//			
//			for(Map<String, String> mapdata : ldata) {
//				
//			
//				driver.findElement(By.xpath("//*[@id='email']")).sendKeys(mapdata.get("username"));
//			
//				driver.findElement(By.xpath("//*[@id='email']")).clear();
//				
//				driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(mapdata.get("password"));
//			
//				driver.findElement(By.xpath("//*[@id='pass']")).clear();
//				
//			}
//			
//			
//			
//		}
//		
//		
//	
//	
//	}
//
