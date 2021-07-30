package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(xpath = "//*[@id='root']//article[2]//div[1]/div/div/label")
    public WebElement txtLogin;

    @FindBy(xpath = "//*[@id='root']//div//div[1]/div/div/input")
    public WebElement inputUsuario;

    @FindBy(xpath = "//*[@id='root']//div[2]//input")
    public WebElement inputSenha;

    @FindBy(xpath = "//*[@id='root']//form/button")
    public WebElement btnEntrar;
}
