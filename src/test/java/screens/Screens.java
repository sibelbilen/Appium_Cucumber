package screens;

import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.DragAndDropScreen;
import screens.androidScreen.PreferenceScreen;

public class Screens {
public Screens(){

}

private ApiDemosScreen appDemosScreen;
private PreferenceScreen preferencesScreen;
private DragAndDropScreen dragAndDropScreen;

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

    public DragAndDropScreen dragAndDropScreen(){
    if (dragAndDropScreen==null){
        dragAndDropScreen=new DragAndDropScreen();
    }
    return  dragAndDropScreen;
    }

}
