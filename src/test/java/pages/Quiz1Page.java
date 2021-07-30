package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Quiz1Page {
    private WebDriver driver;


    public Quiz1Page(WebDriver driver){
        this.driver = driver;
    }

    public String getQuestionario1() {
        String xpathQuestionario1 ="//*[@id='container_pdf']//div[2]/span[2]";
        WebElement txtQuestionario1 = driver.findElement(By.xpath(xpathQuestionario1));
        return txtQuestionario1.getText();
    }

    public void independente() {
        String xpathIndependente = "//*[@id='Independente_1']/input";
        WebElement inputIndependente = driver.findElement(By.xpath(xpathIndependente));
        JavascriptExecutor independente = (JavascriptExecutor)driver;
        independente.executeScript("arguments[0].click();", inputIndependente);
    }

    public void autosuficiente() {
        String xpathAutoSuficiente = "//*[@id='Auto-Suficiente_1']/input";
        WebElement inputAutosuficiente = driver.findElement(By.xpath(xpathAutoSuficiente));
        JavascriptExecutor autosuficiente = (JavascriptExecutor)driver;
        autosuficiente.executeScript("arguments[0].click();", inputAutosuficiente);
    }

    public void otimista() {
        String xpathOtimista = "//*[@id='Otimista_1']/input";
        WebElement inputOtimista = driver.findElement(By.xpath(xpathOtimista));
        JavascriptExecutor otimista = (JavascriptExecutor)driver;
        otimista.executeScript("arguments[0].click();", inputOtimista);
    }

    public void dedicado() {
        String xpathDedicado = "//*[@id='Dedicado_1']/input";
        WebElement inputDedicado = driver.findElement(By.xpath(xpathDedicado));
        JavascriptExecutor dedicado = (JavascriptExecutor)driver;
        dedicado.executeScript("arguments[0].click();", inputDedicado);
    }

    public void eficiente() {
        String xpathEficiente = "//*[@id='Eficiente_1']/input";
        WebElement inputEficiente = driver.findElement(By.xpath(xpathEficiente));
        JavascriptExecutor eficiente = (JavascriptExecutor)driver;
        eficiente.executeScript("arguments[0].click();", inputEficiente);
    }

    public void btnProximaEtapa() {
        String xpathProximaEtapa = "//div[3]/button/div";
        WebElement btnProximaEtapa = driver.findElement(By.xpath(xpathProximaEtapa));
        btnProximaEtapa.click();
    }

}
