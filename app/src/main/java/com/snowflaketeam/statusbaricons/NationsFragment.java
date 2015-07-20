package com.snowflaketeam.statusbaricons;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class NationsFragment extends Fragment {

    GridView gridView;
    int[] nationalIconIDs = {
            R.drawable.main_africa,
            R.drawable.main_asia,
            R.drawable.main_europe,
            R.drawable.main_oceania,
            R.drawable.main_north_america,
            R.drawable.main_south_america
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_catg, container, false);

        gridView = (GridView) view.findViewById(R.id.main_gridView);

        gridView.setAdapter(new MainFragment(getActivity(), nationalIconIDs));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(AfricaFlags.africaNationIconIDs)).addToBackStack(null).commit();

                } else if (position == 1) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(AsiaFlags.asiaNationIconIDs)).addToBackStack(null).commit();

                } else if (position == 2) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(EuropeFlags.euroNationIconIDs)).addToBackStack(null).commit();

                } else if (position == 3) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(OceaniaFlags.oceaniaNationIconIDs)).addToBackStack(null).commit();

                } else if (position == 4) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(NorthAmericaFlags.northAmericaNationIconIDs)).addToBackStack(null).commit();

                } else if (position == 5) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(SouthAmericaFlags.southAmericaNationIconIDs)).addToBackStack(null).commit();

                }
            }
        });

        return view;
    }

    private static class AfricaFlags {
        static int[] africaNationIconIDs = {
                R.drawable.fb_nt_africa_algeria,
                R.drawable.fb_nt_africa_angola,
                R.drawable.fb_nt_africa_benin,
                R.drawable.fb_nt_africa_botswana,
                R.drawable.fb_nt_africa_burkina,
                R.drawable.fb_nt_africa_burundi,
                R.drawable.fb_nt_africa_cameroon,
                R.drawable.fb_nt_africa_cape,
                R.drawable.fb_nt_africa_central,
                R.drawable.fb_nt_africa_chad,
                R.drawable.fb_nt_africa_comoros,
                R.drawable.fb_nt_africa_congo,
                R.drawable.fb_nt_africa_djibouti,
                R.drawable.fb_nt_africa_drcongo,
                R.drawable.fb_nt_africa_egypt,
                R.drawable.fb_nt_africa_equatorial,
                R.drawable.fb_nt_africa_eritrea,
                R.drawable.fb_nt_africa_ethiopia,
                R.drawable.fb_nt_africa_gabon,
                R.drawable.fb_nt_africa_gambia,
                R.drawable.fb_nt_africa_ghana,
                R.drawable.fb_nt_africa_guinea,
                R.drawable.fb_nt_africa_guineab,
                R.drawable.fb_nt_africa_ivory,
                R.drawable.fb_nt_africa_kenya,
                R.drawable.fb_nt_africa_lesotho,
                R.drawable.fb_nt_africa_liberia,
                R.drawable.fb_nt_africa_libya,
                R.drawable.fb_nt_africa_madagascar,
                R.drawable.fb_nt_africa_malawi,
                R.drawable.fb_nt_africa_mali,
                R.drawable.fb_nt_africa_mauritania,
                R.drawable.fb_nt_africa_mauritius,
                R.drawable.fb_nt_africa_mayotte,
                R.drawable.fb_nt_africa_morocco,
                R.drawable.fb_nt_africa_mozambique,
                R.drawable.fb_nt_africa_namibia,
                R.drawable.fb_nt_africa_niger,
                R.drawable.fb_nt_africa_nigeria,
                R.drawable.fb_nt_africa_reunion,
                R.drawable.fb_nt_africa_rwanda,
                R.drawable.fb_nt_africa_sao,
                R.drawable.fb_nt_africa_senegal,
                R.drawable.fb_nt_africa_seychelles,
                R.drawable.fb_nt_africa_sierra,
                R.drawable.fb_nt_africa_somalia,
                R.drawable.fb_nt_africa_southafrica,
                R.drawable.fb_nt_africa_southsudan,
                R.drawable.fb_nt_africa_sudan,
                R.drawable.fb_nt_africa_swaziland,
                R.drawable.fb_nt_africa_tanzania,
                R.drawable.fb_nt_africa_togo,
                R.drawable.fb_nt_africa_tunisia,
                R.drawable.fb_nt_africa_uganda,
                R.drawable.fb_nt_africa_zambia,
                R.drawable.fb_nt_africa_zanzibar,
                R.drawable.fb_nt_africa_zimbabwe
        };

    }

    private static class AsiaFlags {
        static int[] asiaNationIconIDs = {
                R.drawable.fb_nt_asia_afghanistan,
                R.drawable.fb_nt_asia_australia,
                R.drawable.fb_nt_asia_bahrain,
                R.drawable.fb_nt_asia_bangladesh,
                R.drawable.fb_nt_asia_bhutan,
                R.drawable.fb_nt_asia_brunei,
                R.drawable.fb_nt_asia_cambodia,
                R.drawable.fb_nt_asia_china,
                R.drawable.fb_nt_asia_chinesetaipei,
                R.drawable.fb_nt_asia_east,
                R.drawable.fb_nt_asia_guam,
                R.drawable.fb_nt_asia_hongkong,
                R.drawable.fb_nt_asia_india,
                R.drawable.fb_nt_asia_indonesia,
                R.drawable.fb_nt_asia_iran,
                R.drawable.fb_nt_asia_iraq,
                R.drawable.fb_nt_asia_japan,
                R.drawable.fb_nt_asia_jordan,
                R.drawable.fb_nt_asia_krygyzstan,
                R.drawable.fb_nt_asia_kuwait,
                R.drawable.fb_nt_asia_laos,
                R.drawable.fb_nt_asia_lebanon,
                R.drawable.fb_nt_asia_macau,
                R.drawable.fb_nt_asia_malaysia,
                R.drawable.fb_nt_asia_maldives,
                R.drawable.fb_nt_asia_mongolia,
                R.drawable.fb_nt_asia_myanmar,
                R.drawable.fb_nt_asia_nepal,
                R.drawable.fb_nt_asia_nkorea,
                R.drawable.fb_nt_asia_nmariana,
                R.drawable.fb_nt_asia_oman,
                R.drawable.fb_nt_asia_pakistan,
                R.drawable.fb_nt_asia_palestine,
                R.drawable.fb_nt_asia_philippines,
                R.drawable.fb_nt_asia_qatar,
                R.drawable.fb_nt_asia_saudi,
                R.drawable.fb_nt_asia_singapore,
                R.drawable.fb_nt_asia_skorea,
                R.drawable.fb_nt_asia_srilanka,
                R.drawable.fb_nt_asia_syria,
                R.drawable.fb_nt_asia_tajikistan,
                R.drawable.fb_nt_asia_thailand,
                R.drawable.fb_nt_asia_turkmenistan,
                R.drawable.fb_nt_asia_uae,
                R.drawable.fb_nt_asia_uzbekistan,
                R.drawable.fb_nt_asia_vietnam,
                R.drawable.fb_nt_asia_yemen,
        };

    }

    private static class EuropeFlags {
        static int[] euroNationIconIDs = {
                R.drawable.fb_nt_euro_albania,
                R.drawable.fb_nt_euro_andorra,
                R.drawable.fb_nt_euro_armenia,
                R.drawable.fb_nt_euro_austria,
                R.drawable.fb_nt_euro_azerbaijan,
                R.drawable.fb_nt_euro_belarus,
                R.drawable.fb_nt_euro_belgium,
                R.drawable.fb_nt_euro_bosnia,
                R.drawable.fb_nt_euro_bulgaria,
                R.drawable.fb_nt_euro_croatia,
                R.drawable.fb_nt_euro_cyprus,
                R.drawable.fb_nt_euro_czech,
                R.drawable.fb_nt_euro_denmark,
                R.drawable.fb_nt_euro_england,
                R.drawable.fb_nt_euro_estonia,
                R.drawable.fb_nt_euro_faroe,
                R.drawable.fb_nt_euro_finland,
                R.drawable.fb_nt_euro_france,
                R.drawable.fb_nt_euro_georgia,
                R.drawable.fb_nt_euro_germany,
                R.drawable.fb_nt_euro_greece,
                R.drawable.fb_nt_euro_hungary,
                R.drawable.fb_nt_euro_iceland,
                R.drawable.fb_nt_euro_ireland,
                R.drawable.fb_nt_euro_israel,
                R.drawable.fb_nt_euro_italy,
                R.drawable.fb_nt_euro_kazakhstan,
                R.drawable.fb_nt_euro_latvia,
                R.drawable.fb_nt_euro_liechtenstein,
                R.drawable.fb_nt_euro_lithuania,
                R.drawable.fb_nt_euro_luxembourg,
                R.drawable.fb_nt_euro_macedonia,
                R.drawable.fb_nt_euro_malta,
                R.drawable.fb_nt_euro_moldova,
                R.drawable.fb_nt_euro_montenegro,
                R.drawable.fb_nt_euro_netherlands,
                R.drawable.fb_nt_euro_nireland,
                R.drawable.fb_nt_euro_norway,
                R.drawable.fb_nt_euro_poland,
                R.drawable.fb_nt_euro_portugal,
                R.drawable.fb_nt_euro_romania,
                R.drawable.fb_nt_euro_russia,
                R.drawable.fb_nt_euro_sanmarino,
                R.drawable.fb_nt_euro_scotland,
                R.drawable.fb_nt_euro_serbia,
                R.drawable.fb_nt_euro_slovakia,
                R.drawable.fb_nt_euro_slovenia,
                R.drawable.fb_nt_euro_spain,
                R.drawable.fb_nt_euro_sweden,
                R.drawable.fb_nt_euro_switzerland,
                R.drawable.fb_nt_euro_turkey,
                R.drawable.fb_nt_euro_ukraine,
                R.drawable.fb_nt_euro_wales,
        };

    }

    private static class OceaniaFlags {
        static int[] oceaniaNationIconIDs = {
                R.drawable.fb_nt_oceania_americansamoa,
                R.drawable.fb_nt_oceania_cook,
                R.drawable.fb_nt_oceania_fiji,
                R.drawable.fb_nt_oceania_kiribati,
                R.drawable.fb_nt_oceania_newc,
                R.drawable.fb_nt_oceania_newz,
                R.drawable.fb_nt_oceania_png,
                R.drawable.fb_nt_oceania_samoa,
                R.drawable.fb_nt_oceania_solomon,
                R.drawable.fb_nt_oceania_tahiti,
                R.drawable.fb_nt_oceania_tonga,
                R.drawable.fb_nt_oceania_tuvalu,
                R.drawable.fb_nt_oceania_vanuatu,
                R.drawable.fb_nt_oceania_wallis,
        };

    }

    private static class NorthAmericaFlags {
        static int[] northAmericaNationIconIDs = {
                R.drawable.fb_nt_northamerica_anguilla,
                R.drawable.fb_nt_northamerica_antigua,
                R.drawable.fb_nt_northamerica_aruba,
                R.drawable.fb_nt_northamerica_bahamas,
                R.drawable.fb_nt_northamerica_barbados,
                R.drawable.fb_nt_northamerica_belize,
                R.drawable.fb_nt_northamerica_bermuda,
                R.drawable.fb_nt_northamerica_britishvirgin,
                R.drawable.fb_nt_northamerica_canada,
                R.drawable.fb_nt_northamerica_cayman,
                R.drawable.fb_nt_northamerica_cayman,
                R.drawable.fb_nt_northamerica_costa,
                R.drawable.fb_nt_northamerica_cuba,
                R.drawable.fb_nt_northamerica_curacao,
                R.drawable.fb_nt_northamerica_dominica,
                R.drawable.fb_nt_northamerica_domrepublic,
                R.drawable.fb_nt_northamerica_elsalvador,
                R.drawable.fb_nt_northamerica_frenchg,
                R.drawable.fb_nt_northamerica_grenada,
                R.drawable.fb_nt_northamerica_guadeloupe,
                R.drawable.fb_nt_northamerica_guatemala,
                R.drawable.fb_nt_northamerica_guyana,
                R.drawable.fb_nt_northamerica_haiti,
                R.drawable.fb_nt_northamerica_honduras,
                R.drawable.fb_nt_northamerica_jamaica,
                R.drawable.fb_nt_northamerica_martinique,
                R.drawable.fb_nt_northamerica_mexico,
                R.drawable.fb_nt_northamerica_montserrat,
                R.drawable.fb_nt_northamerica_nicaragua,
                R.drawable.fb_nt_northamerica_panama,
                R.drawable.fb_nt_northamerica_puertorico,
                R.drawable.fb_nt_northamerica_sint,
                R.drawable.fb_nt_northamerica_stkitts,
                R.drawable.fb_nt_northamerica_stlucia,
                R.drawable.fb_nt_northamerica_stmartin,
                R.drawable.fb_nt_northamerica_stpierre,
                R.drawable.fb_nt_northamerica_stvincent,
                R.drawable.fb_nt_northamerica_surinam,
                R.drawable.fb_nt_northamerica_trinidad,
                R.drawable.fb_nt_northamerica_turks,
                R.drawable.fb_nt_northamerica_usa,
                R.drawable.fb_nt_northamerica_usvi
        };
    }

    private static class SouthAmericaFlags {
        static int[] southAmericaNationIconIDs = {
                R.drawable.fb_nt_southamerica_argentina,
                R.drawable.fb_nt_southamerica_bolivia,
                R.drawable.fb_nt_southamerica_brazil,
                R.drawable.fb_nt_southamerica_chile,
                R.drawable.fb_nt_southamerica_colombia,
                R.drawable.fb_nt_southamerica_ecuador,
                R.drawable.fb_nt_southamerica_paraguay,
                R.drawable.fb_nt_southamerica_peru,
                R.drawable.fb_nt_southamerica_uruguay,
                R.drawable.fb_nt_southamerica_venezuala
        };

    }


}
