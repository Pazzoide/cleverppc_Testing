package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.support.PageFactory;

public class SpecialElements extends Patent {
    public SpecialElements() {
        PageFactory.initElements(G_W_D.getDriver(), this);

    }
}
