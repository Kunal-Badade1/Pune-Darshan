package com.example.punedarshan.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.punedarshan.Marathi_Lifestyle;
import com.example.punedarshan.R;
import com.example.punedarshan.marathihistory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MarathiHomePage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MarathiHomePage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Activity context;

    public MarathiHomePage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MarathiHomePage.
     */
    // TODO: Rename and change types and number of parameters
    public static MarathiHomePage newInstance(String param1, String param2) {
        MarathiHomePage fragment = new MarathiHomePage();
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

         View view = inflater.inflate(R.layout.fragment_marathi_home_page,container,false);

        Button history = view.findViewById(R.id.history1);
       Button life = view.findViewById(R.id.lifestyle);



       life.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(context,Marathi_Lifestyle.class);
               startActivity(intent);
           }
       });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void  st()
    {
        Intent intent = new Intent(context, marathihistory.class);
        startActivity(intent);
    }





}