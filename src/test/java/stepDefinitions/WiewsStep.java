package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

import static org.junit.Assert.assertTrue;
import static utils.ReusableMethods.isElementPresent;

public class WiewsStep {

Screens screens=new Screens();
    TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
    @And("kullanici Views butonuna tikladi")
    public void kullaniciViewsButonunaTikladi() throws InterruptedException {

        screens.AppDemosScreen().views.click();

    }

    @Then("kullanici Views ekraninda")
    public void kullaniciViewsEkraninda() {
     assertTrue(isElementPresent(screens.dragAndDropScreen().WiewTitle));
    }

    @And("kullanici Drag and Drop butonuna tikladi")
    public void kullaniciDragAndDropButonunaTikladi() {
        screens.dragAndDropScreen().dragDropButton.click();
    }

    @When("kullanici birinci topu ikici topun ustune brakti")
    public void kullaniciBirinciTopuIkiciTopunUstuneBrakti() {
        touchAction.longPress(ElementOption.element(screens.dragAndDropScreen().firstDot))
                .moveTo(ElementOption.element(screens.dragAndDropScreen().secondDot)).release().perform();
    }

    @Then("kullanici dorduncu top gorecek")
    public void kullaniciDorduncuTopGorecek() {
        Assert.assertTrue(isElementPresent(screens.dragAndDropScreen().hiddenDot));
    }
}