package com.uninter.univirtus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UnivirtusLoginTest {
	@Test
	public void loginTest() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String URL = "https://univirtus.uninter.com/ava/web/#/";
		driver.get(URL);
		Thread.sleep(400);
		driver.findElement(By.id("ru")).sendKeys("000000000");
		driver.findElement(By.id("senha")).sendKeys("mockedPassword");
		driver.findElement(By.id("loginBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='loginBoxAva']/i[@class='loginbox-ava']")))
				.click();
		Thread.sleep(800);
		driver.quit();
	}
}
