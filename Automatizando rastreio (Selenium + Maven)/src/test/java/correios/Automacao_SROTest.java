package correios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Automacao_SROTest {

	@Test
	public void SRO() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String URL = "https://www2.correios.com.br/sistemas/rastreamento/";
		driver.get(URL);

		WebElement caixa = driver.findElement(By.id("objetos"));
		caixa.sendKeys("QB392700248BR" + Keys.RETURN);
		System.out.println("Rastreio completo");
	}
}