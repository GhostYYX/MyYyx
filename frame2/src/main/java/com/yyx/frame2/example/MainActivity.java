package com.yyx.frame2.example;

import android.app.Activity;
import android.os.Bundle;


import com.yyx.frame2.R;
import com.yyx.framing.frame7.CollapseCalendarView;
import com.yyx.framing.frame7.manager.CalendarManager;

import org.joda.time.LocalDate;

public class MainActivity extends Activity {

    private CollapseCalendarView mCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_main);

        CalendarManager manager = new CalendarManager(LocalDate.now(), CalendarManager.State.MONTH, LocalDate.now(), LocalDate.now().plusYears(1));

        mCalendarView = (CollapseCalendarView) findViewById(R.id.calendar);
        mCalendarView.init(manager);
    }
}
