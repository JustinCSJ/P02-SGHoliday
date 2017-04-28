package com.example.a15017573.p02_sgholiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> aa;
    ArrayList<String> type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lvHoliTypes);

        type = new ArrayList<String>();
        type.add("Secular");
        type.add("Ethnic & Religion");

        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, type);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedType = type.get(position).toString();
                Intent i = new Intent(MainActivity.this, SecularActivity.class);
                i.putExtra("type", selectedType);
                startActivity(i);
            }
        });
    }
}
