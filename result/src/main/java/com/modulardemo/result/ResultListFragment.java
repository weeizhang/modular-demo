package com.modulardemo.result;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.fastjson.JSON;
import com.modulardemo.common.model.BaseItem;
import com.modulardemo.common.model.Type1Item;
import com.modulardemo.common.model.Type2Item;
import com.modulardemo.common.model.Type3Item;
import com.modulardemo.common.network.Network;
import com.modulardemo.resultsdk.ViewProvider;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ResultListFragment extends Fragment {
    private RecyclerView myRecycleView;
    private MyRecycleAdapter myRecycleAdapter;
    private List<ViewProvider> viewProviders;
    private Network networkUtil;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        myRecycleAdapter.setItems(generateItems());
    }

    public void init(List<ViewProvider> viewProviders, Network networkUtil) {
        this.viewProviders = viewProviders;
        this.networkUtil = networkUtil;
    }

    private void initView(View view) {
        myRecycleView = view.findViewById(R.id.my_recycle_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        myRecycleView.setLayoutManager(layoutManager);

        myRecycleAdapter = new MyRecycleAdapter();
        myRecycleAdapter.registerViewProvider(viewProviders);
        myRecycleView.setAdapter(myRecycleAdapter);
    }

    @NonNull
    private List<BaseItem> generateItems() {
        List<Object> items = JSON.parseArray(networkUtil.get("url"), new Type[]{Type1Item.class, Type2Item.class, Type3Item.class, Type2Item.class, Type1Item.class});
        List<BaseItem> baseItems = new ArrayList<>();
        for (Object item : items) {
            if (item instanceof Type1Item) {
                baseItems.add((Type1Item) item);
            } else if (item instanceof Type2Item) {
                baseItems.add((Type2Item) item);
            } else if (item instanceof Type3Item) {
                baseItems.add((Type3Item) item);
            }
        }
        return baseItems;
    }
}
