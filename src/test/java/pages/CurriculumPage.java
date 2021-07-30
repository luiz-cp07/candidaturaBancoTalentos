package pages;

import org.openqa.selenium.*;

public class CurriculumPage {
    private WebDriver driver;

    public CurriculumPage(WebDriver driver){
        this.driver = driver;
    }

    public String getUrlCurriculum() {
        String urlCurriculum = driver.getCurrentUrl();
        return urlCurriculum;
    }

    public void telefone() {
        String xpathTelefone = "//div[2]/div[2]/div[1]/div/div/div/input";
        WebElement inputTelefone = driver.findElement(By.xpath(xpathTelefone));
        inputTelefone.clear();
        inputTelefone.click();
        inputTelefone.sendKeys("11985693625");
    }

    public void email() {
        String xpathEmail = "//div[2]/div[3]//input";
        WebElement inputEmail = driver.findElement(By.xpath(xpathEmail));
        inputEmail.clear();
        inputEmail.sendKeys("luiz@teste.com");
    }

    public void confirmarEmail() {
        String xpathConfirmarEmail = "//div[2]/div[4]//input";
        WebElement inputConfirmaEmail = driver.findElement(By.xpath(xpathConfirmarEmail));
        inputConfirmaEmail.clear();
        inputConfirmaEmail.sendKeys("luiz@teste.com");
    }

    public void nomeCompleto() {
        String xpathNomeCompleto = "//main/div/div/div[1]/div/div[3]/div[2]/div[1]/div[1]//input";
        WebElement inputNomeCompleto = driver.findElement(By.xpath(xpathNomeCompleto));
        inputNomeCompleto.clear();
        inputNomeCompleto.sendKeys("Luiz Teste");
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
        System.out.println("Teste");
        int a = 0;

    }

    public void video() {
        String xpathLinkVideo = "//*[@id='tip03']/div[5]/div[1]/div/div/div/input";
        WebElement inputLinkVideo = driver.findElement(By.xpath(xpathLinkVideo));
        inputLinkVideo.sendKeys("https://www.youtube.com/watch?v=cwV12y7n3Jw");
    }

    public void btnSalvarDados() {
        String xpathSalvarDados = "//div[2]/div[2]/button/div";
        WebElement btnSalvarDados = driver.findElement(By.xpath(xpathSalvarDados));
        btnSalvarDados.click();
    }

}
