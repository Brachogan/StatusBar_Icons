package com.snowflaketeam.statusbaricons;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.IBinder;

/**
 * Created by Mohammed on 7/20/2015.
 * <p/>
 * the service that bring the icon back after booting up
 */
public class AutoStartUp extends Service {



    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onCreate() {
        super.onCreate();

        //To restore the value of last icon used
        SharedPreferences sharedPreferences = getSharedPreferences(TemplateFragment.SHARED_PREFS_KEY, MODE_PRIVATE);
        int icon = sharedPreferences.getInt(TemplateFragment.NOTIFICATION_KEY, R.drawable.snowflake_icon);
        String iconName = sharedPreferences.getString(TemplateFragment.ICON_NAME_KEY, "SnowflakeTeam");
        /*
        * To setup the icon from the scratch and
        *
        * Bitmap to setup the the big icon in the pull down notification
        *
        * Notification.Builder used to setup how the notification look like
        *
        * NotificationManager responsible for pushing the notification into status bar
        * */
        Bitmap bm = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), icon),
                getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_width),
                getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_height),
                true);

        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle(iconName);
        builder.setContentText("StatusBar Icons");
        builder.setSubText("SnowflakeTeam");
        builder.setSmallIcon(icon);
        builder.setLargeIcon(bm);
        builder.setOngoing(true);
        Notification notification = builder.build();
        NotificationManager notificationManger =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManger.notify(TemplateFragment.NOTIFICATION_ID, notification);
    }


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
