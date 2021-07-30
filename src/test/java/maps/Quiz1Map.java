package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quiz1Map {
    @FindBy(xpath = "//*[@id='container_pdf']//div[2]/span[2]")
    public WebElement txtQuestionario1;

    @FindBy(xpath = "//div[3]/button/div")
    public WebElement btnProximaEtapa;
}
