package screens;

import screens.androidScreen.ApiDemosScreen;

public class Screens {
public Screens(){

}

private ApiDemosScreen appDemosScreen;
private PreferenceDependenciesScreen preferenceDependenciesScreen;

public ApiDemosScreen AppDemosScreen(){
    if (appDemosScreen == null){
        appDemosScreen =new ApiDemosScreen();

    }
    return appDemosScreen;
}
    public PreferenceDependenciesScreen preferenceDependenciesScreen() {
        if (preferenceDependenciesScreen == null){
            preferenceDependenciesScreen = new PreferenceDependenciesScreen();
        }
        return preferenceDependenciesScreen;
    }

}
