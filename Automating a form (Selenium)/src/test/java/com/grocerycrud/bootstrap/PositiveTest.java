package com.grocerycrud.bootstrap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PositiveTest {

	@Test
	public void loginTest() throws InterruptedException {
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize:
		driver.manage().window().maximize();

		// Sleep
		sleep();
		// Open Webpage
		String url = "https://www.grocerycrud.com/demo/bootstrap_theme";
		driver.get(url);

		// Change version:
		Select version = new Select(driver.findElement(By.id("switch-version-select")));
		version.selectByVisibleText("Bootstrap V4 Theme");

		// Click the button to add a new costumer:
		String add = "https://www.grocerycrud.com/demo/bootstrap_theme/add";
		driver.get(add);

		// Fill in forms correctly
		// Data to be typed
		String Nome = "aaaa bbbb";
		String Sobrenome = "cccc";
		String FN = "Flávio Schefer";
		String Tel = "xx xxxxxx";
		String Addr1 = "Av Selenium, 000";
		String Addr2 = "Torre D";
		String cidade = "Porto Alegre";
		String state = "RS";
		String CEP = "00000-000";
		String pais = "Brazil";
		String limit = "200";

		// Finding page elements
		WebElement credit = driver.findElement(By.id("field-creditLimit"));
		WebElement nome = driver.findElement(By.id("field-customerName"));
		WebElement last = driver.findElement(By.id("field-contactLastName"));
		WebElement contato = driver.findElement(By.id("field-contactFirstName"));
		WebElement tel = driver.findElement(By.id("field-phone"));
		WebElement l1 = driver.findElement(By.id("field-addressLine1"));
		WebElement l2 = driver.findElement(By.id("field-addressLine2"));
		WebElement city = driver.findElement(By.id("field-city"));
		WebElement estado = driver.findElement(By.id("field-state"));
		WebElement PC = driver.findElement(By.id("field-postalCode"));
		WebElement country = driver.findElement(By.id("field-country"));

		// Typing the employee
		driver.findElement(By.id("field_salesRepEmployeeNumber_chosen")).click();
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input"));
		emp.sendKeys("Fixter" + Keys.RETURN);
		Thread.sleep(1000);

		// Saving
		WebElement save = driver.findElement(By.id("form-button-save"));

		Thread.sleep(2000);

		// Typing the required data on the fields:
		nome.sendKeys(Nome);
		last.sendKeys(Sobrenome);
		contato.sendKeys(FN);
		tel.sendKeys(Tel);
		l1.sendKeys(Addr1);
		l2.sendKeys(Addr2);
		city.sendKeys(cidade);
		estado.sendKeys(state);
		PC.sendKeys(CEP);
		country.sendKeys(pais);
		credit.sendKeys(limit);
		save.click();
		Thread.sleep(3000);

		// Message verification:
		WebElement fim = driver.findElement(By.id("report-success"));
		String sucesso = fim.getText();
		Assert.assertTrue(sucesso.contains("Your data has been successfully stored into the database"));
		driver.quit();
	}

	private void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
