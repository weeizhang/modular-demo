package com.modulardemo.result;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.modulardemo.result.model.Type1Item;
import com.modulardemo.result.model.Type2Item;
import com.modulardemo.result.model.Type3Item;
import com.modulardemo.resultsdk.ViewProvider;

import java.util.Arrays;
import java.util.List;

public class ResultListFragment extends Fragment {
    private RecyclerView myRecycleView;
    private MyRecycleAdapter myRecycleAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        myRecycleView = view.findViewById(R.id.my_recycle_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
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
