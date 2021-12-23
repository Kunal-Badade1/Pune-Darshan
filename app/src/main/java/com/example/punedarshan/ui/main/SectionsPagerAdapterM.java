package com.example.punedarshan.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.punedarshan.Frag2;
import com.example.punedarshan.Kelkarmuseum;
import com.example.punedarshan.R;
import com.example.punedarshan.SouthernCommand;
import com.example.punedarshan.bladesofglory;
import com.example.punedarshan.fulemusem;
import com.example.punedarshan.peshwemuseum;
import com.example.punedarshan.ui.Frag1;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterM extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_3,
            R.string.tab_text_4,
            R.string.tab_text_5,
            R.string.tab_text_6,
            R.string.tab_text_7


    };
    private final Context mContext;

    public SectionsPagerAdapterM(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new bladesofglory();
           break;
           case 1:fragment=new fulemusem();
           break;
           case 2:fragment=new peshwemuseum();
               break;
           case 3:fragment=new Kelkarmuseum();
               break;
           case 4:fragment=new SouthernCommand();
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