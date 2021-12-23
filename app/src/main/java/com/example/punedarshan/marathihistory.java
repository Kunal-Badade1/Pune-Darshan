package com.example.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class marathihistory extends AppCompatActivity {

    ListView listView;

    String[] Topics = {"पुण्यातील पेठा","किल्ले","संग्रहालय", "टेकड्या" ,"ऐतिहासिक जागा" ,"मंदिर"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathihistory);

        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( marathihistory.this, android.R.layout.simple_dropdown_item_1line,Topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0: Intent pethintent = new Intent( marathihistory.this,marathipetha.class);
                        startActivity(pethintent);
                        break;
                    case 1:
                        Intent forts = new Intent(marathihistory.this,Marathi_Forts.class);
                        startActivity(forts);
                        break;
                    case 2:Intent musem = new Intent( marathihistory.this,marathimuseum.class);
                        startActivity(musem);
                        break;
                    case 3:
                        Intent hills = new Intent(marathihistory.this,Marathi_hills.class);
                        startActivity(hills);
                        break;
                    case 4:
                        Intent his = new Intent(marathihistory.this,marathi_historical_places.class);
                        startActivity(his);
                        break;
                    case 5:Intent temples = new Intent( marathihistory.this, marathitemples.class);
                        startActivity(temples);
                        break;

                }


            }
        });





    }
}