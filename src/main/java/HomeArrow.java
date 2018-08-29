import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


public class HomeArrow extends HtmlElement {

    @FindBy(className = "home-tabs")
    public HomeTabs homeTabs;

    public void goToMarket(){
        homeTabs.clickMarketButton();
    }
}
