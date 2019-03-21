package com.example.dasarandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    public static  final String EXTRA_DATA = "EXTRA_DATA";
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarfet);
        txtResult = (TextView) findViewById(R.id.textView);

        //get data
        if (getIntent().getExtras() != null) {
            String data = getIntent().getExtras().getString(TargetActivity.EXTRA_DATA);
             txtResult.setText(data);
        }
    }
}
