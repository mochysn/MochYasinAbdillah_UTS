package com.moch.mochyasinabdillah_uts;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nama = findViewById(R.id.tv_namaMain);
        nama.setText(Preferences.getLoggedInUser(getBaseContext()));

        findViewById(R.id.button_logoutMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferences.clearLoggedInUser(getBaseContext());
                startActivity(new Intent(getBaseContext(),LoginActivity.class));
                finish();
            }
        });
    }
    public void calClicked(View view){
        Intent i = new Intent(MainActivity.this, CalendarActivity.class);
        startActivity(i);
    }

    public void natClicked(View view){
        Intent i = new Intent(MainActivity.this, NationalActivity.class);
        startActivity(i);
    }

    public void aboutClicked(View view){
        Intent i = new Intent(MainActivity.this, About.class);
        startActivity(i);
    }
}

