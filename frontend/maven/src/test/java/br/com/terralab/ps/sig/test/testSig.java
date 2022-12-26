package br.com.terralab.ps.sig.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSig {
	
	@Test
	public void pesquisa() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://inteligenciageografica-a377d.web.app/");
        //browser.quit();
	}

}
