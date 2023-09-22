package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Patent {
    public WebDriverWait wait = new WebDriverWait(G_W_D.getDriver(), Duration.ofSeconds(20));

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) G_W_D.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(G_W_D.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myJsClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js = (JavascriptExecutor) G_W_D.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void myHover(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        Actions actions = new Actions(G_W_D.getDriver());
        actions.moveToElement(element).build().perform();
    }

    public void mySelect(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select dMenu = new Select(element);
        dMenu.selectByVisibleText(text);
    }

    public static void Wait(int sn) {
        try {
            Thread.sleep(sn * 1000L);
        } catch (InterruptedException Ex) {
            throw new RuntimeException(Ex);
        }
    }

    public static int RandomGenerator(int Limit) {
        return (int) (Math.random() * Limit);
    }

    public static boolean ListContainsString(List<WebElement> List, String Aranan) {
        boolean Bulundu = false;
        for (WebElement X : List) {
            if (X.getText().toLowerCase().equals(Aranan.toLowerCase())) {
                Bulundu = true;
                break;
            }
        }
        return Bulundu;
    }
}
