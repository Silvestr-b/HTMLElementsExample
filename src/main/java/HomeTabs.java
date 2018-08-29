import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


public class HomeTabs extends HtmlElement {

    @FindBy(partialLinkText = "Маркет")
    public WebElement marketButton;

    public void clickMarketButton(){
        marketButton.click();
    }
}
