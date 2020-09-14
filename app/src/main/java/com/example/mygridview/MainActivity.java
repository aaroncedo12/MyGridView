package com.example.mygridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GridView gv;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = findViewById(R.id.gridView);
        adapter = new CustomAdapter(this);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String codeName = adapter.androidList.get(i).codeName;
        String apiLevel = adapter.androidList.get(i).apiLevel;
        Toast.makeText(this, codeName + ",", Toast.LENGTH_SHORT).show();

    }
}