package com.example.souad.pilgrimsupport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

public class Main2Activity extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper ;
    int[] IMAGE ={
            R.drawable.security,
            R.drawable.so
    };



    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    //List<String> expandableListTitle;
    //HashMap<String, List<String>> expandableListDetail;
    custom Custom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        adapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.adapterViewFlipper);
        custom Custom = new custom(getApplicationContext(), IMAGE);
        adapterViewFlipper.setAdapter(Custom);
        adapterViewFlipper.setFlipInterval(2600);
        adapterViewFlipper.setAutoStart(true);
    }



    public void toSecurityActivity(View view){
        Intent intent= new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}
