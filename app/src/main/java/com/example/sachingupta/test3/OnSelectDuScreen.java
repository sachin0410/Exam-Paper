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

        String sp1 = String.valueOf(arg0.getSelectedItem());
        //Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if (sp1.contentEquals("I")) {
            List<String> list = new ArrayList<String>();
            list.add("-----");
            List<String> list1 = new ArrayList<String>();
            list1.add("Applied Mathematics-I ");
            list1.add("Applied Physics-I");
            list1.add("Manufacturing Processes");
            list1.add("Electrical Technology");
            list1.add("Human Values and Professional Ethics-I# ");
            list1.add("Fundamentals of Computing");
            list1.add("Applied Chemistry ");

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list1);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s3.setAdapter(dataAdapter2);
        } else if (sp1.contentEquals("II")) {
            List<String> list = new ArrayList<String>();
            list.add("-----");
            List<String> list1 = new ArrayList<String>();
            list1.add("Applied Mathematics-II ");
            list1.add("Applied Physics-II");
            list1.add("Electronic Devices");
            list1.add("Introduction to Programming ");
            list1.add("Environmental Studies");
            list1.add("Communication Skills ");
            list1.add("Engineering Mechanics ");

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list1);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s3.setAdapter(dataAdapter2);
        }
        else if (sp1.contentEquals("III")) {
            List<String> list = new ArrayList<String>();
            list.add("Computer Science");
            list.add("Information Technology");
            list.add("Mechanical");
            list.add("Electrical and Electronics");
            list.add("Electronics Communication");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);

            if (sp1.contentEquals("Computer Science")) {
                List<String> list1 = new ArrayList<String>();
                list1.add("Applied Mathematics-III ");
                list1.add("Foundation of Computer Science ");
                list1.add("Switching Theory and Logic Design ");
                list1.add("Circuits and Systems ");
                list1.add("Data Structure ");
                list1.add("Computer Graphics and Multimedia ");
                ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list1);
                dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                dataAdapter2.notifyDataSetChanged();
                s3.setAdapter(dataAdapter2);


            } else if (sp1.contentEquals("Mechanical")) {
                List<String> list1 = new ArrayList<String>();
                list1.add("Numerical Analysis and Statistical Techniques");
                list1.add("Electrical Machines ");
                list1.add("Thermal Science ");
                list1.add("Production Technology ");
                list1.add("Material Science and Metallurgy");
                list1.add("Strength of Materials-I ");
                ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list1);
                dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                dataAdapter2.notifyDataSetChanged();
                s3.setAdapter(dataAdapter2);


            }

        }
        else if (sp1.contentEquals("Computer Science")) {
            if (s1.getSelectedItem().toString().contentEquals("III") )
            {
                List<String> list1 = new ArrayList<String>();
                list1.add("Applied Mathematics-III ");
                list1.add("Foundation of Computer Science ");
                list1.add("Switching Theory and Logic Design ");
                list1.add("Circuits and Systems ");
                list1.add("Data Structure ");
                list1.add("Computer Graphics and Multimedia ");
                ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list1);
                dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                dataAdapter2.notifyDataSetChanged();
                s3.setAdapter(dataAdapter2);
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}