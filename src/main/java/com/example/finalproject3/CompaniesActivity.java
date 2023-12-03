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

public class CompaniesActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companies);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);

        arrayList=new ArrayList<>();
        arrayList.add("PEPSICO");
        arrayList.add("LAROCHE POSAY");
        arrayList.add("johnson & johnson");
        arrayList.add("Unilever ");
        arrayList.add("cocacola");
        arrayList.add("Cadbury");
        arrayList.add("Burger King");
        arrayList.add("Starbucks");
        arrayList.add("Danone");
        arrayList.add("Netflix");
        arrayList.add("Nescafe");
        arrayList.add("schweppes");
        arrayList.add("l'oreal");
        arrayList.add("marlboro");
        arrayList.add("jallad");
        arrayList.add("zest");
        arrayList.add("head&shoulder");
        arrayList.add("Americana");
        arrayList.add("Lay's");
        arrayList.add("Pantine");
        arrayList.add("CAMAY");
        arrayList.add("pampers");
        arrayList.add("union air");
        arrayList.add("hogo");
        arrayList.add("kodak");
        arrayList.add("Nike");
        arrayList.add("fa");
        arrayList.add("Nestle");
        arrayList.add("Nokia");
        arrayList.add("IBM");
        arrayList.add("L'OREAL");
        arrayList.add("AXE");
        arrayList.add("Dove");
        arrayList.add("Rexona");
        arrayList.add("sunsilk");
        arrayList.add("comfort");
        arrayList.add("Lipton");
        arrayList.add("vaseline");
        arrayList.add("life boy");
        arrayList.add("dasani");
        arrayList.add("Knorr");
        arrayList.add("Kellogg's");
        arrayList.add("PHILIPS");
        arrayList.add("Chiclets");
        arrayList.add("Raid");
        arrayList.add("OLAY");
        arrayList.add("BRAUN");
        arrayList.add("NOKIA");
        arrayList.add("Timberland");
        arrayList.add("BOSS");
        arrayList.add("Victoria's Secret");
        arrayList.add("Calvin Klein");
        arrayList.add("maybelline");
        arrayList.add("The body shop");
        arrayList.add("Garnier");
        arrayList.add("lancom");
        arrayList.add("Urban decay");
        arrayList.add("giorgio armani");
        arrayList.add("neutrogena");
        arrayList.add("Too faced");
        arrayList.add("clinique");
        arrayList.add("Vichy");
        arrayList.add("la roche posay");














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
                Intent myIntent = new Intent(CompaniesActivity.this,AlternativeCompanies.class);
                startActivity(myIntent);

            }
        });


    }
}