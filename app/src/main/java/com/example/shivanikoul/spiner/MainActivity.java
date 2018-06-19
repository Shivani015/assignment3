package com.example.shivanikoul.spiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner country,cities;
    String[] countries ={"India","Germnany","UK","Denmark"};
    String[] indianCities ={"Mumbai","Pune","Hyderabad","New Delhi"};
    String[] GermanyCities={"Berlin","Munich","Frankfurt","Leipzig"};
    String[] UKCities ={"London","Leeds","Bristol","Liverpool"};
    String[] DenmarkCities ={"Skagen","Odense","Kolding","Aarhus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country = findViewById(R.id.country);
        cities = findViewById(R.id.cities);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, countries);
        country.setAdapter(countryAdapter);
        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    setAdapter(indianCities);
                }else if (position == 1){
                    setAdapter(GermanyCities);
                }else if (position == 2){
                    setAdapter(UKCities);
                }else if (position == 3){
                    setAdapter(DenmarkCities);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void setAdapter(String[] citiesArray) {

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,citiesArray);
        cities.setAdapter(arrayAdapter);


    }

}
