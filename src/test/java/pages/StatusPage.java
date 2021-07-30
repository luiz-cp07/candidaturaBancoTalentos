package pages;

import maps.StatusMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StatusPage {
    private WebDriver driver;
    private StatusMap statusMap;

    public StatusPage(WebDriver driver){
        this.driver = driver;
        statusMap = new StatusMap();
        PageFactory.initElements(driver, statusMap);
    }

    public String getStatus() {
        String status = statusMap.txtStatus.getText();
        return status;
    }
}
