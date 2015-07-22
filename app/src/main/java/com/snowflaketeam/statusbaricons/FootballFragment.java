package com.snowflaketeam.statusbaricons;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class FootballFragment extends Fragment {
    GridView gridView;
    int[] leaguesIconIDs = {
            R.drawable.main_premier_league,
            R.drawable.main_liga_bbva,
            R.drawable.main_bundes_liga,
            R.drawable.main_serie_a,
            R.drawable.main_ligue,
            R.drawable.main_egyptian_league,
            R.drawable.main_national_teams
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_catg, container, false);

        gridView = (GridView) view.findViewById(R.id.main_gridView);

        gridView.setAdapter(new MainFragment(getActivity(), leaguesIconIDs));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(PremierLeague.premierLeagueIconIDs, PremierLeague.premierLeagueIconNames)).addToBackStack(null).commit();

                } else if (position == 1) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(LigaBBVA.ligaBBVAIconIDs, LigaBBVA.ligaBBVAIconNames)).addToBackStack(null).commit();

                } else if (position == 2) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(BundesLiga.bundesLigaIconIDs, BundesLiga.bundesLigaIconNames)).addToBackStack(null).commit();

                } else if (position == 3) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(SerieA.serieAIconIDs, SerieA.serieAIconNames)).addToBackStack(null).commit();

                } else if (position == 4) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(LigueOne.ligueIconIDs, LigueOne.ligueIconNames)).addToBackStack(null).commit();

                } else if (position == 5) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(EgyLeague.egyIconIDs, EgyLeague.egyIconNames)).addToBackStack(null).commit();

                } else if (position == 6) {
                    getFragmentManager().beginTransaction().add(R.id.container, new NationsFragment()).addToBackStack(null).commit();
                }
            }
        });

        return view;
    }

    private static class PremierLeague {
        static int[] premierLeagueIconIDs = {
                R.drawable.fb_premier_arsenal_fc,
                R.drawable.fb_premier_aston_villa_fc,
                R.drawable.fb_premier_blackburn_rovers_fc,
                R.drawable.fb_premier_burnley_fc,
                R.drawable.fb_premier_chelsea_fc,
                R.drawable.fb_premier_crystal_palace_fc,
                R.drawable.fb_premier_everton_fc,
                R.drawable.fb_premier_fulham_fc,
                R.drawable.fb_premier_hull_city_afc,
                R.drawable.fb_premier_leycester_city_fc,
                R.drawable.fb_premier_liverpool_fc,
                R.drawable.fb_premier_manchester_city_fc,
                R.drawable.fb_premier_manchester_united_fc,
                R.drawable.fb_premier_middlesbrough_fc,
                R.drawable.fb_premier_newcastle_united_fc,
                R.drawable.fb_premier_queens_park_rangers_fc,
                R.drawable.fb_premier_sheffield_united_fc,
                R.drawable.fb_premier_southampton_fc,
                R.drawable.fb_premier_stoke_city_fc,
                R.drawable.fb_premier_sunderland_afc,
                R.drawable.fb_premier_swansea_city_afc,
                R.drawable.fb_premier_tottenham_hotspur_fc,
                R.drawable.fb_premier_west_bromwich_albion_fc,
                R.drawable.fb_premier_west_ham_united_fc,
                R.drawable.fb_premier_wigan_athletic_fc,
                R.drawable.fb_premier_wolverhampton_wanderers_fc
        };

        static String[] premierLeagueIconNames = {
                "Arsenal F.C.",
                "Aston Villa F.C.",
                "Blackburn Rovers F.C.",
                "Burnley F.C.",
                "Chelsea  F.C.",
                "Crystal Palace F.C.",
                "Everton F.C.",
                "Fulham F.C.",
                "Hull City A.F.C.",
                "Leycester City F.C.",
                "Liverpool F.C.",
                "Manchester City F.C.",
                "Manchester United F.C.",
                "Middlesbrough F.C.",
                "Newcastle United F.C.",
                "Queens Park Rangers F.C.",
                "Sheffield United F.C.",
                "Southampton F.C.",
                "Stoke City F.C.",
                "Sunderland A.F.C.",
                "Swansea City A.F.C.",
                "Tottenham Hotspur F.C.",
                "West Bromwich Albion F.C.",
                "West Ham United F.C.",
                "Wigan Athletic F.C.",
                "Wolverhampton Wanderers F.C.",
        };

    }

    private static class LigaBBVA {
        static int[] ligaBBVAIconIDs = {
                R.drawable.fb_bbva_athletic_bilbao,
                R.drawable.fb_bbva_atletico_madrid,
                R.drawable.fb_bbva_barcelona,
                R.drawable.fb_bbva_celta_de_vigo,
                R.drawable.fb_bbva_cordoba,
                R.drawable.fb_bbva_deportivo_de_la_coruna,
                R.drawable.fb_bbva_elche,
                R.drawable.fb_bbva_espanyol,
                R.drawable.fb_bbva_getafe,
                R.drawable.fb_bbva_granada,
                R.drawable.fb_bbva_levante,
                R.drawable.fb_bbva_malaga,
                R.drawable.fb_bbva_rayo_vallecano,
                R.drawable.fb_bbva_real_madrid,
                R.drawable.fb_bbva_real_sociedad,
                R.drawable.fb_bbva_sd_eiba,
                R.drawable.fb_bbva_sevilla,
                R.drawable.fb_bbva_ud_almeria,
                R.drawable.fb_bbva_valencia,
                R.drawable.fb_bbva_villarreal
        };

        static String[] ligaBBVAIconNames = {
                "Athletic Bilbao",
                "Atlético Madrid",
                "FC Barcelona",
                "Celta de Vigo",
                "Cordoba",
                "Deportivo de La Coruña",
                "Elche CF",
                "RCD Espanyol",
                "Getafe CF",
                "Granada CF",
                "Levante UD",
                "Málaga CF",
                "Rayo Vallecano",
                "Real Madrid C.F.",
                "Real Sociedad",
                "SD Eibar",
                "Sevilla FC",
                "UD Almería",
                "Valencia CF",
                "Villarreal CF"
        };

    }

    private static class BundesLiga {
        static int[] bundesLigaIconIDs = {
                R.drawable.fb_bundes_augsburg,
                R.drawable.fb_bundes_bayer_leverkusen,
                R.drawable.fb_bundes_bayern_munich,
                R.drawable.fb_bundes_borussia,
                R.drawable.fb_bundes_dortmund,
                R.drawable.fb_bundes_eintracht_frankfurt,
                R.drawable.fb_bundes_freiburg,
                R.drawable.fb_bundes_hamburger,
                R.drawable.fb_bundes_hannover,
                R.drawable.fb_bundes_hertha,
                R.drawable.fb_bundes_hoffenheim,
                R.drawable.fb_bundes_koln,
                R.drawable.fb_bundes_mainz,
                R.drawable.fb_bundes_paderborn,
                R.drawable.fb_bundes_schalke,
                R.drawable.fb_bundes_stuttgart,
                R.drawable.fb_bundes_werder_bremen,
                R.drawable.fb_bundes_wolfsburg
        };

        static String[] bundesLigaIconNames = {
                "FC Augsburg",
                "Bayer Leverkusen",
                "FC Bayern Munich",
                "Borussia Mönchengla",
                "Borussia Dortmund",
                "Eintracht Frankfurt",
                "SC Freiburg",
                "Hamburger SV",
                "Hannover 96",
                "Hertha BSC",
                "TSG 1899 Hoffenheim",
                "1. FC Köln",
                "1. FSV Mainz 05",
                "SC Paderborn 07",
                "FC Schalke 04",
                "VfB Stuttgart",
                "SV Werder Bremen",
                "VfL Wolfsburg"
        };

    }

    private static class SerieA {
        static int[] serieAIconIDs = {
                R.drawable.fb_seriea_ac_cesena,
                R.drawable.fb_seriea_ac_chievo_verona,
                R.drawable.fb_seriea_ac_milan,
                R.drawable.fb_seriea_acf_fiorentina,
                R.drawable.fb_seriea_as_roma,
                R.drawable.fb_seriea_atalanta_calcio,
                R.drawable.fb_seriea_cagliari_calcio,
                R.drawable.fb_seriea_empoli_fc,
                R.drawable.fb_seriea_fc_internazionale_milano,
                R.drawable.fb_seriea_fc_juventus,
                R.drawable.fb_seriea_genoa_cfc,
                R.drawable.fb_seriea_hellas_verona_fc,
                R.drawable.fb_seriea_parma_fc,
                R.drawable.fb_seriea_ss_lazio,
                R.drawable.fb_seriea_ssc_napoli,
                R.drawable.fb_seriea_torino_fc,
                R.drawable.fb_seriea_uc_sampdoria,
                R.drawable.fb_seriea_udinese_calcio,
                R.drawable.fb_seriea_us_palermo,
                R.drawable.fb_seriea_us_sassuolo_calcio
        };

        static String[] serieAIconNames = {
                "A.C. Cesena",
                "A.C. Chievo Verona",
                "A.C. Milan",
                "ACF Fiorentina",
                "A.S. Roma",
                "Atalanta B.C.",
                "Cagliari Calcio",
                "Empoli F.C.",
                "Inter Milan",
                "Juventus F.C.",
                "Genoa C.F.C.",
                "Hellas Verona F.C.",
                "Parma F.C.",
                "S.S. Lazio",
                "S.S.C. Napoli",
                "Torino F.C.",
                "U.C. Sampdoria",
                "Udinese Calcio",
                "U.S. Città di Palermo",
                "U.S. Sassuolo Calcio"
        };

    }

    private static class LigueOne {
        static int[] ligueIconIDs = {
                R.drawable.fb_ligue_as_monaco,
                R.drawable.fb_ligue_as_saint_etienne,
                R.drawable.fb_ligue_en_avant_de_guingamp,
                R.drawable.fb_ligue_evian_thonon_gaillard_fc,
                R.drawable.fb_ligue_fc_girondins_de_bordeaux,
                R.drawable.fb_ligue_fc_lorient,
                R.drawable.fb_ligue_fc_metz,
                R.drawable.fb_ligue_fc_nantes,
                R.drawable.fb_ligue_lille_osc,
                R.drawable.fb_ligue_montpellier_hsc,
                R.drawable.fb_ligue_ogc_nice,
                R.drawable.fb_ligue_olympique_de_marseille,
                R.drawable.fb_ligue_olympique_lyonnais,
                R.drawable.fb_ligue_paris_fc,
                R.drawable.fb_ligue_paris_saint_germain,
                R.drawable.fb_ligue_rc_lens,
                R.drawable.fb_ligue_sc_bastia,
                R.drawable.fb_ligue_stade_de_reims,
                R.drawable.fb_ligue_stade_malherbe_caen,
                R.drawable.fb_ligue_stade_rennais_fc,
                R.drawable.fb_ligue_toulouse_fc
        };

        static String[] ligueIconNames = {
                "AS Monaco FC",
                "AS Saint-Étienne",
                "En Avant de Guingamp",
                "Evian Thonon Gaillard F.C.",
                "FC Girondins de Bordeaux",
                "FC Lorient",
                "FC Metz",
                "FC Nantes",
                "Lille OSC",
                "Montpellier HSC",
                "OGC Nice",
                "Olympique de Marseille",
                "Olympique Lyonnais",
                "Paris FC",
                "Paris Saint-Germain F.C.",
                "RC Lens",
                "SC Bastia",
                "Stade de Reims",
                "Stade Malherbe Caen",
                "Stade Rennais F.C.",
                "Toulouse FC"
        };

    }

    private static class EgyLeague {
        static int[] egyIconIDs = {
                R.drawable.fb_egy_alahlyfc,
                R.drawable.fb_egy_alexandriaunionfc,
                R.drawable.fb_egy_arabcontrectorsfc,
                R.drawable.fb_egy_elgishfc,
                R.drawable.fb_egy_elgounafc,
                R.drawable.fb_egy_elmasryfc,
                R.drawable.fb_egy_enppifc,
                R.drawable.fb_egy_entag7arbyfc,
                R.drawable.fb_egy_hareselhodod,
                R.drawable.fb_egy_ismailyfc,
                R.drawable.fb_egy_petrojetfc,
                R.drawable.fb_egy_policunionfc,
                R.drawable.fb_egy_zamalekfc
        };

        static String[] egyIconNames = {
                "Al Ahly SC",
                "Alexandria Union F.C.",
                "El Mokawloon SC",
                "Tala'ea El-Gaish SC",
                "El Gouna FC",
                "Al-Masry SC",
                "Enppi F.C.",
                "El-Harby SC",
                "Haras El Hodood SC",
                "Ismaily SC",
                "Petrojet FC",
                "Police Union F.C.",
                "Zamalek SC"
        };

    }
}
