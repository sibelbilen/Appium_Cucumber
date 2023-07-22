package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import screens.Screens;
import utils.Driver;


public class AppDemosStep {
    Screens screens=new Screens();
    @Given("app yuklenir")
    public void app_yuklenir() {
        Driver.getAppiumDriver();
    }




    @Given("kullanici {string} butonuna tiklanir")
    public void kullanici_butonuna_tiklanir(String apiDemosbutonu) {
        //screens.AppDemosScreen().tamam.click();
       screens.AppDemosScreen().apiDemosbutonu.click();
    }

    @Given("kullanici  butonuna tiklanir")
    public void kullanici_butonuna_tiklanir() {
        screens.preferencesScreen().preferenceDependencies.click();
    }

    @Given("kullanici {string} secmis olacak")
    public void kullanici_secmis_olacak(String Wificheckbox) {


screens.preferencesScreen().checkBox.click();
    }
    @Given("kullanici {string} tikladi")
    public void kullanici_tikladi(String WiFiSettings) {
        screens.preferencesScreen().wifiSettings.click();

    }
    @And("wifi setting popup geldi")
    public void wifiSettingPopupGeldi() {

    }

    @Given("kullanici {string} yazar")
    public void kullanici_yazar(String text) {
        screens.preferencesScreen().textBox.sendKeys(text);

    }
    @Given("kullanici {string} tiklanir")
    public void kullanici_tiklanir(String okbuton) {
screens.preferencesScreen().okButton.click();
    }



}
