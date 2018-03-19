package com.modulardemo.commonui;


import android.view.ViewGroup;

public abstract class Unit {
    public void populate(ViewGroup container) {
        if (!(container.getChildCount() > 0)) {
            initView(container);
        }
    }

    public abstract void initView(ViewGroup container);
}
