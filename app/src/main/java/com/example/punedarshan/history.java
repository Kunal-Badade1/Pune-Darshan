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

public class history extends AppCompatActivity {

    ListView listView;

    String[] Topics = {"Peths in Pune","Forts","Museum","Hills" ,"Historical Places" ,"Temples"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(history.this, android.R.layout.simple_dropdown_item_1line,Topics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               switch(i)
               {
                   case 0:Intent pethintent = new Intent(history.this,pethh.class);
                   startActivity(pethintent);
                       break;
                   case 1:
                       Intent historyEnglish = new Intent(history.this,English_Forts.class);
                       startActivity(historyEnglish);
                       break;
                   case 2:Intent musem = new Intent(history.this,engmuseum.class);
                   startActivity(musem);
                       break;
                   case 3:
                       Intent hills = new Intent(history.this,English_hills.class);
                       startActivity(hills);
                       break;
                   case 4:
                       Intent histo = new Intent(history.this,Historical_Places.class);
                       startActivity(histo);
                       break;
                   case 5:Intent temples = new Intent(history.this,engTemples.class);
                       startActivity(temples);
                       break;

               }





            }
        });




    }
}