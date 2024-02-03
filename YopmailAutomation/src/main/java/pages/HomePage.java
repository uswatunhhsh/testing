package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver Driver){
        super(driver);
    }
     @FindBy(className = "ycptinput")
    private WebElement searchBarInput;

    @FindBy(xpath = "//button[@class=\"md"]")
            private WebElement enterSearchBar;

public void InputOnSearchBar(String input){
    searchBarInput.sendKeys(input);
    enterSearchBar.click();

    }



}
