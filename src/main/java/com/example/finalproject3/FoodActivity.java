package com.example.finalproject3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);

        arrayList=new ArrayList<>();
        arrayList.add("chipsy");
        arrayList.add("lion");
        arrayList.add("kitkat");
        arrayList.add("CORN FLAKES ");
        arrayList.add("McDonald's");
        arrayList.add("KFC");
        arrayList.add("PAPA JOHNS");
        arrayList.add("Hardees");
        arrayList.add("Pringles");
        arrayList.add("DANONE");
        arrayList.add("Doritos");
        arrayList.add("Cadbury");
        arrayList.add("Cheetos");
        arrayList.add("DUNKIN DONUTS");
        arrayList.add("Ahlawi");
        arrayList.add("Marie");
        arrayList.add("Shika Snacks");
        arrayList.add("Bisco Misr");
        arrayList.add("luxe");
        arrayList.add("Datto");
        arrayList.add("WAFERS");
        arrayList.add("Cinnabon");
        arrayList.add("SUNBITES");
        arrayList.add("HEINZ");
        arrayList.add("Pizza Hut");
        arrayList.add("Lay's");
        arrayList.add("moro");
        arrayList.add("Bake Rolz");
        arrayList.add("Bake Stix");
        arrayList.add("de leche");
        arrayList.add("Mars");
        arrayList.add("flutes");
        arrayList.add("Gersy");
        arrayList.add("SNICKERS");
        arrayList.add("m&m");
        arrayList.add("Hardee's");
        arrayList.add("Kellogg's");
        arrayList.add("Selim-Fast");
        arrayList.add("Sabra");
        arrayList.add("Twix");















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
                Intent myIntent = new Intent(FoodActivity.this,AlternativeFood.class);
                startActivity(myIntent);

            }
        });

    }
}
