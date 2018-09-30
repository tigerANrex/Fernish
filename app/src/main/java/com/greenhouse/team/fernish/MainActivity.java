package com.greenhouse.team.fernish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] plantsArray = {"Sago Palm", "Aloe Vera", "Peace Lily", "Succ-ulents", "Bamboo"};

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, plantsArray);

        listView = (ListView) findViewById(R.id.mainMenu);
        listView.setAdapter(adapter);
    }
}
