package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<Cities> citiesList = new ArrayList<Cities>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAdapterList();
    }

    private void setAdapterList() {
        Cities c0= new Cities("CAPE TOWN","SOUTH AFRICA");
        Cities c1= new Cities("VANCOUVER","CANADA");
        Cities c2= new Cities("NEW YORK","USA");
        Cities c3= new Cities("ROME","ITALY");
        Cities c4= new Cities("SAN FRANCISCO","USA");
        Cities c5= new Cities("RIO DE JANEIRO","BRAZIL");
        Cities c6= new Cities("PARIS","FRANCE");
        Cities c7= new Cities("HONG KONG","CHINA");
        Cities c8= new Cities("PRAGUE","CZECH REPUBLIC");
        Cities c9= new Cities("AMSTERDAM","THE NETHERLANDS");
        citiesList.addAll(Arrays.asList(new Cities[]{c0, c1, c2, c3, c4, c5, c6, c7, c8, c9}));

        recyclerView= findViewById(R.id.citiesList);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(citiesList,MainActivity.this) {};
        recyclerView.setAdapter(adapter);
    }
}