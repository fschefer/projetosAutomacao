package com.google.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver = new ChromeDriver();

	@Given("I open the browser and type Google")
	public void openBrowserAndType() throws InterruptedException {
		String URL = "https://www.google.com";
		driver.get(URL);
	}

	@When("I search for IBM")
	public void searchForIBM() {
		WebElement caixa = driver.findElement(By.xpath(
				"/html/body//form[@role='search']//div[@class='A8SBwf']//div[@class='a4bIc']/input[@role='combobox']"));
		caixa.sendKeys("IBM");

	}

	@Then("it should open IBM's page")
	public void clickButton() throws InterruptedException {
		WebElement sorte = driver.findElement(By.xpath(
				"/html/body//form[@role='search']//div[@class='A8SBwf']/div[@class='FPdoLc lJ9FBc']/center/input[@name='btnI']"));
		sorte.click();
		Thread.sleep(200);
		driver.quit();

	}
}