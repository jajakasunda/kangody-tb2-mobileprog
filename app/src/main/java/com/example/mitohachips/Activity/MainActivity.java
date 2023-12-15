package com.example.mitohachips.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mitohachips.Adaptor.CategoryAdaptor;
import com.example.mitohachips.Adaptor.PopularAdaptor;
import com.example.mitohachips.Domain.CategoryDomain;
import com.example.mitohachips.Domain.FoodDomain;
import com.example.mitohachips.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import kotlinx.coroutines.channels.Receive;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter, adapter2;
private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();
        bottomNavigation();
    }

    private void bottomNavigation(){
        FloatingActionButton floatingActionButton = findViewById(R.id.cartBtn);
        LinearLayout homeBtn = findViewById(R.id.homeBtn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CartListActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
    }


    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Singkong","skg"));
        category.add(new CategoryDomain("Pisang", "psg"));
        category.add(new CategoryDomain("Balado", "bld"));

        adapter=new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Singkong Original", "skg","Bumbu Original Khas Mitoha Chips",50000.00));
        foodList.add(new FoodDomain("Pisang Asin", "psg","Kerpik Pisang yang diberikan bumbu rasa asin gurih, menambah citarasa khas Mitoha Chips",60000.00));
        foodList.add(new FoodDomain("Singkong Balado", "bld","Keripik Singkong Balado dengan balutan Bumbu balado Khas Mitoha CHips",80000.00));

        adapter2= new PopularAdaptor(foodList);
        recyclerViewPopularList.setAdapter(adapter2);


    }
}