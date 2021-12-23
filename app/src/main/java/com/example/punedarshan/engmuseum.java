package com.example.punedarshan;

import android.os.Bundle;

import com.example.punedarshan.ui.main.SectionsPagerAdapterM;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.punedarshan.ui.main.SectionsPagerAdapter;
import com.example.punedarshan.databinding.ActivityEngmuseum2Binding;

public class engmuseum extends AppCompatActivity {

    private ActivityEngmuseum2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEngmuseum2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapterM sectionsPagerAdapter = new SectionsPagerAdapterM(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);



    }
}