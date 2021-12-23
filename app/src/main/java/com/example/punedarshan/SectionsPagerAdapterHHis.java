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
public class SectionsPagerAdapterHHis extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_54,
            R.string.tab_text_55,
            R.string.tab_text_56,
            R.string.tab_text_57,
            R.string.tab_text_58,
            R.string.tab_text_59,

    };
    private final Context mContext;

    public SectionsPagerAdapterHHis(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position)
       {
           case 0:fragment=new Hindi_vishrambagWada();
           break;
           case 1:fragment=new Hindi_ShaniwarWada();
           break;
           case 2:fragment=new Hindi_lalMahal();
           break;
           case 3:fragment=new Hindi_NanaWada();
           break;
           case 4:fragment=new Hindi_ShitoleWada();
           break;
           case 5:fragment=new Hindi_BhuleshwarMandir();
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