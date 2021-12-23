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
public class SectionsPagerAdapterMF extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_30,
            R.string.tab_text_31,
            R.string.tab_text_32,

    };
    private final Context mContext;

    public SectionsPagerAdapterMF(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new sinhagad_marathi();
           break;
           case 1:fragment=new rajgad_marathi();
           break;
           case 2:fragment=new jadhavgad_marathi();
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

        return 3;
    }
}