package pages;

import maps.JobsMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobsPage {
    private WebDriver driver;
    private JobsMap jobsMap;

    public JobsPage (WebDriver driver) {
        this.driver = driver;
        jobsMap = new JobsMap();
        PageFactory.initElements(driver, jobsMap);
    }

    public void aceitarCookies() {
        String xpathCookies = "/html/body/div[1]/div/div[2]/button/div";
        WebDriverWait waitCookies = new WebDriverWait(driver, 10);
        WebElement cookies = waitCookies.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCookies)));
        cookies.click();
    }

    public String getUrlJobs() {
        return driver.getCurrentUrl();
    }

    public void vaga() {
        jobsMap.vaga.sendKeys("Analista QA");
    }

    public void cidade() {
        String xpathCidade = "//*[@id='vacancyDescription']/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]";
        WebDriverWait waitCidade = new WebDriverWait(driver, 10);
        WebElement cidade = waitCidade.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCidade)));
        cidade.click();
    }

    public void selectCidade() {
        jobsMap.selectCidade.click();
    }

    public void verVaga() {
        jobsMap.verVaga.click();
    }

    public void candidatar() {
        jobsMap.btnCandidatar.click();
    }

}
