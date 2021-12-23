package com.example.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class cultureML extends AppCompatActivity {


    ListView listView;

    String[] Topics = {"परिचय","प्रसिद्ध उपहार गृह","उत्सव","भाषा और धर्म" ,"समाज जीवन"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_ml);

        listView = findViewById(R.id.list);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(cultureML.this, android.R.layout.simple_dropdown_item_1line,Topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0:
                        Intent intro = new Intent(cultureML.this,cultureintroH.class);
                        startActivity(intro);

                        break;
                    case 1:

                        Intent culturesFairsFestivalM = new Intent(cultureML.this,cultureFoodH.class);
                        startActivity(culturesFairsFestivalM);
                        break;
                    case 2: Intent  cultureLanguageReligionH= new Intent(cultureML.this, culturesFairsFestivalE.class);
                        startActivity(cultureLanguageReligionH);
                        break;
                    case 3:

                        Intent cult= new Intent(cultureML.this,culturePeopelH.class);
                        startActivity(cult);
                        break;
                    case 4:
                        Intent  cultu= new Intent(cultureML.this,culturePeopelH.class);
                        startActivity(cultu);
                        break;

                }





            }
        });






    }
}