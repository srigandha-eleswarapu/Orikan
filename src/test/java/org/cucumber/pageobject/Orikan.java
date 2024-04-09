package org.cucumber.pageobject;
import org.cucumber.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class Orikan extends BaseClass {

    public Orikan(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //objects created
    @FindBy(id="emailAddress")
    private WebElement EmailAddress;
    public WebElement getEmailAddress(){
        return EmailAddress;
    }
    @FindBy(xpath="//label[contains(text(),'Email Address')]")
    private WebElement EmailAddressLabel;
    public WebElement getEmailAddressLabel(){
        return EmailAddressLabel;
    }
    @FindBy(xpath="//span[contains(text(),'Email Address is required')]")
    private WebElement EmailAddressErrMsg;
    public WebElement getEmailAddressErrMsg(){
        return EmailAddressErrMsg;
    }
    @FindBy(id="password")
    private WebElement Password;
    public WebElement getPassword(){
        return Password;
    }
    @FindBy(xpath="//label[contains(text(),'Password')]")
    private WebElement PasswordLabel;
    public WebElement getPasswordLabel(){
        return PasswordLabel;
    }
    @FindBy(xpath="//span[contains(text(),'Password is required')]")
    private WebElement PasswordErrMsg;
    public WebElement getPasswordErrMsg(){
        return PasswordErrMsg;
    }
    @FindBy(id="confirmPassword")
    private WebElement ConfirmPassword;
    public WebElement getConfirmPassword(){
        return ConfirmPassword;
    }
    @FindBy(xpath="//label[contains(text(),' Confirm Password')]")
    private WebElement ConfirmPasswordLabel;
    public WebElement getConfirmPasswordLabel(){
        return ConfirmPasswordLabel;
    }
    @FindBy(xpath="//span[contains(text(),'Confirm Password is required')]")
    private WebElement ConfirmPasswordErrMsg;
    public WebElement getConfirmPasswordErrMsg(){
        return ConfirmPasswordErrMsg;
    }
    @FindBy(xpath="//button[contains(text(),'Next')]")
    private WebElement NextButton;
    public WebElement getNextButton(){
        return NextButton;
    }
    @FindBy(xpath="//span[contains(text(),'First Name')]")
    private WebElement FirstNameLabel;
    public WebElement getFirstNameLabel(){
        return FirstNameLabel;
    }
    @FindBy(id="firstName")
    private WebElement FirstName;
    public WebElement getFirstName(){
        return FirstName;
    }
    @FindBy(xpath="//span[contains(text(),'First Name is required')]")
    private WebElement FirstNameErrMsg;
    public WebElement getFirstNameErrMsg(){
        return FirstNameErrMsg;
    }

    @FindBy(xpath="//span[contains(text(),'Last Name')]")
    private WebElement LastNameLabel;
    public WebElement getLastNameLabel(){
        return LastNameLabel;
    }

    @FindBy(id="lastName")
    private WebElement LastName;
    public WebElement getLastName(){
        return FirstName;
    }
    @FindBy(xpath="//span[contains(text(),'Last Name is required')]")
    private WebElement LastNameErrMsg;
    public WebElement getLastNameErrMsg(){
        return LastNameErrMsg;
    }
    @FindBy(xpath="//label[contains(text(),'Preferred Full Name')]")
    private WebElement PreFullNameLabel;
    public WebElement getPreFullNameLabel(){
        return PreFullNameLabel;
    }
    @FindBy(id="preferredFullName")
    private WebElement PreFullName;
    public WebElement getPreFullName(){
        return PreFullName;
    }
    @FindBy(xpath="//label[contains(text(),'Address Line 1')]")
    private WebElement AddLine1Label;
    public WebElement getAddLine1Label(){
        return AddLine1Label;
    }

    @FindBy(id="addressLine1")
    private WebElement AddLine1;
    public WebElement getAddLine1(){
        return AddLine1Label;
    }
    @FindBy(xpath="//span[contains(text(),'Address Line 1 is required')]")
    private WebElement AddLine1ErrMsg;
    public WebElement getAddLine1ErrMsg(){
        return AddLine1ErrMsg;
    }
    @FindBy(xpath="//label[contains(text(),'Address Line 2')]")
    private WebElement AddLine2Label;
    public WebElement getAddLine2Label(){
        return AddLine2Label;
    }
    @FindBy(id="addressLine2")
    private WebElement AddLine2;
    public WebElement getAddLine2(){
        return AddLine2;
    }
    @FindBy(xpath="//label[contains(text(),'Address Line 3')]")
    private WebElement AddLine3Label;
    public WebElement getAddLine3Label(){
        return AddLine2Label;
    }
    @FindBy(id="addressLine3")
    private WebElement AddLine3;
    public WebElement getAddLine3(){
        return AddLine2;
    }
    @FindBy(xpath="//label[contains(text(),'Postcode')]")
    private WebElement PostCodeLabel;
    public WebElement getPostCodeLabel(){
        return PostCodeLabel;
    }
    @FindBy(id="postcode")
    private WebElement PostCode;
    public WebElement getPostCode(){
        return PostCode;
    }
    @FindBy(xpath="//span[contains(text(),'Postcode is required')]")
    private WebElement PostCodeErrMsg;
    public WebElement getPostCodeErrMsg(){
        return PostCodeErrMsg;
    }
    @FindBy(xpath="//label[contains(text(),'City')]")
    private WebElement CityLabel;
    public WebElement getCityLabel(){
        return CityLabel;
    }
    @FindBy(id="city")
    private WebElement City;
    public WebElement getCity(){
        return City;
    }
    @FindBy(xpath="//span[contains(text(),'City is required')]")
    private WebElement CityErrMsg;
    public WebElement getCityErrMsg(){
        return CityErrMsg;
    }
    @FindBy(xpath="//select[@id='state']")
    private List<WebElement> StateDropdown;
    public List<WebElement> getStateDropdown(){
        return StateDropdown;
    }
    @FindBy(id="state")
    private WebElement State;
    public WebElement getState(){
        return State;
    }

    @FindBy(xpath="//label[contains(text(),'State')]")
    private WebElement StateLabel;
    public WebElement getStateLabel(){
        return StateLabel;
    }
    @FindBy(xpath="//button[contains(text(),'Back')]")
    private WebElement BackBtn;
    public WebElement getBackBtn(){
        return BackBtn;
    }
    @FindBy(id="cardHolderName")
    private WebElement CardHolderName;
    public WebElement getCardHolderName(){
        return CardHolderName;
    }
    @FindBy(xpath="//label[contains(text(),'Card Holder Name')]")
    private WebElement CardHolderNameLabel;
    public WebElement getCardHolderNameLabel(){
        return CardHolderNameLabel;
    }
    @FindBy(xpath="//span[contains(text(),'Cardholder Name is required')]")
    private WebElement CardHolderNameErrMsg;
    public WebElement getCardHolderNameErrMsg(){
        return CardHolderNameErrMsg;
    }
    @FindBy(xpath="//label[contains(text(),'Card Type')]")
    private WebElement CardTypeLabel;
    public WebElement getCardTypeLabel(){
        return CardTypeLabel;
    }
    @FindBy(id="cardTypeVISA")
    private WebElement CardTypeVISA;
    public WebElement getCardTypeVISA(){
        return CardTypeVISA;
    }
    @FindBy(id="cardTypeMastercard")
    private WebElement CardTypeMasterCard;
    public WebElement getCardTypeMasterCard(){
        return CardTypeMasterCard;
    }
    @FindBy(xpath="//label[contains(text(),'Card Number')]")
    private WebElement CardNumLabel;
    public WebElement getCardNumLabel(){
        return CardNumLabel;
    }
    @FindBy(id="cardNumber")
    private WebElement CardNumber;
    public WebElement getCardNumber(){
        return CardNumber;
    }
    @FindBy(xpath="//span[contains(text(),'Card Number is required')]")
    private WebElement CardNumberErrMsg;
    public WebElement getCardNumberErrMsg(){
        return CardNumberErrMsg;
    }
    @FindBy(id="cardCVV")
    private WebElement CVV;
    public WebElement getCVV(){
        return CVV;
    }
    @FindBy(xpath="//label[contains(text(),'Card Expiry Month')]")
    private WebElement CardExpMonLabel;
    public WebElement getCardExpMonLabel(){
        return CardExpMonLabel;
    }
    @FindBy(xpath="//select[@id='cardExpiryMonth']")
    private WebElement CardExpMon;
    public WebElement getCardExpMon(){
        return CardExpMon;
    }
    @FindBy(xpath="//span[contains(text(),'Card Expiry Month is required')]")
    private WebElement CardExpMonErrMsg;
    public WebElement getCardExpMonErrMsg(){
        return CardExpMonErrMsg;
    }
    @FindBy(xpath="//label[contains(text(),'Card Expiry Year')]")
    private WebElement CardExpYrLabel;
    public WebElement getCardExpYrLabel(){
        return CardExpYrLabel;
    }
    @FindBy(id="cardExpiryYear")
    private WebElement CardExpYr;
    public WebElement getCardExpYr(){
        return CardExpYr;
    }
    @FindBy(xpath="//span[contains(text(),'Card Expiry Year is required')]")
    private WebElement CardExpYrErrMsg;
    public WebElement getCardExpYrErrMsg(){
        return CardExpYrErrMsg;
    }
    @FindBy(xpath="//label[contains(text(),'Terms and Conditions')]")
    private WebElement TandCLabel;
    public WebElement getTandCLabel(){
        return TandCLabel;
    }
    @FindBy(id="termsAndConditions")
    private WebElement TandCBox;
    public WebElement getTandCBox(){
        return TandCBox;
    }
    @FindBy(id="agreedToTerms")
    private WebElement TandCCheckbox;
    public WebElement getTandCCheckbox(){
        return TandCCheckbox;
    }
    @FindBy(id="agreedToTermsLabel")
    private WebElement TandCCheckboxText;
    public WebElement getTandCCheckboxText(){
        return TandCCheckboxText;
    }
    @FindBy(xpath="//button[contains(text(),'Submit')]")
    private WebElement SubmitBtn;
    public WebElement getSubmitBtn(){
        return SubmitBtn;
    }
    @FindBy(xpath="//span[contains(text(),'You must first read')]")
    private WebElement TandCCheckBoxErr;
    public WebElement getTandCCheckBoxErr(){
        return TandCCheckBoxErr;
    }
    @FindBy(xpath="//p[contains(text(),'Your user account')]")
    private WebElement SuccessMsg;
    public WebElement getSuccessMsg(){
        return SuccessMsg;
    }






}
