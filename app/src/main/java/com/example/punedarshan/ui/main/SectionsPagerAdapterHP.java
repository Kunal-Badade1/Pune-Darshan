package com.example.punedarshan.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.punedarshan.GupchupGanpati;
import com.example.punedarshan.ParvatiTemple;
import com.example.punedarshan.Pataleshwar;
import com.example.punedarshan.R;
import com.example.punedarshan.Trishunda;
import com.example.punedarshan.Vishnu;
import com.example.punedarshan.hindioriginpeth;
import com.example.punedarshan.pethshindi;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterHP extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
         R.string.tab_text_13,
            R.string.tab_text_14



    };
    private final Context mContext;

    public SectionsPagerAdapterHP(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new hindioriginpeth();
           break;
           case 1:fragment=new pethshindi();
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

        return 2;
    }
}