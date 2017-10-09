package com.down.pushnotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Wrap me 09 on 04-09-2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        System.out.println("refreshedToken: "+"no");
        //Getting registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Displaying token on logcat
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        System.out.println("refreshedToken: "+refreshedToken);
        //token for lenovoa6000 is: etn389zrwG4:APA91bFT7X8D_GWWfffHUvwETo4oTsEdplIMHHyaPG1LPHkMZLfVq1_tBiU7BGlaC1HHHZBcX-djfj0gqH3imlP0ljh5sl_BHjXR5V8teccF0fyV81askk0JOtD2w5VGcEwc2n1g4Krf
        //token for samsung tab is: d5OOVVnQq6o:APA91bGIkOTQxbjWeYD3TO_ccAzWHjESA5LXR1nyasSbXTd-IFICUYiQ1dmwa_ytWkq4VXx_8F6w0OFiHn4sO81xTasG3z46-6iQvKMUWS8pxZ1kav3MKWgzdMM_zL5K1NvrGg5-oNP9
    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }
}