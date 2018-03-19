package com.modulardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.modulardemo.result.ResultListFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout_content, new ResultListFragment())
                .commit();
    }
}
