package com.snowflaketeam.statusbaricons;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends Activity {
    GridView gridView;

    int[] iconIDs = {
            R.drawable.main_automotive,
            R.drawable.main_football,
            R.drawable.main_others,
            R.drawable.main_flags
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment adapter = new MainFragment(MainActivity.this, iconIDs);

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

        // To change the whole app font [not working yet]
        ReplaceFont.setDefaultFont(this, "DEFAULT", "pacifico.ttf");

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(Automotive.automotiveIconIDs, Automotive.automotiveIconNames)).addToBackStack(null).commit();
                } else if (position == 1) {
                    getFragmentManager().beginTransaction().add(R.id.container, new FootballFragment()).addToBackStack(null).commit();
                } else if (position == 2) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(Others.otherIconIDs, Others.otherIconNames)).addToBackStack(null).commit();
                } else if (position == 3) {
                    getFragmentManager().beginTransaction().add(R.id.container, new FlagsFragment()).addToBackStack(null).commit();
                }
            }
        });
    }

    public void clearNotification(View view) {
        NotificationManager notification = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        notification.cancel(TemplateFragment.NOTIFICATION_ID);
    }

    private static class Automotive {
        static int[] automotiveIconIDs = {
                R.drawable.automotive_alfa_romeo,
                R.drawable.automotive_audi,
                R.drawable.automotive_bmw,
                R.drawable.automotive_brilliance,
                R.drawable.automotive_chevrolet,
                R.drawable.automotive_citroen,
                R.drawable.automotive_ferrari,
                R.drawable.automotive_fiat,
                R.drawable.automotive_ford,
                R.drawable.automotive_honda,
                R.drawable.automotive_hyundai,
                R.drawable.automotive_infiniti,
                R.drawable.automotive_jaguar,
                R.drawable.automotive_jeep,
                R.drawable.automotive_kia,
                R.drawable.automotive_lancia,
                R.drawable.automotive_land_rover,
                R.drawable.automotive_lexus,
                R.drawable.automotive_mazda,
                R.drawable.automotive_mercedes,
                R.drawable.automotive_mg,
                R.drawable.automotive_mini,
                R.drawable.automotive_mitsubishi,
                R.drawable.automotive_nissan,
                R.drawable.automotive_opel,
                R.drawable.automotive_peugeot,
                R.drawable.automotive_porsche,
                R.drawable.automotive_renault,
                R.drawable.automotive_seat,
                R.drawable.automotive_skoda,
                R.drawable.automotive_toyota,
                R.drawable.automotive_volkswagen,
                R.drawable.automotive_volvo
        };

        static String[] automotiveIconNames = {
                "Alfa Romeo",
                "Audi",
                "BMW",
                "Brilliance",
                "Chevrolet",
                "Citroen",
                "Ferrari",
                "Fiat",
                "Ford",
                "Honda",
                "Hyundai",
                "Infiniti",
                "Jaguar",
                "Jeep",
                "Kia",
                "Lancia",
                "Land Rover",
                "Lexus",
                "Mazda",
                "Mercedes",
                "MG",
                "Mini Cooper",
                "Mitsubishi",
                "Nissan",
                "Opel",
                "Peugeot",
                "Porsche",
                "Renault",
                "Seat",
                "Skoda",
                "Toyota",
                "Volkswagen",
                "Volvo"
        };
    }

    private static class Others {
        static int[] otherIconIDs = {
                R.drawable.others_venom,
                R.drawable.others_intel,
                R.drawable.others_beats,
                R.drawable.others_cyanogen,
                R.drawable.others_cyanogenii,
                R.drawable.others_etisalat,
                R.drawable.others_lol,
                R.drawable.others_hon,
                R.drawable.others_silkroad,
                R.drawable.others_miui,
                R.drawable.others_nividia,
                R.drawable.others_skullcandy,
                R.drawable.others_tegra,
                R.drawable.others_viper,
                R.drawable.others_virgin,
                R.drawable.others_vodafone,
                R.drawable.others_xda,
                R.drawable.snowflake_icon
        };

        static String[] otherIconNames = {
                "Team Venom",
                "Intel",
                "Beats",
                "Cyanogen",
                "Cyanogen",
                "Etisalat",
                "League of Legends",
                "Heroes of Newerth",
                "Silkroad",
                "MIUI",
                "Nividia",
                "Skullcandy",
                "Nividia",
                "Team Venom",
                "Virgin",
                "Vodafone",
                "XDA",
                "SnowflakeTeam"
        };
    }
}
