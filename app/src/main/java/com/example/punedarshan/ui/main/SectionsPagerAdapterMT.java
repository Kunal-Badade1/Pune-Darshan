package com.example.punedarshan.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.punedarshan.R;
import com.example.punedarshan.marathi_parvati;
import com.example.punedarshan.marathifupchup;
import com.example.punedarshan.marathipataleshwar;
import com.example.punedarshan.marathitrishunda;
import com.example.punedarshan.marathivishnu;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterMT extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
       R.string.tab_text_20,
            R.string.tab_text_21,
            R.string.tab_text_22,
            R.string.tab_text_23,
            R.string.tab_text_24




    };
    private final Context mContext;

    public SectionsPagerAdapterMT(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new marathifupchup();
           break;
           case 1:fragment=new marathi_parvati();
           break;
           case 2:fragment=new marathipataleshwar();
               break;
           case 3:fragment=new marathitrishunda();
               break;
           case 4:fragment=new marathivishnu();
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

        return 5;
    }
}