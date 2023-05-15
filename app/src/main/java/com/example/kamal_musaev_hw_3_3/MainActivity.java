package com.example.kamal_musaev_hw_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kamal_musaev_hw_3_3.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListNames = new ArrayList<>();

    ContactAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createArrayList();
        adapter = new ContactAdapter(arrayListNames);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }

    private void createArrayList() {
        arrayListNames.clear();
        arrayListNames.add("kamal, musaev, 30");
        arrayListNames.add("madina, akpaeva, 20");
        arrayListNames.add("omyrbek, avalbekov, 20");
        arrayListNames.add("jahongir, bekmuhammetov, 30");
        arrayListNames.add("chyngyz, asylbekov, 25");
        arrayListNames.add("almanbet, abdykulov, 23");
        arrayListNames.add("bekzat, niyazov, 31");
        arrayListNames.add("kamil, iminov, 31");
        arrayListNames.add("muzafar, alimov, 30");
        arrayListNames.add("altyn, sarybaev, 36");
        arrayListNames.add("alisher, aliev, 35");
        arrayListNames.add("ihtiyar, mamadzhanov, 27");
        arrayListNames.add("shama, inambaev, 35");
        arrayListNames.add("victor, shkapin, 37");
        arrayListNames.add("sultan, parpiev, 21");
        arrayListNames.add("aslan, bakirov, 29");
    }
}