package com.example.punedarshan.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.punedarshan.R;
import com.example.punedarshan.databinding.FragmentHomeBinding;
import com.example.punedarshan.history;

public class HomeFragment extends Fragment {


    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        context = getActivity();
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }

    public void onStart()
    {
        super.onStart();

        Button history = (Button) context.findViewById(R.id.history1);

        Button culture = (Button) context.findViewById(R.id.culture);

        Button lifestyle = (Button) context.findViewById(R.id.lifestyle);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, history.class);
                startActivity(intent);
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, com.example.punedarshan.culture.class);
                startActivity(intent);
            }
        });

        lifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, com.example.punedarshan.lifestyle.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}