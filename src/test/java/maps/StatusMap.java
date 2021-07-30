package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatusMap {
    @FindBy(xpath = "//*[@id='container_pdf']//span[3]")
    public WebElement txtStatus;
}
