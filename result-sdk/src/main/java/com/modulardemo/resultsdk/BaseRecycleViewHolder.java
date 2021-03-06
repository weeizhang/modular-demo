package com.modulardemo.resultsdk;


import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.modulardemo.common.model.BaseItem;


public abstract class BaseRecycleViewHolder extends RecyclerView.ViewHolder {

    public BaseRecycleViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void populate(BaseItem item);
}
