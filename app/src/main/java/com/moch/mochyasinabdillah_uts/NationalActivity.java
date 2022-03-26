package com.moch.mochyasinabdillah_uts;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NationalActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;

    String [] natdayArray = {
            "New Year",
            "Chinese New Year",
            "Nyepi",
            "Isra’ and Mi’raj",
            "May Day",
            "Vesak Day",
            "Ascension Day",
            "Pancasila Day",
            "Eid Al-Fitr",
            "Eid Al-Adha",
            "Independence day",
            "Islamic New Year",
            "Mawlid an-Nabi",
            "Christmas Day",
            "Easter Day"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national);

        listView = (ListView) findViewById(R.id.listView_natday);
        textView = (TextView) findViewById(R.id.textView_Item_natday);

        final ArrayAdapter adapter =new ArrayAdapter<String>(
                this,R.layout.list_item_national, R.id.textView_Item_natday,natdayArray);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value = " You choose The " + adapter.getItem(position);
                /* Display the Toast */
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void backClicked(View view){
        finish();
    }
}
