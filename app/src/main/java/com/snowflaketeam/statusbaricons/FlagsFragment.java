package com.snowflaketeam.statusbaricons;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class FlagsFragment extends Fragment {
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
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(AfricaNationalFlags.africaFlagIconIDs)).addToBackStack(null).commit();

                } else if (position == 1) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(AsiaNationalFlags.asiaFlagIconIDs)).addToBackStack(null).commit();

                } else if (position == 2) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(EuropeNationalFlags.euroFlagIconIDs)).addToBackStack(null).commit();

                } else if (position == 3) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(OceaniaNationalFlags.oceaniaFlagIconIDs)).addToBackStack(null).commit();

                } else if (position == 4) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(NorthAmericaNationalFlags.northAmericaFlagIconIDs)).addToBackStack(null).commit();

                } else if (position == 5) {
                    getFragmentManager().beginTransaction().add(R.id.container, new TemplateFragment(SouthAmericaNationalFlags.southAmericaFlagIconIDs)).addToBackStack(null).commit();

                }
            }
        });

        return view;
    }

        private static class AfricaNationalFlags {
                static int[] africaFlagIconIDs = {
                        R.drawable.flag_africa_alg,
                        R.drawable.flag_africa_ang,
                        R.drawable.flag_africa_bdi,
                        R.drawable.flag_africa_ben,
                        R.drawable.flag_africa_bfa,
                        R.drawable.flag_africa_bot,
                        R.drawable.flag_africa_cgo,
                        R.drawable.flag_africa_cha,
                        R.drawable.flag_africa_civ,
                        R.drawable.flag_africa_cmr,
                        R.drawable.flag_africa_cod,
                        R.drawable.flag_africa_com,
                        R.drawable.flag_africa_cpv,
                        R.drawable.flag_africa_cta,
                        R.drawable.flag_africa_dji,
                        R.drawable.flag_africa_egy,
                        R.drawable.flag_africa_eqg,
                        R.drawable.flag_africa_eri,
                        R.drawable.flag_africa_eth,
                        R.drawable.flag_africa_gab,
                        R.drawable.flag_africa_gam,
                        R.drawable.flag_africa_gha,
                        R.drawable.flag_africa_gnb,
                        R.drawable.flag_africa_gui,
                        R.drawable.flag_africa_ken,
                        R.drawable.flag_africa_lbr,
                        R.drawable.flag_africa_lby,
                        R.drawable.flag_africa_les,
                        R.drawable.flag_africa_mad,
                        R.drawable.flag_africa_mar,
                        R.drawable.flag_africa_may,
                        R.drawable.flag_africa_mli,
                        R.drawable.flag_africa_moz,
                        R.drawable.flag_africa_mri,
                        R.drawable.flag_africa_mtn,
                        R.drawable.flag_africa_mwi,
                        R.drawable.flag_africa_nam,
                        R.drawable.flag_africa_nga,
                        R.drawable.flag_africa_nig,
                        R.drawable.flag_africa_reu,
                        R.drawable.flag_africa_rsa,
                        R.drawable.flag_africa_rsd,
                        R.drawable.flag_africa_rwa,
                        R.drawable.flag_africa_sen,
                        R.drawable.flag_africa_sey,
                        R.drawable.flag_africa_sle,
                        R.drawable.flag_africa_som,
                        R.drawable.flag_africa_stp,
                        R.drawable.flag_africa_sud,
                        R.drawable.flag_africa_swz,
                        R.drawable.flag_africa_tan,
                        R.drawable.flag_africa_tog,
                        R.drawable.flag_africa_tun,
                        R.drawable.flag_africa_uga,
                        R.drawable.flag_africa_zaire,
                        R.drawable.flag_africa_zam,
                        R.drawable.flag_africa_zim,
                        R.drawable.flag_africa_znz,
                };

                static int[] africaFlagName = {};

        }

        private static class AsiaNationalFlags {
                static int[] asiaFlagIconIDs = {
                        R.drawable.flag_asia_afg,
                        R.drawable.flag_asia_ban,
                        R.drawable.flag_asia_bhr,
                        R.drawable.flag_asia_bhu,
                        R.drawable.flag_asia_bru,
                        R.drawable.flag_asia_cam,
                        R.drawable.flag_asia_chn,
                        R.drawable.flag_asia_gum,
                        R.drawable.flag_asia_hkg,
                        R.drawable.flag_asia_idn,
                        R.drawable.flag_asia_ind,
                        R.drawable.flag_asia_irn,
                        R.drawable.flag_asia_irq,
                        R.drawable.flag_asia_jor,
                        R.drawable.flag_asia_jpn,
                        R.drawable.flag_asia_kgz,
                        R.drawable.flag_asia_kor,
                        R.drawable.flag_asia_ksa,
                        R.drawable.flag_asia_kuw,
                        R.drawable.flag_asia_lao,
                        R.drawable.flag_asia_lib,
                        R.drawable.flag_asia_mac,
                        R.drawable.flag_asia_mas,
                        R.drawable.flag_asia_mdv,
                        R.drawable.flag_asia_mgl,
                        R.drawable.flag_asia_mya,
                        R.drawable.flag_asia_myanmar,
                        R.drawable.flag_asia_nep,
                        R.drawable.flag_asia_oma,
                        R.drawable.flag_asia_pak,
                        R.drawable.flag_asia_pal,
                        R.drawable.flag_asia_phi,
                        R.drawable.flag_asia_prk,
                        R.drawable.flag_asia_qat,
                        R.drawable.flag_asia_sin,
                        R.drawable.flag_asia_sri,
                        R.drawable.flag_asia_syr,
                        R.drawable.flag_asia_tha,
                        R.drawable.flag_asia_tjk,
                        R.drawable.flag_asia_tkm,
                        R.drawable.flag_asia_tmp,
                        R.drawable.flag_asia_tpe,
                        R.drawable.flag_asia_uae,
                        R.drawable.flag_asia_uzb,
                        R.drawable.flag_asia_vie,
                        R.drawable.flag_asia_yem,
                };

        }

        private static class EuropeNationalFlags {
                static int[] euroFlagIconIDs = {
                        R.drawable.flag_europe_alb,
                        R.drawable.flag_europe_and,
                        R.drawable.flag_europe_arm,
                        R.drawable.flag_europe_aut,
                        R.drawable.flag_europe_aze,
                        R.drawable.flag_europe_bas,
                        R.drawable.flag_europe_bel,
                        R.drawable.flag_europe_bih,
                        R.drawable.flag_europe_blr,
                        R.drawable.flag_europe_bul,
                        R.drawable.flag_europe_cro,
                        R.drawable.flag_europe_cyp,
                        R.drawable.flag_europe_cze,
                        R.drawable.flag_europe_den,
                        R.drawable.flag_europe_eng,
                        R.drawable.flag_europe_esp,
                        R.drawable.flag_europe_est,
                        R.drawable.flag_europe_fin,
                        R.drawable.flag_europe_fra,
                        R.drawable.flag_europe_fro,
                        R.drawable.flag_europe_gbr,
                        R.drawable.flag_europe_geo,
                        R.drawable.flag_europe_ger,
                        R.drawable.flag_europe_gib,
                        R.drawable.flag_europe_gre,
                        R.drawable.flag_europe_hun,
                        R.drawable.flag_europe_irl,
                        R.drawable.flag_europe_isl,
                        R.drawable.flag_europe_isr,
                        R.drawable.flag_europe_ita,
                        R.drawable.flag_europe_kaz,
                        R.drawable.flag_europe_lie,
                        R.drawable.flag_europe_ltu,
                        R.drawable.flag_europe_lux,
                        R.drawable.flag_europe_lva,
                        R.drawable.flag_europe_mda,
                        R.drawable.flag_europe_mgo,
                        R.drawable.flag_europe_mkd,
                        R.drawable.flag_europe_mlt,
                        R.drawable.flag_europe_mon,
                        R.drawable.flag_europe_ned,
                        R.drawable.flag_europe_nir,
                        R.drawable.flag_europe_nor,
                        R.drawable.flag_europe_pol,
                        R.drawable.flag_europe_por,
                        R.drawable.flag_europe_rda,
                        R.drawable.flag_europe_rom,
                        R.drawable.flag_europe_rus,
                        R.drawable.flag_europe_sco,
                        R.drawable.flag_europe_ser,
                        R.drawable.flag_europe_smr,
                        R.drawable.flag_europe_sui,
                        R.drawable.flag_europe_svk,
                        R.drawable.flag_europe_svn,
                        R.drawable.flag_europe_swe,
                        R.drawable.flag_europe_tur,
                        R.drawable.flag_europe_ukr,
                        R.drawable.flag_europe_urss,
                        R.drawable.flag_europe_vatican,
                        R.drawable.flag_europe_wal,
                        R.drawable.flag_europe_yougo,
                };

        }

        private static class OceaniaNationalFlags {
                static int[] oceaniaFlagIconIDs = {
                        R.drawable.flag_oceania_asa,
                        R.drawable.flag_oceania_aus,
                        R.drawable.flag_oceania_cok,
                        R.drawable.flag_oceania_fij,
                        R.drawable.flag_oceania_kir,
                        R.drawable.flag_oceania_marshall,
                        R.drawable.flag_oceania_nauru,
                        R.drawable.flag_oceania_ncl,
                        R.drawable.flag_oceania_niue,
                        R.drawable.flag_oceania_nrm,
                        R.drawable.flag_oceania_nzl,
                        R.drawable.flag_oceania_palaos,
                        R.drawable.flag_oceania_png,
                        R.drawable.flag_oceania_sam,
                        R.drawable.flag_oceania_sol,
                        R.drawable.flag_oceania_tah,
                        R.drawable.flag_oceania_tga,
                        R.drawable.flag_oceania_tuv,
                        R.drawable.flag_oceania_van,
                        R.drawable.flag_oceania_wfi,
                };

        }

        private static class NorthAmericaNationalFlags {
                static int[] northAmericaFlagIconIDs = {
                        R.drawable.flag_northamerica_aia,
                        R.drawable.flag_northamerica_aru,
                        R.drawable.flag_northamerica_atg,
                        R.drawable.flag_northamerica_bah,
                        R.drawable.flag_northamerica_ber,
                        R.drawable.flag_northamerica_bes,
                        R.drawable.flag_northamerica_blz,
                        R.drawable.flag_northamerica_brb,
                        R.drawable.flag_northamerica_can,
                        R.drawable.flag_northamerica_cay,
                        R.drawable.flag_northamerica_crc,
                        R.drawable.flag_northamerica_cub,
                        R.drawable.flag_northamerica_cur,
                        R.drawable.flag_northamerica_dma,
                        R.drawable.flag_northamerica_dom,
                        R.drawable.flag_northamerica_glp,
                        R.drawable.flag_northamerica_grn,
                        R.drawable.flag_northamerica_gua,
                        R.drawable.flag_northamerica_guf,
                        R.drawable.flag_northamerica_guy,
                        R.drawable.flag_northamerica_hai,
                        R.drawable.flag_northamerica_hon,
                        R.drawable.flag_northamerica_jam,
                        R.drawable.flag_northamerica_lca,
                        R.drawable.flag_northamerica_mex,
                        R.drawable.flag_northamerica_msr,
                        R.drawable.flag_northamerica_mtq,
                        R.drawable.flag_northamerica_nca,
                        R.drawable.flag_northamerica_pan,
                        R.drawable.flag_northamerica_pur,
                        R.drawable.flag_northamerica_sim,
                        R.drawable.flag_northamerica_skn,
                        R.drawable.flag_northamerica_slv,
                        R.drawable.flag_northamerica_sma,
                        R.drawable.flag_northamerica_spm,
                        R.drawable.flag_northamerica_sur,
                        R.drawable.flag_northamerica_tca,
                        R.drawable.flag_northamerica_tri,
                        R.drawable.flag_northamerica_usa,
                        R.drawable.flag_northamerica_vgb,
                        R.drawable.flag_northamerica_vin,
                        R.drawable.flag_northamerica_vir,
                };
        }

        private static class SouthAmericaNationalFlags {
                static int[] southAmericaFlagIconIDs = {
                        R.drawable.flag_southamerica_arg,
                        R.drawable.flag_southamerica_bol,
                        R.drawable.flag_southamerica_bra,
                        R.drawable.flag_southamerica_chi,
                        R.drawable.flag_southamerica_col,
                        R.drawable.flag_southamerica_ecu,
                        R.drawable.flag_southamerica_par,
                        R.drawable.flag_southamerica_per,
                        R.drawable.flag_southamerica_uru,
                        R.drawable.flag_southamerica_ven,
                };

        }
}
