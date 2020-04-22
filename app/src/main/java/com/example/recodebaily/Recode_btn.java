package com.example.recodebaily;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Recode_btn extends AppCompatActivity {
    Calendar cal = Calendar.getInstance();
    int month = cal.get(Calendar.MONTH);
    int date = cal.get(Calendar.DATE);
    long now = System.currentTimeMillis();

    private SimpleDateFormat mFormat = new SimpleDateFormat("M/d"); // 날짜 포맷
    String time = mFormat.format(date);
    private TextView whenDate2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recode_btn);


        setContentView(R.layout.activity_recode_list);
        whenDate2.setText(month+ "월" + date + "일");

    }
}
