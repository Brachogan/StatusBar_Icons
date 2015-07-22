package com.snowflaketeam.statusbaricons;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class TemplateFragment extends Fragment {
    GridView gridView;
    int[] iconIDs;
    String[] iconsNames;
    public static final int NOTIFICATION_ID = 12121992;
    public static final String SHARED_PREFS_KEY = "SharedPreferences";
    public static final String NOTIFICATION_KEY = "Notification";
    public static final String ICON_NAME_KEY = "IconName";

    public TemplateFragment() {

    }

    @SuppressLint("ValidFragment")
    public TemplateFragment(int[] iconIDs) {
        this.iconIDs = iconIDs;
    }

    @SuppressLint("ValidFragment")
    public TemplateFragment(int[] iconIDs, String[] iconsNames) {
        this.iconIDs = iconIDs;
        this.iconsNames = iconsNames;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_template, container, false);

        gridView = (GridView) view.findViewById(R.id.template_gridView);

        gridView.setAdapter(new MainFragment(getActivity(), iconIDs));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*
                * To setup the icon from the scratch and
                *
                * Bitmap to setup the the big icon in the pull down notification
                *
                * Notification.Builder used to setup how the notification look like
                *
                * NotificationManager responsible for pushing the notification into status bar
                * */
                Bitmap bm = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), iconIDs[position]),
                        getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_width),
                        getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_height),
                        true);

                Notification.Builder builder = new Notification.Builder(getActivity());
                builder.setContentTitle(iconsNames[position]);
                builder.setContentText("StatusBar Icons");
                builder.setSubText("SnowflakeTeam");
                builder.setSmallIcon(iconIDs[position]);
                builder.setLargeIcon(bm);
                builder.setOngoing(true);
                Notification notification = builder.build();
                NotificationManager notificationManger =
                        (NotificationManager) getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManger.notify(NOTIFICATION_ID, notification);

                // To save the last used icon value
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS_KEY, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt(NOTIFICATION_KEY, iconIDs[position]).commit();
                editor.putString(ICON_NAME_KEY,iconsNames[position]).commit();
            }
        });
        return view;
    }


}
