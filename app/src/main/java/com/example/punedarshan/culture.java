package com.example.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class culture extends AppCompatActivity {

    ListView listView;

    String[] Topics = {"Introduction","food","language and religion" ,"festival","people"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        listView = findViewById(R.id.list);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(culture.this, android.R.layout.simple_dropdown_item_1line,Topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0: Intent intro = new Intent(culture.this,caltureIntroE.class);
                    startActivity(intro);
                        break;
                    case 1:
                        Intent food = new Intent(culture.this, cultureFoodE.class);
                        startActivity(food);
                        break;
                    case 2:
                        Intent  lan= new Intent(culture.this, cultureLanguageReligionE.class);
                        startActivity(lan);
                        break;
                    case 3:Intent intent= new Intent(culture.this, culturesFairsFestivalE.class);
                        startActivity(intent);

                        break;
                    case 4:
                        Intent culturePeopleE = new Intent(culture.this,culturePeopleE.class);
                        startActivity(culturePeopleE);


                        break;

                }





            }
        });




    }
}