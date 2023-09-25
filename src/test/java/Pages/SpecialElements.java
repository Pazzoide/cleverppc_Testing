package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SpecialElements extends Patent {
    public SpecialElements() {
        PageFactory.initElements(G_W_D.getDriver(), this);

    }
    @FindBy(css = "[id='product_list']>li")
    public List<WebElement> productList;

    @FindBy(xpath = "//*[contains(text(),'Add to cart')]")
    public List<WebElement> addToCart;

    @FindBy(xpath = "//span[contains(text(),'Women ')]")
    public WebElement womenText;

    @FindBy(xpath = "//span[contains(text(),'Summer Dresses ')]")
    public WebElement summurDressText;

    @FindBy(xpath = "//span[@class='title'][1]")
    public WebElement layerCartProductText;
}
