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
public class SectionsPagerAdapterMHis extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_48,
            R.string.tab_text_49,
            R.string.tab_text_50,
            R.string.tab_text_51,
            R.string.tab_text_52,
            R.string.tab_text_53,

    };
    private final Context mContext;

    public SectionsPagerAdapterMHis(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new marathi_vishrambag();
           break;
           case 1:fragment=new marathi_shaniwarwada();
           break;
           case 2:fragment=new marathi_lalmahal();
           break;
           case 3:fragment=new marathi_nanawada();
           break;
           case 4:fragment=new marathi_shitolewada();
           break;
           case 5:fragment=new marathi_bhuleshwarmandir();
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