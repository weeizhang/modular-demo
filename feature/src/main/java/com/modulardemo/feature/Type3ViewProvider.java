package com.modulardemo.feature;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.modulardemo.resultsdk.ViewProvider;

public class Type3ViewProvider extends ViewProvider {
    public Type3ViewProvider(String type) {
        super(type);
    }

    @Override
    public Type3RecycleViewHolder providerView(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item3, parent, false);
        return new Type3RecycleViewHolder(view);
    }
}
