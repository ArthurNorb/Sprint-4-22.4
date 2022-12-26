const { By, Key, Builder, getPageSource, contains } = require('selenium-webdriver');
require("chromedriver");
const assert = require("assert");

async function cenario1(cidade) {
    let browser = await new Builder().forBrowser('chrome').build();

    await browser.get('https://inteligenciageografica-a377d.web.app/');
    await browser.findElement(By.id("input-field-search")).sendKeys(cidade);

    setTimeout(async function () {
        let botao = await browser.findElement(By.id("button-search-input-field-search"));
        const actions = browser.actions({ async: true });
        await actions.move({ origin: botao }).click().perform();

        setTimeout(async function () {
            if (await browser.findElement(By.id("marker-layer-0")).isDisplayed()) {
                console.log("achei");
            }
        }, 1500);
    }, 1500);

    console.log("fim");
    //await browser.quit();
};

cenario1("ipatinga");

/*var cidades = ["ouro preto", "ipatinga", "brasilia", "belo horizonte", "itapira"];

for (let i = 0; i < 5; i++) {
    cenario1(cidades[i])
}*/