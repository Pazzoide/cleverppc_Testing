package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecialElements extends Patent {
    public SpecialElements() {
        PageFactory.initElements(G_W_D.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "passwd")
    public WebElement password;
    @FindBy(id = "SubmitLogin")
    public WebElement submitButton;
    @FindBy(linkText = "Addresses")
    public WebElement addresses;
    @FindBy(linkText = "Add a new address")
    public WebElement addNewAddress;
    @FindBy(id = "firstname")
    public WebElement firstName;
    @FindBy(id = "lastname")
    public WebElement lastName;
    @FindBy(id = "company")
    public WebElement company;
    @FindBy(id = "address1")
    public WebElement address;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "id_state")
    public WebElement state;
    @FindBy(id = "postcode")
    public WebElement zipCode;
    @FindBy(id = "phone")
    public WebElement homePhone;
    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone;
    @FindBy(id = "alias")
    public WebElement adressTitle;
    @FindBy(id = "submitAddress")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class='addresses']//p[1]")
    public WebElement controlText;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "email": return this.email;
            case "password": return this.password;
            case "submitButton": return this.submitButton;
            case "addresses": return this.addresses;
            case "addNewAddress": return this.addNewAddress;
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "company": return this.company;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zipCode": return this.zipCode;
            case "homePhone": return this.homePhone;
            case "mobilePhone": return this.mobilePhone;
            case "adressTitle": return this.adressTitle;
            case "saveButton": return this.saveButton;
            case "controlText": return this.controlText;
        }
        return null;
    }
}
