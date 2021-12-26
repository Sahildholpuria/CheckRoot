package com.sahildholpuria.checkroot;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check_btn(View view) {
        Toast.makeText(this, "Your Phone is Not Rooted", Toast.LENGTH_SHORT).show();
    }
}