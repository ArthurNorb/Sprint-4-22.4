package br.com.terralab.ps.sig.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InicialPage {
	
	
	private static final String URL_INICIAL = "https://inteligenciageografica-a377d.web.app/";
	private WebDriver browser;
	
	public InicialPage() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		this.browser = new ChromeDriver();
        browser.navigate().to(URL_INICIAL);
	}
	
	public void fechar() {
		this.browser.quit();
	}

	public void preencheBuscaDeCidade(String cidade) {
        this.browser.findElement(By.id("input-field-search")).sendKeys(cidade);		
	}

	public void clicaBotaoPesquisar() {
		WebElement botaoPesquisar = this.browser.findElement(By.id("button-search-input-field-search"));
        new Actions(this.browser).click(botaoPesquisar).perform();		
	}

	public boolean procuraPonto() {
		return this.browser.getPageSource().contains("pin-input-field-search");
	}

}
