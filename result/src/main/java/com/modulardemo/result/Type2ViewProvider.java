package com.modulardemo.result;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Type2ViewProvider extends ViewProvider {
    public Type2ViewProvider(String type) {
        super(type);
    }

    @Override
    public MyRecycleViewHolder providerView(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item2, parent, false);
        return new MyRecycleViewHolder(view);
    }
}
