package StepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {
	WebDriver d1;

	@Given("Open chrome browser and url of the appln")
	public void Open_chrome_browser_and_url_of_the_appln() {
		System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");

		d1=new ChromeDriver();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486386870127%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D2828125303178797191%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061898%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26gclid%3DCjwKCAjw2bmLBhBREiwAZ6ugo-w4u0NAldWTBX3bmj1zaJ71CdrboY9zY3g-PMW8sW2iBcNQcyIK_xoC1IsQAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		System.out.println("Given success");
	}

	@When("Enter username and password")
	public void Enter_username_and_password() {
		d1.findElement(By.id("ap_email")).sendKeys("Prajkta");

		d1.findElement(By.id("continue")).click();	
		System.out.println("Entered successfully");
	}
	
	@Then("login success")
	public void login_success() {
		System.out.println("login success");
	}

}



