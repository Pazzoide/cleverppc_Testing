package StepDefinitions;

import Utilities.G_W_D;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void Before() {

    }

    @After
    public void After(Scenario senaryo) {
        if (senaryo.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) G_W_D.getDriver());
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        G_W_D.quitDriver();
    }
}
