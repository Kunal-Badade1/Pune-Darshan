package com.example.punedarshan.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.punedarshan.Frag2;
import com.example.punedarshan.R;
import com.example.punedarshan.jadhavgad;
import com.example.punedarshan.rajgad;
import com.example.punedarshan.shihagad;
import com.example.punedarshan.ui.Frag1;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterEF extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_27,
            R.string.tab_text_28,
            R.string.tab_text_29,


    };
    private final Context mContext;

    public SectionsPagerAdapterEF(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new shihagad();
           break;
           case 1:fragment=new rajgad();
           break;
           case 2:fragment=new jadhavgad();
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