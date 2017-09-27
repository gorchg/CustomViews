package com.ryuandjo.customviews;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;

import com.ryuandjo.customviews.widgets.TimePickerButton;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePickerButton timePickerButton = (TimePickerButton) findViewById(R.id.btn_timepicker);
        timePickerButton.setTimeSetListener(this);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

    }
}
