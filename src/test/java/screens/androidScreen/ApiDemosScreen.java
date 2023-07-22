package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ApiDemosScreen {
    public ApiDemosScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement apiDemosTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")

    public MobileElement preference;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/buttonDefaultPositive")
    public MobileElement tamam;




    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public  MobileElement apiDemosbutonu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public MobileElement views;




}
