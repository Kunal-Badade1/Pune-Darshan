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
import com.example.punedarshan.hindiparvatimandir;
import com.example.punedarshan.hindipataleshwarmandir;
import com.example.punedarshan.hinditrishunda;
import com.example.punedarshan.hindivishnu;
import com.example.punedarshan.ui.hindigupchup;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterHT extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
       R.string.tab_text_20,
            R.string.tab_text_21,
            R.string.tab_text_22,
            R.string.tab_text_23,
            R.string.tab_text_24




    };
    private final Context mContext;

    public SectionsPagerAdapterHT(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new hindigupchup();
           break;
           case 1:fragment=new hindiparvatimandir();
           break;
           case 2:fragment=new hindipataleshwarmandir();
               break;
           case 3:fragment=new hinditrishunda();
               break;
           case 4:fragment=new hindivishnu();
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