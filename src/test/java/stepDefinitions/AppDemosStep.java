package stepDefinitions;

import io.cucumber.java.en.Given;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

public class AppDemosStep {
    Screens screens=new Screens();
    @Given("app yuklenir")
    public void app_yuklenir() {
        Driver.getAppiumDriver();
    }




    @Given("kullanici {string} butonuna tiklanir")
    public void kullanici_butonuna_tiklanir(String apiDemosbutonu) {

        screens.AppDemosScreen().tamam.click();
       screens.AppDemosScreen().apiDemosbutonu.click();
    }
    @Given("kullanici api demos ekraninda olduguna dair dogrulama")
    public void kullanici_api_demos_ekraninda_olduguna_dair_dogrulama() {
     //   screens.AppDemosScreen().apiDemosbutonu.isDisplayed();

    }
    @Given("kullanici prefrence ekranina giris yaptigini dair dogrulama")
    public void kullanici_prefrence_ekranina_giris_yaptigini_dair_dogrulama() {

       // screens.AppDemosScreen().preference.isDisplayed();
        screens.AppDemosScreen().preference.click();

    }
    @Given("kullanici {string} secmis olacak")
    public void kullanici_secmis_olacak(String string) {

    }
    @Given("kullanici {string} tikladi")
    public void kullanici_tikladi(String string) {

    }
    @Given("{string} popup geldi")
    public void popup_geldi(String string) {

    }
    @Given("kullanici {string} yazar")
    public void kullanici_yazar(String string) {

    }
    @Given("kullanici {string} tiklanir")
    public void kullanici_tiklanir(String string) {

    }
}
