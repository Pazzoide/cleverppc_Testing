package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.support.PageFactory;

public class CommonElements extends Patent {
    public CommonElements() {
        PageFactory.initElements(G_W_D.getDriver(), this);

    }
}
