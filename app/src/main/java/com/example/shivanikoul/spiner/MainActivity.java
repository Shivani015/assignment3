package com.example.shivanikoul.spiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner country,states;
    String[] countries ={"India","Germnany","Japan","Australia"};
    String[] indianstates ={"Karnataka","Kerela","Rajasthan","Delhi"};
    String[] Germanystates={"Berlin","Bermin","Lower saxony","saarland"};
    String[] Japanstates ={"Tokyo","Osaka","Kyoto","Hyogo"};
    String[] Australiastates ={"western Australa","South Australia","Victoria","Queensland"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country = findViewById(R.id.country);
        states = findViewById(R.id.states);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, countries);
        country.setAdapter(countryAdapter);
        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    setAdapter(indianstates);
                }else if (position == 1){
                    setAdapter(Germanystates);
                }else if (position == 2){
                    setAdapter(Japanstates);
                }else if (position == 3){
                    setAdapter(Australiastates);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void setAdapter(String[] statesArray ) {

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,statesArray);
        states.setAdapter(arrayAdapter);


    }

}
