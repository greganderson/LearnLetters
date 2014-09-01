package com.familybiz.greg.learnletters;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class LettersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		LinearLayout rootLayout = new LinearLayout(this);
		setTheme(android.R.style.Theme_Holo_Light);

		final RandomItemList<String> randomLetter = new RandomItemList<String>(getLetters());

		final TextView lettersView = new TextView(this);
		lettersView.setText(randomLetter.nextItem());
		lettersView.setGravity(Gravity.CENTER);
		lettersView.setTextSize(140);

		lettersView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				lettersView.setText(randomLetter.nextItem());
			}
		});

		LinearLayout.LayoutParams letterViewParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
		rootLayout.addView(lettersView, letterViewParams);

        setContentView(rootLayout);
    }

	private String[] getLetters() {
		String[] s = new String[26];

		StringBuilder sb;
		char letter;
		for (int i = 0; i < 26; i++) {
			letter = (char)(i + 65);
			sb = new StringBuilder();
			sb.append(letter);
			sb.append(' ');
			sb.append((char)(letter + 32));
			s[i] = sb.toString();
		}

		return s;
	}
}
