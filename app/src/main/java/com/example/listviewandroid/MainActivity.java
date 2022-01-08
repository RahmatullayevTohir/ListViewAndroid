package com.example.listviewandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CostomAdapter costomAdapter;
    ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<>();
        for (int i =0; i<20; i++){
            items.add(new Item("Student",R.drawable.im_simpl2));
        }

        initViews();

    }
    private void initViews(){
        listView = findViewById(R.id.lv_main);

        costomAdapter = new CostomAdapter(this,R.layout.item_list,items);

        listView.setAdapter(costomAdapter);
    }


}