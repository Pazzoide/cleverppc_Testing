package StepDefinitions;

import Pages.CommonElements;
import Pages.SpecialElements;
import Utilities.G_W_D;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TC_US04_AddToCart {
    CommonElements ce=new CommonElements();
    SpecialElements se =new SpecialElements();
    @Given("Navigate to cleverppccom")
    public void navigateToCleverppccom() {
        G_W_D.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("the user clicks on the Women category")
    public void theUserClicksOnTheWomenCategory() {
    ce.myClick(ce.womenClick);
      }


    @And("the user clicks on the Summer dress product")
    public void theUserClicksOnTheSummerDressProduct() {
        ce.myClick(ce.dressClick);
        ce.myClick(ce.summerDressClick);
          }

    @And("the user hovers over a random product and clicks the Add to cart button")
    public void theUserHoversOverARandomProductAndClicksTheAddToCartButton() {
          Actions action = new Actions (G_W_D.getDriver());
        int random = (int) (Math.random()*se.productList.size());
        WebElement element = se.productList.get (random);
        WebElement element1=se.addToCart.get(random);
        action.moveToElement (element).build ().perform ();
        element1.click();
        }

    @Then("the user successfully accesses the website")
    public void theUserSuccessfullyAccessesTheWebsite() {

        se.verifyContainsText(se.layerCartProductText, "successfully");

    }


}
