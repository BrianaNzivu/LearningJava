package com.example.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvResult = (TextView) findViewById(R.id.tvResponse);

        try {
            URL bookUrl = ApiUtil.buildUrl("cooking");
            String jsonResult = ApiUtil.getJson(bookUrl);
            tvResult.setText(jsonResult);
        }
        catch (Exception e) {
            Log.d("Error", e.getMessage());
        }

    }
}