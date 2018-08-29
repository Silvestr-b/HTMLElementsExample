import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;


public class SearchPage {
    WebDriver driver;

    @FindBy(className = "home-arrow")
    public HomeArrow homeArrow;

    public SearchPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
        this.driver = driver;
    }

    public SearchPage navigate(){
        driver.get("http://yandex.ru");
        return this;
    }

    public void goToMarket(){
        homeArrow.goToMarket();
    }
}

