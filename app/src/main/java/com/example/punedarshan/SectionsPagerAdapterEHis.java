package com.example.punedarshan;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.punedarshan.ui.Frag1;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterEHis extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_42,
            R.string.tab_text_43,
            R.string.tab_text_44,
            R.string.tab_text_45,
            R.string.tab_text_46,
            R.string.tab_text_47,


    };
    private final Context mContext;

    public SectionsPagerAdapterEHis(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new vishrambag_wada();
           break;
           case 1:fragment=new shaniwar_wada();
           break;
           case 2:fragment=new lal_mahal();
           break;
           case 3:fragment=new nana_wada();
           break;
           case 4:fragment=new shitole_wada();
           break;
           case 5:fragment=new bhuleshwar_temple();
           break;



       }
       return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {

        return 6;
    }
}