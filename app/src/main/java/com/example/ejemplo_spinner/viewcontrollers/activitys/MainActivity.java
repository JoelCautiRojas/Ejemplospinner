package com.example.ejemplo_spinner.viewcontrollers.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.ejemplo_spinner.R;
import com.example.ejemplo_spinner.data.models.SpinnerModelAdapter;
import com.example.ejemplo_spinner.viewcontrollers.adapters.SpinnerCustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    Spinner spinner1;
    Spinner spinner2;

    ArrayAdapter<CharSequence> adapter;
    SpinnerCustomAdapter adapter2;
    List<SpinnerModelAdapter> paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getExtras();
        getSesion();
        initPresenter();
        bindUI();
        initUI();
        initEvents();
    }

    @Override
    public void getExtras() {
        // TODO no hay;
    }

    @Override
    public void getSesion() {
        // TODO no hay;
    }

    @Override
    public void initPresenter() {
        // TODO no hay;
    }

    @Override
    public void bindUI() {
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
    }

    @Override
    public void initUI() {
        paises = new ArrayList<SpinnerModelAdapter>();
        for(int i = 0;i < 10;i++)
        {
            SpinnerModelAdapter pais = new SpinnerModelAdapter("pais "+i,"capital "+i);
            paises.add(pais);
        }
        adapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.planets_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        adapter2 = new SpinnerCustomAdapter(MainActivity.this,paises);
        spinner2.setAdapter(adapter2);
    }

    @Override
    public void initEvents() {
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Seleccionado "+position,Toast.LENGTH_SHORT);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this,"Seleccionado Ninguno",Toast.LENGTH_SHORT);
            }
        });
    }
}
