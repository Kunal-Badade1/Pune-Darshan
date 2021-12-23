package com.example.punedarshan.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.punedarshan.GupchupGanpati;
import com.example.punedarshan.Kelkarmuseum;
import com.example.punedarshan.ParvatiTemple;
import com.example.punedarshan.Pataleshwar;
import com.example.punedarshan.R;
import com.example.punedarshan.SouthernCommand;
import com.example.punedarshan.Trishunda;
import com.example.punedarshan.Vishnu;
import com.example.punedarshan.bladesofglory;
import com.example.punedarshan.fulemusem;
import com.example.punedarshan.peshwemuseum;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterT extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
         R.string.tab_text_8,
            R.string.tab_text_9,
            R.string.tab_text_10,
            R.string.tab_text_11,
            R.string.tab_text_12



    };
    private final Context mContext;

    public SectionsPagerAdapterT(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new GupchupGanpati();
           break;
           case 1:fragment=new ParvatiTemple();
           break;
           case 2:fragment=new Pataleshwar();
               break;
           case 3:fragment=new Trishunda();
               break;
           case 4:fragment=new Vishnu();
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