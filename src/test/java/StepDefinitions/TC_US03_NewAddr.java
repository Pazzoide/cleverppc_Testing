package StepDefinitions;

import Pages.CommonElements;
import Pages.SpecialElements;
import Utilities.G_W_D;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC_US03_NewAddr {

    CommonElements ce = new CommonElements();
    SpecialElements se = new SpecialElements();

    @Given("The user accesses the website")
    public void theUserAccessesTheWebsite() {
        G_W_D.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("The user enters information in the special field")
    public void theUserEntersInformationInTheSpecialField(DataTable dt) {
        List<List<String>>   items=  dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e=se.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            se.mySendKeys(e, yazi);
        }
    }

    @And("The user clicks on the special link")
    public void theUserClicksOnTheSpecialLink(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);
        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = se.getWebElement(strButtonsList.get(i));
            se.myClick(linkWebElement);
        }
    }

    @And("The user clicks on the common link")
    public void theUserClicksOnTheCommonLink(DataTable links) {
        List<String> strlinkList = links.asList(String.class);
        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = ce.getWebElement(strlinkList.get(i));
            ce.myClick(linkWebElement);
        }
    }

    @And("User select on the element")
    public void userSelectOnTheElement(DataTable slct) {
            Select select = new Select(se.state);
            select.selectByVisibleText("Florida");
    }

    @And("The new address is successfully added to the users account")
    public void theNewAddressIsSuccessfullyAddedToTheUserSAccount() {
        se.verifyContainsText(se.controlText, "Your addresses are listed below");
    }


}
