package com.example.fuzzyacaratv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
//ini khusus fuzzy

    @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btnhasil=(Button)findViewById(R.id.btnhasil);
       Button faq = (Button)findViewById(R.id.FAQ);
       faq.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            openfaqactivity();
           }
       });

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivityhasil();
            }
        });
    }
    public void openactivityhasil(){
        Intent intent= new Intent(this,activityhasil.class);
        startActivity(intent);
    }
    public void openfaqactivity(){
        Intent intentfaq= new Intent(this,faqactivity.class);
        startActivity(intentfaq);
    }

}
