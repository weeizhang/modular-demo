package com.modulardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.modulardemo.model.Type1Item;
import com.modulardemo.model.Type2Item;
import com.modulardemo.model.Type3Item;

import java.util.Arrays;
import java.util.List;

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

        List<ViewProvider> viewProviders = Arrays.asList(
                new Type1ViewProvider("Type 1"),
                new Type2ViewProvider("Type 2"),
                new Type3ViewProvider("Type 3"));
        myRecycleAdapter = new MyRecycleAdapter(
                Arrays.asList(
                        new Type1Item("Type 1"),
                        new Type2Item("Type 2"),
                        new Type3Item("Type 3"),
                        new Type2Item("Type 2"),
                        new Type1Item("Type 1")),
                viewProviders);
        myRecycleView.setAdapter(myRecycleAdapter);
    }
}
