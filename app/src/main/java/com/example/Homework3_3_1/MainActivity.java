package com.example.Homework3_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a3_3_1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String>  contactName = new ArrayList<>();
private RecyclerView rv_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        contactName.add("Can");
        contactName.add("Leo");
        contactName.add("Sem");
        contactName.add("Kai");
        contactName.add("Cat");
        contactName.add("Dog");
        contactName.add("Zak");
        contactName.add("King");
        contactName.add("Queen");
        contactName.add("Aldos");
        contactName.add("Darius");
        contactName.add("Nana");
        initAdapter();
    }
    private void initAdapter(){
        contactAdapter adapter = new contactAdapter(contactName);
        rv_contact.setAdapter(adapter);
    }

    private void initView() {
        rv_contact = findViewById(R.id.rv_activityMain);
    }
}