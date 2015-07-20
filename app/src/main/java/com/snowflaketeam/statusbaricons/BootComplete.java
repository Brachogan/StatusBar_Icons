package com.snowflaketeam.statusbaricons;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Mohammed on 7/20/2015.
 *
 * This class used to check that the app is boot completed and open the service that will bring the icon back
 */
public class BootComplete extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
            Intent serviceIntent = new Intent(context, AutoStartUp.class);
            context.startService(serviceIntent);
        }

    }
}
