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

public class DetergentsActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detergents);


        searchView = (SearchView) findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);

        arrayList=new ArrayList<>();
        arrayList.add("Lux");
        arrayList.add("Axe");
        arrayList.add("Rexona");
        arrayList.add("Dove");
        arrayList.add("Comfort");
        arrayList.add("ARIEL");
        arrayList.add("Omo");
        arrayList.add("signal");
        arrayList.add("lifebouy");
        arrayList.add("Downy");
        arrayList.add("persil");
        arrayList.add("Tide");
        arrayList.add("Sunsilk");
        arrayList.add("Gif");
        arrayList.add("suave");
        arrayList.add("Ponds");
        arrayList.add("Knorr");
        arrayList.add("vaseline");
        arrayList.add("pampers");
        arrayList.add("protex");
        arrayList.add("palmolive");
        arrayList.add("orkid");
        arrayList.add("polo");
        arrayList.add("rejoice");
        arrayList.add("Rinso");
        arrayList.add("BOSS");
        arrayList.add("crest");
        arrayList.add("Raid");
        arrayList.add("camay");
        arrayList.add("vanish");
        arrayList.add("Dettol                                                           ");
        arrayList.add("venus");
        arrayList.add("Gillette");
        arrayList.add("zest");
        arrayList.add("tresemme");
        arrayList.add("cerave");
        arrayList.add("johnson");
        arrayList.add("oral-B");
        arrayList.add("safeguard");














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
                Intent myIntent = new Intent(DetergentsActivity.this,AlternativeDetergents.class);
                startActivity(myIntent);

            }
        });
    }
}
