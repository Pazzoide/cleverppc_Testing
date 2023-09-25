package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElements extends Patent {
    public CommonElements() {
        PageFactory.initElements(G_W_D.getDriver(), this);

    }
    @FindBy(css = "a[title='Women']")
    public WebElement womenClick;
    @FindBy(css = "li[class='last'] span")
    public WebElement dressClick;

    @FindBy(css = "ul[style='display: block;']> :nth-child(3)")
    public WebElement summerDressClick;

    @FindBy(xpath = "//div[@id='header_logo']")
    public WebElement logo;



}
