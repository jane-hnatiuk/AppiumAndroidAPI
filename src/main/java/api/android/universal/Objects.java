package api.android.universal;

import utils.UiObject;
import utils.UiSelector;

/**
 * Created by Artur on 1/24/2016.
 */
public class Objects {

    private static UiObject button1 = null, button2 = null, button3 = null;

    public static UiObject button1(){
        if(button1 == null) button1 = new UiSelector().resourceId("android:id/button1").makeUiObject();
        return button1;
    }

    public static UiObject button2(){
        if(button2 == null) button2 = new UiSelector().resourceId("android:id/button2").makeUiObject();
        return button2;
    }

    public static UiObject button3(){
        if(button3 == null) button3 = new UiSelector().resourceId("android:id/button3").makeUiObject();
        return button3;
    }
}
