package screens;

import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.PreferenceScreen;

public class Screens {
public Screens(){

}

private ApiDemosScreen appDemosScreen;
private PreferenceScreen preferencesScreen;

public ApiDemosScreen AppDemosScreen(){
    if (appDemosScreen == null){
        appDemosScreen =new ApiDemosScreen();

    }
    return appDemosScreen;
}
    public PreferenceScreen preferencesScreen() {
        if (preferencesScreen == null){
            preferencesScreen = new PreferenceScreen();
        }
        return preferencesScreen;
    }

}
