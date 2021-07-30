package pages;

import maps.CurriculumMap;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CurriculumPage {
    private WebDriver driver;
    private CurriculumMap curriculumMap;

    public CurriculumPage(WebDriver driver){
        this.driver = driver;
        curriculumMap = new CurriculumMap();
        PageFactory.initElements(driver, curriculumMap);
    }

    public String getUrlCurriculum() {
        String urlCurriculum = driver.getCurrentUrl();
        return urlCurriculum;
    }

    public void telefone() {
        String xpathTelefone = "//div[2]/div[2]/div[1]/div/div/div/input";
        WebElement inputTelefone = driver.findElement(By.xpath(xpathTelefone));
        inputTelefone.click();
        inputTelefone.sendKeys("11985693625");
    }

    public void email() {
        curriculumMap.inputEmail.sendKeys("luiz@teste.com");
    }

    public void confirmarEmail() {
        curriculumMap.inputConfirmaEmail.sendKeys("luiz@teste.com");
    }

    public void nomeCompleto() {
        curriculumMap.inputNomeCompleto.sendKeys("Luiz Teste");
    }

    public void genero() {
        String xpathGenero = "/html/body/div[1]/main/div/div/div[1]/div/div[3]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]";
        WebElement generoMasc = driver.findElement(By.xpath(xpathGenero));
        JavascriptExecutor genero = (JavascriptExecutor)driver;
        genero.executeScript("arguments[0].click();", generoMasc);
    }

    public void dataNascimento() {
        String xpathDataNasc = "/html/body/div[1]/main/div/div/div[1]/div/div[3]/div[3]/div[2]/div/div/div[1]/div/div/input";
        WebElement dataNasc = driver.findElement(By.xpath(xpathDataNasc));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('strictparsing', 'false');", dataNasc);
        //js.executeScript("arguments[0].setAttribute('value', '01/01/1990');", dataNasc);
        dataNasc.sendKeys("01/01/1991" + Keys.TAB);
    }

    public void video() {
        curriculumMap.inputLinkVideo.sendKeys("https://www.youtube.com/watch?v=cwV12y7n3Jw");
    }

    public void btnSalvarDados() {
        String xpathSalvarDados = "//div[2]/div[2]/button/div";
        WebDriverWait waitSalvarDados = new WebDriverWait(driver, 20);
        WebElement btnSalvarDados = waitSalvarDados.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathSalvarDados)));
        btnSalvarDados.click();
    }

}
