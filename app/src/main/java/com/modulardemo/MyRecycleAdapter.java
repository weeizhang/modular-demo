package com.modulardemo;


import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.modulardemo.model.BaseItem;

import java.util.List;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleViewHolder> {

    private List<BaseItem> items;
    private List<ViewProvider> viewProviders;

    public MyRecycleAdapter(List<BaseItem> items, List<ViewProvider> viewProvider) {
        this.items = items;
        this.viewProviders = viewProvider;
    }

    @Override
    public MyRecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return viewProviders.get(viewType).providerView(parent);
    }

    @Override
    public void onBindViewHolder(MyRecycleViewHolder holder, int position) {
        holder.populate(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    @Override
    public int getItemViewType(int position) {
        for (int i = 0; i < viewProviders.size(); i++) {
            if (items.get(position).getType().equals(viewProviders.get(i).getType())) {
                return i;
            }
        }
        return -1;
    }
}
