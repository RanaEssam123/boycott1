package com.example.finalproject3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinksActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    ArrayList<String>arrayList;
    ArrayAdapter<String>arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);


        searchView = (SearchView) findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);

        arrayList=new ArrayList<>();
        arrayList.add("pepsi");
        arrayList.add("cocacola");
        arrayList.add("lipton");
        arrayList.add("seven up");
        arrayList.add("dasani");
        arrayList.add("aquafina");
        arrayList.add("fanta");
        arrayList.add("Tang");
        arrayList.add("Nestle");
        arrayList.add("Nescafe");
        arrayList.add("cadbury Hot Cocoa");
        arrayList.add("Danon MAX");
        arrayList.add("BARAKA");
        arrayList.add("evian");
        arrayList.add("Nesquik");
        arrayList.add("starbuks");
        arrayList.add("moussa");
        arrayList.add("shani");
        arrayList.add("Mountain Dew");
        arrayList.add("Rita");
        arrayList.add("Sprite");
        arrayList.add("ROCKSTAR");
        arrayList.add("RedBull");
        arrayList.add("mirinda");
        arrayList.add("FREEZ");
        arrayList.add("adio");
        arrayList.add("BARBICAN");
        arrayList.add("TANGERINE");
        arrayList.add("vemto");
        arrayList.add("RANI");
        arrayList.add("BARBICAN");
        arrayList.add("cappy");
        arrayList.add("Tropicana");
        arrayList.add("BIRELL");
        arrayList.add("Red Bull");
        arrayList.add("Sirma");
        arrayList.add("Nido");







        arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(DrinksActivity.this,AlternativesDrinks.class);
                startActivity(myIntent);

            }
        });
    }
}
