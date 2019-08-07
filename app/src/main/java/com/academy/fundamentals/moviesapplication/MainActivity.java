package com.academy.fundamentals.moviesapplication;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int m_counter = 0;
    private TextView m_textView;
    private static final String STATE_COUNTER = "SC";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_textView = findViewById(R.id.text);
    }

    public void IncreaseCount(View view) {
        m_counter = m_counter + 1;
        if(m_counter > 10){
            OpenSecondActivity();
            return;
        }
        m_textView.setText(String.valueOf(m_counter));
    }

    private void OpenSecondActivity() {
        StartActivity.Start(this);

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        outState.putInt(STATE_COUNTER, m_counter);
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if(savedInstanceState != null){
            int counter = savedInstanceState.getInt(STATE_COUNTER);
            m_textView.setText(String.valueOf(counter));
        }
        super.onRestoreInstanceState(savedInstanceState);
    }
}
