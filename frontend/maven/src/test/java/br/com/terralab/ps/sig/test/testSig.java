package br.com.terralab.ps.sig.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	}

}
