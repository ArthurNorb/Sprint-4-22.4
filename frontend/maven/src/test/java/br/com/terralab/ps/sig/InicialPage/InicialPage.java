package br.com.terralab.ps.sig.InicialPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicialPage {
	public void abreAplicacao() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://inteligenciageografica-a377d.web.app/");
	}
}
