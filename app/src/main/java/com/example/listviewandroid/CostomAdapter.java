package com.example.listviewandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CostomAdapter extends ArrayAdapter<Item> {

    Context context;
    int layout;
    ArrayList<Item> items;

    public CostomAdapter(Context context, int layout, ArrayList<Item> items){
        super(context,layout,items);
        this.context = context;
        this.layout = layout;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(layout,parent, false);
        }

        ((TextView) convertView.findViewById(R.id.text)).setText(items.get(position).text);
        ((ImageView) convertView.findViewById(R.id.image)).setImageResource(items.get(position).image);
        return convertView;
    }
}
