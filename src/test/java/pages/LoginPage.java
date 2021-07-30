package pages;

import maps.LoginMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    private LoginMap loginMap;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginMap = new LoginMap();
        PageFactory.initElements(driver, loginMap);
    }
    public String getLogin() {
        return loginMap.txtLogin.getText();
    }

    public void usuario() {
        loginMap.inputUsuario.sendKeys("luiz@teste.com");
    }

    public void senha() {
        loginMap.inputSenha.sendKeys("luiz@123");
    }

    public void btnEntrar() {
        loginMap.btnEntrar.click();
    }
}