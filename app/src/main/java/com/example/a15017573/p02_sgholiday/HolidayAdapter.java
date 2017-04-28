package com.example.a15017573.p02_sgholiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017573 on 28/4/2017.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView tvHoliName;
    private TextView tvDate;
    private ImageView ivHoli;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);

        holidays = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvHoliName = (TextView) rowView.findViewById(R.id.tvHoliName);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        ivHoli = (ImageView) rowView.findViewById(R.id.ivHoli);


        Holiday currentHoliday = holidays.get(position);
        tvHoliName.setText(currentHoliday.getHoliday());
        tvDate.setText(currentHoliday.getDate());

        ivHoli.setImageResource(currentHoliday.isImage());

        return rowView;
    }
}
