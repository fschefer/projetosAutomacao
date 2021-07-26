package correiosCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RastreioSRO {
	WebDriver driver = new ChromeDriver();

	@Given("that I open the webpage")
	public void openingWebpage() throws InterruptedException {
		String URL = "https://www2.correios.com.br/sistemas/rastreamento/";
		driver.get(URL);
	}

	@When("I put in the code and click the button")
	public void inputtingData() throws InterruptedException {
		WebElement caixa = driver.findElement(By.id("objetos"));
		caixa.sendKeys("QB392700248BR" + Keys.RETURN);
		}
		
	@Then("the tracking should work")
	public void trackingWorking() throws InterruptedException {
		System.out.println("The tracking was successful");
		Thread.sleep(500);
		driver.quit();
	}
}
