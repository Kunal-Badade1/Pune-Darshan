package com.example.punedarshan.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.punedarshan.Kelkarmuseum;
import com.example.punedarshan.R;
import com.example.punedarshan.SouthernCommand;
import com.example.punedarshan.bladesofglory;
import com.example.punedarshan.fulemusem;
import com.example.punedarshan.hindicricket;
import com.example.punedarshan.hindifule;
import com.example.punedarshan.hindikelkar;
import com.example.punedarshan.hindimilitary;
import com.example.punedarshan.hindipeshwe;
import com.example.punedarshan.peshwemuseum;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterHM extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_15,
            R.string.tab_text_16,
            R.string.tab_text_17,
            R.string.tab_text_18,
            R.string.tab_text_19




    };
    private final Context mContext;

    public SectionsPagerAdapterHM(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new hindicricket();
           break;
           case 1:fragment=new hindifule();
           break;
           case 2:fragment=new hindipeshwe();
               break;
           case 3:fragment=new hindikelkar();
               break;
           case 4:fragment=new hindimilitary();
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