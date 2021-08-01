package pages;

import maps.CurriculumMap;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CurriculumPage {
    private WebDriver driver;
    private Actions action;
    private CurriculumMap curriculumMap;

    public CurriculumPage(WebDriver driver){
        this.driver = driver;
        curriculumMap = new CurriculumMap();
        action = new Actions(driver);
        PageFactory.initElements(driver, curriculumMap);
    }

    public String getUrlCurriculum() {
        String urlCurriculum = driver.getCurrentUrl();
        return urlCurriculum;
    }

    public void telefone() {
        driver.findElement(By.xpath("//input[@id='contacts']")).click();
        action.sendKeys("11911112222").perform();
        action.sendKeys(Keys.TAB);
    }

    public void email() {
        curriculumMap.inputEmail.sendKeys("luiz02@gmail.com");
    }

    public void confirmarEmail() {
        curriculumMap.inputConfirmaEmail.sendKeys("luiz02@gmail.com");
    }

    public void nomeCompleto() {
        curriculumMap.inputNomeCompleto.sendKeys("Luiz Teste Dois");
    }

    public void genero() {
        String xpathGenero = "/html/body/div[1]/main/div/div/div[1]/div/div[3]/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]";
        WebElement generoMasc = driver.findElement(By.xpath(xpathGenero));
        JavascriptExecutor genero = (JavascriptExecutor)driver;
        genero.executeScript("arguments[0].click();", generoMasc);
    }

    public void dataNascimento() {
        String xpathData = "(//input[@strictparsing='true'])[1]";
        WebElement dataNasc = driver.findElement(By.xpath(xpathData));
        driver.findElement(By.xpath(xpathData));
        JavascriptExecutor data = (JavascriptExecutor)driver;
        data.executeScript("arguments[0].value='10/10/1992';", dataNasc);
        action.sendKeys(Keys.TAB);
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
