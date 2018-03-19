package com.modulardemo.result;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.modulardemo.common.model.BaseItem;
import com.modulardemo.resultsdk.ViewProvider;

import java.util.List;

public class ResultListFragment extends Fragment {
    private RecyclerView myRecycleView;
    private MyRecycleAdapter myRecycleAdapter;
    private List<ViewProvider> viewProviders;
    private List<BaseItem> items;

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

    public void init(List<ViewProvider> viewProviders, List<BaseItem> items) {
        this.viewProviders = viewProviders;
        this.items = items;
    }

    private void initView(View view) {
        myRecycleView = view.findViewById(R.id.my_recycle_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        myRecycleView.setLayoutManager(layoutManager);

        myRecycleAdapter = new MyRecycleAdapter();
        myRecycleAdapter.registerViewProvider(viewProviders);
        myRecycleAdapter.setItems(items);
        myRecycleView.setAdapter(myRecycleAdapter);
    }
}
