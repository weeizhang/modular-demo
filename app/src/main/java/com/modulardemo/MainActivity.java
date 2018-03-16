package com.modulardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecycleView;
    private MyRecycleAdapter myRecycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRecycleView = findViewById(R.id.my_recycle_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        myRecycleView.setLayoutManager(layoutManager);

        myRecycleAdapter = new MyRecycleAdapter(Arrays.asList(new BaseItem("Type 1")));
        myRecycleView.setAdapter(myRecycleAdapter);
    }
}
