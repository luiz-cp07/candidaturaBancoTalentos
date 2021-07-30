package pages;

import maps.Quiz1Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Quiz1Page {
    private WebDriver driver;
    private Quiz1Map quiz1Map;


    public Quiz1Page(WebDriver driver){
        this.driver = driver;
        quiz1Map = new Quiz1Map();
        PageFactory.initElements(driver, quiz1Map);
    }

    public String getQuestionario1() {
        return quiz1Map.txtQuestionario1.getText();
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
        quiz1Map.btnProximaEtapa.click();
    }

}
