package teste_sso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class siginTest {

	@Test
	public void buttontest() throws InterruptedException {
		// Creating the driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver drive = new ChromeDriver();

		// Open the page:
		String URL = "https://www.fakeloginpage.com/login"; // Fake URL
		drive.get(URL);

		// Clicking the button to choose a login method:
		WebElement botao = drive
				.findElement(By.xpath("//app-root/app-login/div[@class='container']//input[@value='Sign in']"));
		botao.click();

		// Choosing a login method:
		WebElement metodo = drive.findElement(By.xpath("//div[@id='credsDiv']/label[.='Use your id and password']"));
		metodo.click();

		// Inputing my data:
		WebElement login = drive.findElement(By.xpath("/html//input[@id='user-name-input']"));
		login.sendKeys("*****"); // Fake Login data, obviously
		WebElement senha = drive.findElement(By.xpath("/html//input[@id='password-input']"));
		senha.sendKeys("*********");

		WebElement entrar = drive.findElement(By.xpath("/html//button[@id='login-button']"));
		entrar.click();

		// closing the page:
		Thread.sleep(1000);
		drive.quit();
	}

}