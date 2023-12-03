package com.example.finalproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView food = (TextView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this , FoodActivity.class);
                startActivity(foodIntent);
            }
        });
        TextView drinks = (TextView) findViewById(R.id.drinks);
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drinksIntent = new Intent(MainActivity.this,DrinksActivity.class);
                startActivity(drinksIntent);
            }
        });
        TextView detergents = (TextView) findViewById(R.id.detergents);
        detergents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detergentsIntent = new Intent(MainActivity.this, DetergentsActivity.class);
                startActivity(detergentsIntent);
            }
        });
        TextView companies = (TextView) findViewById(R.id.companies);
        companies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent companiesIntent = new Intent(MainActivity.this, CompaniesActivity.class);
                startActivity(companiesIntent);
            }
        });
    }
}