package br.com.terralab.ps.sig.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testSig {
	
	private static final String URL_INICIAL = "https://inteligenciageografica-a377d.web.app/";
	private WebDriver browser;
	
	@BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	}
	
	@BeforeEach
	public void beforeEach() {
		this.browser = new ChromeDriver();
        browser.navigate().to(URL_INICIAL);
	}
	
	/*@AfterEach
	public void afterAll() {
		this.browser.quit();
	}*/
	
	@Test
	public void deveria_AcharPontoNoMapa_SemBuscaAutomatica() {
        this.browser.findElement(By.id("input-field-search")).sendKeys("ipatinga");
        WebElement botaoPesquisar = this.browser.findElement(By.id("button-search-input-field-search"));
        new Actions(this.browser).click(botaoPesquisar).perform();
	}

}
