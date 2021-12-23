package com.example.punedarshan;

import android.os.Bundle;

import com.example.punedarshan.ui.main.SectionsPagerAdapterEF;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.punedarshan.ui.main.SectionsPagerAdapter;
import com.example.punedarshan.databinding.ActivityEnglishFortsBinding;

public class English_Forts extends AppCompatActivity {

    private ActivityEnglishFortsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEnglishFortsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapterEF sectionsPagerAdapter = new SectionsPagerAdapterEF(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

    }
}