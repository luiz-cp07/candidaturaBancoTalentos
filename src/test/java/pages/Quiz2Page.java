package pages;

import maps.Quiz2Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Quiz2Page {
    private WebDriver driver;
    private Quiz2Map quiz2Map;

    public Quiz2Page(WebDriver driver){
        this.driver = driver;
        quiz2Map = new Quiz2Map();
        PageFactory.initElements(driver, quiz2Map);
    }

    public String getQuestionario2() {
        return quiz2Map.txtQuestionario2.getText();
    }

    public void compreensivo() {
        String xpathCompreensivo = "//*[@id='Compreensivo_2']/input";
        WebElement inputCompreensivo = driver.findElement(By.xpath(xpathCompreensivo));
        JavascriptExecutor compreensivo = (JavascriptExecutor)driver;
        compreensivo.executeScript("arguments[0].click();", inputCompreensivo);
    }

    public void lider() {
        String xpathLider = "//*[@id='Líder_2']/input";
        WebElement inputLider = driver.findElement(By.xpath(xpathLider));
        JavascriptExecutor lider = (JavascriptExecutor)driver;
        lider.executeScript("arguments[0].click();", inputLider);
    }

    public void exigente() {
        String xpathExigente = "//*[@id='Exigente_2']/input";
        WebElement inputExigente = driver.findElement(By.xpath(xpathExigente));
        JavascriptExecutor exigente = (JavascriptExecutor)driver;
        exigente.executeScript("arguments[0].click();", inputExigente);
    }

    public void sincero() {
        String xpathSincero = "//*[@id='Sincero_2']/input";
        WebElement inputSincero = driver.findElement(By.xpath(xpathSincero));
        JavascriptExecutor sincero = (JavascriptExecutor)driver;
        sincero.executeScript("arguments[0].click();", inputSincero);
    }

    public void idealista() {
        String xpathIdealista = "//*[@id='Idealista_2']/input";
        WebElement inputIdealista = driver.findElement(By.xpath(xpathIdealista));
        JavascriptExecutor idealista = (JavascriptExecutor)driver;
        idealista.executeScript("arguments[0].click();", inputIdealista);
    }

    public void btnSalvarCandidatar() {
        quiz2Map.btnSalvarCandidatar.click();
    }

}
