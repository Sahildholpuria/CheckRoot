package com.sahildholpuria.checkroot;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.scottyab.rootbeer.RootBeer;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        textView = findViewById(R.id.check_textview);
    }

    public void check_btn(View view) {
//        Toast.makeText(this, "Your Phone is Not Rooted", Toast.LENGTH_SHORT).show();
        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            Toast.makeText(this, "Your Phone is Rooted", Toast.LENGTH_SHORT).show();
            textView.setText("Your Device is Rooted!");
        } else {
            //we didn't find indication of root
            Toast.makeText(this, "Your Phone is Not Rooted", Toast.LENGTH_SHORT).show();
            textView.setText("Your Device is Not Rooted!");
        }
    }
}