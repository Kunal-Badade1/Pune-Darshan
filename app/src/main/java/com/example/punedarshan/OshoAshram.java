package com.example.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class OshoAshram extends AppCompatActivity {

    GridView gridView;

    int[] Images=
            {
                    R.drawable.oshoaasram,
                    R.drawable.oshomeditation,

            };
    String[] Name = {"Osho Ashram","Osho Ashram Meditation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osho_ashram);

        gridView = (GridView)findViewById(R.id.datagrid);

        OshoAshram.CustomAdapter customAdapter = new OshoAshram.CustomAdapter();
        gridView.setAdapter((ListAdapter) customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int[] foodsName = new int[06];
                int[] oshoashramName = new int[0];
                Toast.makeText(getApplicationContext(),oshoashramName[i],Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),GridView.class);
                intent.putExtra("name",foodsName[i]);
                boolean[] oshoashramImage = new boolean[6];
                intent.putExtra("image",oshoashramImage[i]);
                startActivity(intent);
            }
        });


    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            Object foodsImage = null;
            Object oshoashramImage = null;
            return (int) oshoashramImage;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.foods);
            ImageView image = view1.findViewById(R.id.images);

            int[] oshoashramName = new int[0];
            name.setText(oshoashramName[i]);
            int[] fruitImages = new int[0];
            int[] oshoashramImage = new int[0];
            image.setImageResource(oshoashramImage[i]);
            return view1;



        }


    }
}