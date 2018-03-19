package com.modulardemo.commonui;


import android.view.View;
import android.view.ViewGroup;

public abstract class UnitWithData<T> extends Unit {
    public void populate(ViewGroup container, T data) {
        populate(container);
        if (data == null) {
            container.setVisibility(View.GONE);
        } else {
            container.setVisibility(View.VISIBLE);
            bindView(container, data);
        }
    }

    public abstract void bindView(ViewGroup container, T data);
}
