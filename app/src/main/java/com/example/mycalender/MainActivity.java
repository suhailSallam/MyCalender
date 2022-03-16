package com.example.mycalender;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private   CalendarView calendarView;
    // Calendar calendar; //used in conversions and database
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = findViewById(R.id.calendarView);
        textView = findViewById(R.id.textView);

        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String myDate = "Date: "+year+"/"+(month +1)+"/"+dayOfMonth;// months starts from zero in Android
            Toast.makeText(getApplicationContext(),myDate,Toast.LENGTH_LONG).show();
            textView.setText(myDate);
        });//end of setOnDateChangeListener()
    }//end ofn onCreate()
}//end class