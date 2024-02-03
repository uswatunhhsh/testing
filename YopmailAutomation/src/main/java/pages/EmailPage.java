package pages;

public class EmailPage extends BasePage{
    public EmailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "bname")
    private WebElement emailTitle;

    public WebElement getEmailTitle(){
        return emailTitle;
    }
}
