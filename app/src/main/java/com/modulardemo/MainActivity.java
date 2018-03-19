package com.modulardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.modulardemo.feature.Type1ViewProvider;
import com.modulardemo.feature.Type2ViewProvider;
import com.modulardemo.feature.Type3ViewProvider;
import com.modulardemo.feature.model.Type1Item;
import com.modulardemo.feature.model.Type2Item;
import com.modulardemo.feature.model.Type3Item;
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
                Arrays.asList(
                        new Type1Item("Type 1"),
                        new Type2Item("Type 2"),
                        new Type3Item("Type 3"),
                        new Type2Item("Type 2"),
                        new Type1Item("Type 1")));
        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout_content, resultListFragment)
                .commit();
    }
}
