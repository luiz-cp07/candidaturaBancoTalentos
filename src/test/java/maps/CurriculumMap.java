package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurriculumMap {

    @FindBy(xpath = "//div[2]/div[3]//input")
    public WebElement inputEmail;

    @FindBy(xpath = "//div[2]/div[4]//input")
    public WebElement inputConfirmaEmail;

    @FindBy(xpath = "//main/div/div/div[1]/div/div[3]/div[2]/div[1]/div[1]//input")
    public WebElement inputNomeCompleto;

    @FindBy(xpath = "//*[@id='tip03']/div[5]/div[1]/div/div/div/input")
    public WebElement inputLinkVideo;
}
