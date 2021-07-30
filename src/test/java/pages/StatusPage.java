package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StatusPage {
    private WebDriver driver;

    public StatusPage(WebDriver driver){
        this.driver = driver;
    }

    public String getStatus() {
        String xpathStatus = "//*[@id='container_pdf']//span[3]";
        WebElement txtStatus = driver.findElement(By.xpath(xpathStatus));
        String status = txtStatus.getText();
        return status;
    }
}
