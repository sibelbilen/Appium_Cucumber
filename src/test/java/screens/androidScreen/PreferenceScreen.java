package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class PreferenceScreen {
    public PreferenceScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public MobileElement preferenceScreenTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public MobileElement preferenceDependencies;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='9. Switch']")
    public MobileElement switchButton;

    @AndroidFindBy(id = "android:id/checkbox")
    public MobileElement checkBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public MobileElement wifiSettings;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement cancelButton;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement okButton;

    @AndroidFindBy(id = "android:id/edit")
    public MobileElement textBox;




    @AndroidFindBy(xpath = "(//android.widget.Switch)[1]")
    public MobileElement firstSwitch;

    @AndroidFindBy(xpath = "(//android.widget.Switch)[2]")
    public MobileElement secondSwitch;

}
