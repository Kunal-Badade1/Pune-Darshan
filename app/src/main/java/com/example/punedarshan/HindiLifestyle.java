package com.example.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HindiLifestyle extends AppCompatActivity {

    ListView listView;

    String[] Topics = {"पदार्थ","मियामी","अँबी व्हॅली गोल्फ का मैदान","कैफे टून्स","ओशो आश्रम","बाग़","दुकान केंद्र"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_lifestyle);

        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HindiLifestyle.this, android.R.layout.simple_dropdown_item_1line,Topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0:
                        Intent Foodsintent = new Intent(HindiLifestyle.this,Hindi_Foods.class);
                        startActivity(Foodsintent);
                        break;

                    case 1:Intent Miami = new Intent(HindiLifestyle.this, Hindi_Miami.class);
                        startActivity(Miami);
                        break;

                    case 2: Intent AambyValleyGolfCourse = new Intent(HindiLifestyle.this, Hindi_AambyValleyGolfCourse.class);
                        startActivity(AambyValleyGolfCourse);
                        break;

                    case 3:Intent CafeToons = new Intent(HindiLifestyle.this, Hindi_CafeToons.class);
                        startActivity(CafeToons);
                        break;

                    case 4:Intent OshoAshram = new Intent(HindiLifestyle.this, Hindi_OshoAshram.class);
                        startActivity(OshoAshram);
                        break;
                    case 5:Intent Gardens = new Intent(HindiLifestyle.this, Hindi_Gardens.class);
                        startActivity(Gardens);
                        break;
                    case 6:Intent ShoppingCenter = new Intent(HindiLifestyle.this, Hindi_ShoppingCenter.class);
                        startActivity(ShoppingCenter);
                        break;


                }


            }

        });
    }
}