package com.example.spinnercountry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner sp;
EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> countries = new ArrayList<String>();
        countries.add("India");
        countries.add("Canada");
        countries.add("China");
        countries.add("England");
        countries.add("Germany");
        countries.add("France");

        sp = findViewById(R.id.countryspin);
        ArrayAdapter<String> countAdapter = new ArrayAdapter<String>(this,R.layout.spinner,countries);
        countAdapter.setDropDownViewResource(R.layout.spinner);
        sp.setAdapter(countAdapter);
        sp.setOnItemSelectedListener(this);






    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        List<String> capitals = new ArrayList<String>();
        capitals.add("Delhi");
        capitals.add("Ottawa");
        capitals.add("Beijing");
        capitals.add("London");
        capitals.add("Berlin");
        capitals.add("Paris");
        EditText ed = findViewById(R.id.edcapital);
        ed.setText(capitals.get(i));


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
