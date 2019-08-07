package com.academy.fundamentals.moviesapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView m_textView;
    private static final String EXTRA_DATA_COUNTER = "EDC";

    public static void Start(Activity mainActivity, int m_counter) {
        Intent intent = new Intent(mainActivity, SecondActivity.class);
        intent.putExtra(EXTRA_DATA_COUNTER, m_counter);
        mainActivity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        m_textView = findViewById(R.id.textView);
        int counterFromIntent = getIntent().getIntExtra("EDC", -1);

        if(counterFromIntent != -1){
            SetText();
            Toast.makeText(this,"Got the counte successfully", Toast.LENGTH_LONG).show();
        }
    }

    private void SetText() {
        m_textView.setText("We got it!");
    }
}
