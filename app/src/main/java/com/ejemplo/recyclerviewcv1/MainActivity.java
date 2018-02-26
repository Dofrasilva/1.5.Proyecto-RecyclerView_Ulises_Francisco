package com.ejemplo.recyclerviewcv1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.style.BackgroundColorSpan;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Aquí va la adición de elementos a la lista
        productList.add(
                new DataProvider("Folklorica", "sones huastecos","Comprar",R.drawable.sones)
        );
        productList.add(
                new DataProvider("Rock alternativo", "Urbano","Comprar",R.drawable.ro)
        );
        productList.add(
                new DataProvider("Pop", "Revuelto", "Comprar",R.drawable.popp)
        );
        productList.add(
                new DataProvider("Banda", "Regional Mexicano", "Comprar",R.drawable.bandas)
        );

        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);





    }
}
