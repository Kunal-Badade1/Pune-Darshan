package com.example.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lifestyle extends AppCompatActivity {


    ListView listView;

    String[] Topics = {"Foods","Miami","Aamby Valley Golf Course","Cafe Toons","Osho Ashram","Gardens","Shopping Center"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifestyle);
        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(lifestyle.this, android.R.layout.simple_dropdown_item_1line,Topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0:Intent Foodsintent = new Intent(lifestyle.this,Foods.class);
                        startActivity(Foodsintent);
                        break;

                    case 1:Intent Miami = new Intent(lifestyle.this, Miami.class);
                        startActivity(Miami);
                        break;

                    case 2: Intent AambyValleyGolfCourse = new Intent(lifestyle.this , AambyValleyGolfCourse.class);
                        startActivity(AambyValleyGolfCourse);
                        break;

                    case 3:Intent CafeToons = new Intent(lifestyle.this, CafeToons.class);
                        startActivity(CafeToons);
                        break;

                    case 4:Intent OshoAshram = new Intent(lifestyle.this, osho_English.class);
                        startActivity(OshoAshram);
                        break;
                    case 5:Intent Gardens = new Intent(lifestyle.this, Gardens.class);
                        startActivity(Gardens);
                        break;
                    case 6:Intent ShoppingCenter = new Intent(lifestyle.this, ShoppingCenter.class);
                        startActivity(ShoppingCenter);
                        break;


                }


            }

        });

    }
}