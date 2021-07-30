package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quiz2Map {
    @FindBy(xpath = "//*[@id='container_pdf']//span[3]")
    public WebElement txtQuestionario2;

    @FindBy(xpath = "//div[3]/button/div")
    public WebElement btnSalvarCandidatar;

}
