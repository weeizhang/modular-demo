package com.modulardemo;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Type1ViewProvider extends ViewProvider{
    public Type1ViewProvider(String type) {
        super(type);
    }

    @Override
    public MyRecycleViewHolder providerView(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item1, parent, false);
        return new MyRecycleViewHolder(view);
    }
}
