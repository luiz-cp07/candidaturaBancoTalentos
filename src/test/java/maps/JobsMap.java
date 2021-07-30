package maps;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class JobsMap {
    @FindBy (xpath = "//*[@id='vacancyDescription']//input")
    public WebElement vaga;

    @FindBy(xpath = "//*[@id='vacancyDescription']/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div")
    public WebElement selectCidade;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/a/div[1]")
    public WebElement verVaga;

    @FindBy(xpath = "//*[@id='vacancyDescription']//div[4]//button/div")
    public WebElement btnCandidatar;

}
