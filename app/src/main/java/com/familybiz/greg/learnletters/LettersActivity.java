package com.familybiz.greg.learnletters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


public class LettersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		LinearLayout rootLayout = new LinearLayout(this);

		TextView lettersView = new TextView(this);


        setContentView(rootLayout);
    }
}
