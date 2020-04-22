package com.example.recodebaily;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends Activity {

private ExpandableListView listView;

    Button nursing_btn, sleep_btn, bowel_btn,babyfood_btn, powderedmilk_btn,dosage_btn
            ,temperature_btn,bath_btn,health_btn,play_btn;
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    int minute = cal.get(Calendar.MINUTE);
    int isAMorPM = cal.get(Calendar.AM_PM);



    final ArrayList<String> arrayList = new ArrayList<String>();
    final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
            (this,android.R.layout.simple_list_item_1,arrayList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display newDisplay = getWindowManager().getDefaultDisplay();
        int width = newDisplay.getWidth();
        listView = (ExpandableListView) findViewById(R.id.mylist);
        //여기부분
        ArrayList<myGroup> DataList = new ArrayList<myGroup>();


        ExpandableAdapter adapter = new ExpandableListAdapter();


        nursing_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+ isAMorPM +"수유");
            }
        });

        sleep_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"낮잠");
            }
        });
        bowel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"배변");
            }
        });
        babyfood_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"이유식");
            }
        });
        powderedmilk_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"분유");
            }
        });
        dosage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"약");
            }
        });
        temperature_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"온도체크");
            }
        });
        bath_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"목욕");
            }
        });
        health_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"병원");
            }
        });
        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(hour +":"+minute+isAMorPM +"놀이");
            }
        });




    }
}
