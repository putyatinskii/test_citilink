package example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "/html/body/div[3]/div[2]/header/div[2]/div[2]/div[2]/div/div[6]/div/div/div[1]/a/div")
    private WebElement loginBtn;
    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "//*[@id=\"authorization_popup\"]/div[1]/form/div[1]/div/label/input")
    private WebElement loginField;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "//*[@id=\"authorization_popup\"]/div[1]/form/div[2]/div/label/input")
    private WebElement passwdField;
    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) {
        loginField.sendKeys(login); }
    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        loginBtn.click();
    }
}
