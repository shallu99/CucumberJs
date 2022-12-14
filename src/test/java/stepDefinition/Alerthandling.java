package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alerthandling {
	WebDriver driver;
	 WebElement input = null;
	 String str = null;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.EdgeDriver.driver","C:\\webdriver\\edge driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	}

	@When("user navigates to the herokkuapp")
	public void user_navigates_to_the_herokkuapp() {
		driver.get("https://the-internet.herokuapp.com/");
	    driver.manage().window().maximize();
	}

	@When("user will  click on the javascript alert")
	public void user_will_click_on_the_javascript_alert() {
		WebElement input = driver.findElement(By.xpath( "//a[contains(text(),'JavaScript Alerts')]"));
	    input.click();
	}

	@Then("click in the java script alert button")
	public void click_in_the_java_script_alert_button() {
		WebElement input1 = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
	    input1.click();
	}

	@Then("click on the java script alert popup ok button")
	public void click_on_the_java_script_alert_popup_ok_button() {
		driver.switchTo().alert().accept();
		System.out.println("you clicked js alert confirm");
	}

	@Then("close the currently opened browser")
	public void close_the_currently_opened_browser() {
		driver.quit();
	}

	@Then("click in the java script confirm button")
	public void click_in_the_java_script_confirm_button() {
		 WebElement input1 = driver.findElement(By.xpath("//*[@onclick = 'jsConfirm()']"));
		    input1.click();
	}

	@Then("click on the java script confirm popup ok button")
	public void click_on_the_java_script_confirm_popup_ok_button() {
		driver.switchTo().alert().accept();
	    System.out.println("you clicked js confirm");
	}

	@Then("click in the java script prompt button")
	public void click_in_the_java_script_prompt_button() {
		WebElement input1 = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
	    input1.click();
	}

	@Then("send some user input text to the popup java script prompt")
	public void send_some_user_input_text_to_the_popup_java_script_prompt() {
		Alert Alert = driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
	    String str = "i am shreyank prompt";
	    Alert.sendKeys(str);
	}

	@Then("Click on the  Js prompt alert ok")
	public void click_on_the_js_prompt_alert_ok() {
		driver.switchTo().alert().accept();

	    
	    
    }
	    @Then("verify the user input is entered is displayed in the console is correct or not")
	    public void verify_the_user_input_is_entered_is_displayed_in_the_console_is_correct_or_not() {
	    	input =driver.findElement(By.id( "result"));
		    String results = input.getText();
		    System.out.println(results);
		    String replaceString = results.replace("You entered:", "");
		    String res = replaceString.trim();

		    if (str.equalsIgnoreCase(res)) {
		       System.out.println(res);
		    }
		    else {
		    	System.out.println("input and output prompt does not match");
		    
	    }
	    }

	


}
