package com.modulardemo.result;


import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.modulardemo.resultsdk.BaseItem;
import com.modulardemo.resultsdk.BaseRecycleViewHolder;
import com.modulardemo.resultsdk.ViewProvider;

import java.util.List;

public class MyRecycleAdapter extends RecyclerView.Adapter<BaseRecycleViewHolder> {

    private List<BaseItem> items;
    private List<ViewProvider> viewProviders;

    public void registerViewProvider(List<ViewProvider> viewProviders) {
        this.viewProviders = viewProviders;
    }

    public void setItems(List<BaseItem> items) {
        this.items = items;
    }

    @Override
    public BaseRecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return viewProviders.get(viewType).providerView(parent);
    }

    @Override
    public void onBindViewHolder(BaseRecycleViewHolder holder, int position) {
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
