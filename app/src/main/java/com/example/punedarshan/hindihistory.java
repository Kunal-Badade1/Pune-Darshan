package com.example.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hindihistory extends AppCompatActivity {


    ListView listView;

    String[] Topics = {"पुणे के पेठ","किले ","संग्रहालय","पहाड़ी टीले " ,"ऐतहासिक जगाए" ,"मंदिर"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindihistory);

        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(hindihistory.this, android.R.layout.simple_dropdown_item_1line,Topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0: Intent pethintent = new Intent(hindihistory.this,hindipeth.class);
                        startActivity(pethintent);
                        break;
                    case 1:
                        Intent forts = new Intent(hindihistory.this,Hindi_Forts.class);
                        startActivity(forts);
                        break;
                    case 2:Intent musem = new Intent(hindihistory.this,hindimuseum.class);
                        startActivity(musem);
                        break;
                    case 3:
                        Intent hills = new Intent(hindihistory.this,Hindi_hills.class);
                        startActivity(hills);
                        break;
                    case 4:
                        Intent History =new Intent(hindihistory.this,Hindi_HistoricalPlaces.class);
                        startActivity(History);
                        break;
                    case 5:Intent temples = new Intent(hindihistory.this,hinditemples.class);
                        startActivity(temples);
                        break;

                }


            }
        });






    }
}