package com.example.recodebaily;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recode_list extends AppCompatActivity {

    Calendar cal = Calendar.getInstance();
    int month = cal.get(Calendar.MONTH);
    int date = cal.get(Calendar.DATE);
    long now = System.currentTimeMillis();

    private SimpleDateFormat mFormat = new SimpleDateFormat("M/d"); // 날짜 포맷
    String time = mFormat.format(date);
    private TextView whenDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recode_list);
        whenDate.setText(month+ "월" + date + "일"); // 현재 날짜로 설정


    }

}
