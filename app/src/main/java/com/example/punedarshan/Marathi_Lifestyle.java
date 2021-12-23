package com.example.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Marathi_Lifestyle extends AppCompatActivity {


    ListView listView;

    String[] Topics = {"पदार्थ","मियामी","अँबी व्हॅली गोल्फ का मैदान","कैफे टून्स","ओशो आश्रम","बाग़","दुकान केंद्र"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi_lifestyle);

        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Marathi_Lifestyle.this, android.R.layout.simple_dropdown_item_1line,Topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0:
                        Intent Foodsintent = new Intent(Marathi_Lifestyle.this,Marathi_Foods.class);
                        startActivity(Foodsintent);
                        break;

                    case 1:Intent Miami = new Intent(Marathi_Lifestyle.this, Marathi_Miami.class);
                        startActivity(Miami);
                        break;

                    case 2: Intent AambyValleyGolfCourse = new Intent(Marathi_Lifestyle.this, Marathi_AambyValleyGolfCourse.class);
                        startActivity(AambyValleyGolfCourse);
                        break;

                    case 3:Intent CafeToons = new Intent(Marathi_Lifestyle.this, Marathi_CafeToons.class);
                        startActivity(CafeToons);
                        break;

                    case 4:Intent OshoAshram = new Intent(Marathi_Lifestyle.this, Marathi_OshoAshram.class);
                        startActivity(OshoAshram);
                        break;
                    case 5:Intent Gardens = new Intent(Marathi_Lifestyle.this, Marathi_Gardens.class);
                        startActivity(Gardens);
                        break;
                    case 6:Intent ShoppingCenter = new Intent(Marathi_Lifestyle.this, Marathi_ShoppingCenter.class);
                        startActivity(ShoppingCenter);
                        break;


                }


            }

        });
    }
}