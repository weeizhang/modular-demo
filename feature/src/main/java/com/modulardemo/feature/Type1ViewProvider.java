package com.modulardemo.feature;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.modulardemo.resultsdk.ViewProvider;

public class Type1ViewProvider extends ViewProvider {
    public Type1ViewProvider(String type) {
        super(type);
    }

    @Override
    public Type1RecycleViewHolder providerView(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item1, parent, false);
        return new Type1RecycleViewHolder(view);
    }
}
