package com.example.punedarshan.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.punedarshan.HindiLifestyle;
import com.example.punedarshan.Marathi_Lifestyle;
import com.example.punedarshan.R;
import com.example.punedarshan.cultureML;
import com.example.punedarshan.hindihistory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HindiHomePage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HindiHomePage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button h;
    Activity context;



    public HindiHomePage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HindiHomePage.
     */
    // TODO: Rename and change types and number of parameters
    public static HindiHomePage newInstance(String param1, String param2) {
        HindiHomePage fragment = new HindiHomePage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();

        View view = inflater.inflate(R.layout.fragment_hindi_home_page, container,false);

                h = view.findViewById(R.id.history1);
        Button lifestyle = view.findViewById(R.id.lifestyle);
        Button culture = view.findViewById(R.id.culture);


        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st();
            }
        });


        lifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               st3();
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st1();

            }
        });






        // Inflate the layout for this fragment
        return view;
    }

    public void  st()
    {
        Intent intent = new Intent(context, hindihistory.class);
        startActivity(intent);
    }

    public void  st1()
    {
        Intent intent = new Intent(context, cultureML.class);
        startActivity(intent);
    }


    public void  st3()
    {
        Intent intent = new Intent(context, HindiLifestyle.class);
        startActivity(intent);
    }





    @Override
    public void onStart() {
        super.onStart();


    }
}