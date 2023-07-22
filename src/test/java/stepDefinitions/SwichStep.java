package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import screens.Screens;
import utils.Driver;

public class SwichStep {
    Screens screens=new Screens();
    @Given("app yuklenir")
    public void app_yuklenir() {
        Driver.getAppiumDriver();
    }



    @Given("kullanici {string} secmis olacak")
    public void kullanici_secmis_olacak(String Wificheckbox) {
          screens.preferencesScreen().switchButton.click();

    }

    @And("kullanici {string} butununa tikladi")
    public void kullaniciButununaTikladi(String arg0) {

    }

    @And("kulanici switch butonuna tikladi")
    public void kulaniciSwitchButonunaTikladi() {

    }

    @And("kullanici check box tikladi")
    public void kullaniciCheckBoxTikladi() {

    }

    @Then("screenshot al")
    public void screenshotAl() {

    }

    @And("check box secili olmali")
    public void checkBoxSeciliOlmali() {

    }

    @And("ilk switch butonu kapali")
    public void ilkSwitchButonuKapali() {

    }

    @And("ikici switch butonu acik")
    public void ikiciSwitchButonuAcik() {
    }
}
