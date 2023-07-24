package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertTrue;
import static utils.ReusableMethods.isElementPresent;
import static utils.ReusableMethods.tapOn;


public class AppDemosStep {
    Screens screens=new Screens();

    @Given("app yuklenir")
    public void app_yuklenir() {
        Driver.getAppiumDriver();
    }
    @Given("kullanici ana ekranda")
    public void kullanici_ana_ekranda() {
      assertTrue(isElementPresent(screens.AppDemosScreen().apiDemosTitle));

    }
    @Given("kullanici API Demos butununa tikladi")
    public void kullanici_api_demos_butununa_tikladi() throws InterruptedException {

screens.AppDemosScreen().apiDemosbutonu.click();
    }
    @Then("kullanici API Demos ekraninda")
    public void kullanici_api_demos_ekraninda() {


    }
    @Then("kullanici Preference butununa tikladi")
    public void kullanici_preference_butununa_tikladi() {

tapOn(screens.AppDemosScreen().preference);


    }
    @Then("kullanici Preference ekraninda")
    public void kullanici_preference_ekraninda() {
        screens.preferencesScreen().preferenceScreenTitle.isDisplayed();

    }
    @Then("kullanici Preference dependencies tikladi")
    public void kullanici_preference_dependencies_tikladi() {
        screens.preferencesScreen().preferenceDependencies.click();

    }
    @Then("kullanici WiFi check box secmis olacak")
    public void kullanici_wi_fi_check_box_secmis_olacak() {
        screens.preferencesScreen().checkBox.click();

    }
    @Then("kullanici WiFi Settings tikladi")
    public void kullanici_wi_fi_settings_tikladi() {
        screens.preferencesScreen().wifiSettings.click();

    }
    @Then("WiFi setting popup geldi")
    public void wi_fi_setting_popup_geldi() {

    }
    @Then("kullanici {string} yazdi")
    public void kullanici_yazdi(String text) {
        screens.preferencesScreen().textBox.sendKeys(text);

    }
    @Then("kullanci ok butonuna tikladi")
    public void kullanci_ok_butonuna_tikladi() {
        screens.preferencesScreen().okButton.click();

    }
    @Then("kullanici {string} butununa tikladi")
    public void kullanici_butununa_tikladi(String string) {
        screens.preferencesScreen().switchButton.click();

    }


    @Then("kullanici check box tikladi")
    public void kullanici_check_box_tikladi() {
        screens.preferencesScreen().checkBox.click();

    }

    @Then("kulanici switch butonuna tikladi")
    public void kulanici_switch_butonuna_tikladi() {
        screens.preferencesScreen().firstSwitch.click();

    }

    @Then("screenshot al")
    public void screenshot_al() throws IOException {
 ReusableMethods.screenshot_al();

    }

    @And("check box secili olmali")
    public void checkBoxSeciliOlmali() {
if (screens.preferencesScreen().checkBox.getAttribute("checked").equals("false")){
screens.preferencesScreen().checkBox.click();
}else
    System.out.println("yanlis locate");
    }

    @And("ilk switch butonu kapali")
    public void ilkSwitchButonuKapali() {
if (screens.preferencesScreen().firstSwitch.getText().equals("ON")){
    screens.preferencesScreen().firstSwitch.click();
}
    }

    @And("ikici switch butonu acik")
    public void ikiciSwitchButonuAcik() {
        if (screens.preferencesScreen().secondSwitch.getText().equals("NO")){
            screens.preferencesScreen().secondSwitch.click();
        }
    }

}
