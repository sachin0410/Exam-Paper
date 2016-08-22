package com.example.sachingupta.test3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class OnSelectDuScreen extends Activity implements
        OnItemSelectedListener{
    Spinner s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent intent=getIntent();
        s1 = (Spinner)findViewById(R.id.spinner1);
        s2 = (Spinner)findViewById(R.id.spinner2);
        s3=(Spinner)findViewById(R.id.spinner3);

        s1.setOnItemSelectedListener(this);
        s2.setOnItemSelectedListener(this);
        s3.setOnItemSelectedListener(this);

//        s2.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View view, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub
        s1.getSelectedItem().toString();
        if  (arg0 == s1)
        {
            DataBaseHelper db = new DataBaseHelper(getApplicationContext());
            String[] branches = db.getBranchesName(s1.getSelectedItem().toString());
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, branches);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}