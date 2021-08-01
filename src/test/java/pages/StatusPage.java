package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StatusPage {
    private WebDriver driver;


    public StatusPage(WebDriver driver){
        this.driver = driver;
    }

    public String getStatus() {
        String xpathStatus = "/html/body/div[1]/main/div/div/div/div/div[2]/div[1]/p[1]";
        WebDriverWait waitStatus = new WebDriverWait(driver, 20);
        WebElement txtStatus = waitStatus.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathStatus)));
        String status = txtStatus.getText();
        return status;
    }
}
