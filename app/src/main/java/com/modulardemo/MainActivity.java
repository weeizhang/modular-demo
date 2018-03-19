package com.modulardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.modulardemo.feature.Type1ViewProvider;
import com.modulardemo.feature.Type2ViewProvider;
import com.modulardemo.feature.Type3ViewProvider;
import com.modulardemo.result.ResultListFragment;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ResultListFragment resultListFragment = new ResultListFragment();
        resultListFragment.init(
                Arrays.asList(
                        new Type1ViewProvider("Type 1"),
                        new Type2ViewProvider("Type 2"),
                        new Type3ViewProvider("Type 3")),
                new NetworkUtil()
        );
        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout_content, resultListFragment)
                .commit();
    }
}
