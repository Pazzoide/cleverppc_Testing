package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CommonElements extends Patent {
    public CommonElements() {
        PageFactory.initElements(G_W_D.getDriver(), this);
    }
    @FindBy(css = "[class='login']")
    public WebElement singIn;
    @FindBy(linkText = "Sitemap")
    public WebElement siteMap;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "singIn": return this.singIn;
            case "siteMap": return this.siteMap;
        }
        return null;
    }

}
