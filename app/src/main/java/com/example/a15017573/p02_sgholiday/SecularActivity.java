package com.example.a15017573.p02_sgholiday;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.type;

public class SecularActivity extends AppCompatActivity {

    ListView lv;
    TextView tvSecular;
    //TextView tvDate;
    ArrayList<Holiday> holidays;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secular);

        lv = (ListView)findViewById(R.id.lvSecular);
        tvSecular = (TextView)findViewById(R.id.textViewSecular);
        //tvDate = (TextView)findViewById(R.id.tvDate);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tvSecular.setText(type);

        holidays = new ArrayList<Holiday>();
        if(type.equals("Secular")) {
            holidays.add(new Holiday("New Year's Day", "1 Jan 2017", R.drawable.new_year));
            holidays.add(new Holiday("Labour Day", "1 May 2017", R.drawable.labour_day));
        } else {
            holidays.add(new Holiday("Chinese New Year", "28-29 Jan 2017", R.drawable.chinese_new_year));
            holidays.add(new Holiday("Good Friday", "14 April 2017", R.drawable.good_friday));
        }


        aa = new HolidayAdapter(this, R.layout.row, holidays);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holidays.get(position);
                Toast.makeText(SecularActivity.this, selectedHoliday.getHoliday()
                                + ": " + selectedHoliday.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
