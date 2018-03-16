package com.modulardemo;


import android.view.ViewGroup;

public abstract class ViewProvider {
    private String type;

    public ViewProvider(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract MyRecycleViewHolder providerView(ViewGroup parent);
}
