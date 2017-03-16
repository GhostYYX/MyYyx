package com.yyx.frame1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.yyx.framing.frame3.Titanic;
import com.yyx.framing.frame3.TitanicTextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TitanicTextView tv = (TitanicTextView) findViewById(R.id.my_text_view);

        // set fancy typeface
        tv.setTypeface(Typefaces.get(this, "Satisfy-Regular.ttf"));

        // start animation
        new Titanic().start(tv);
    }

}
