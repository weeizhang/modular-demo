package com.modulardemo;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.modulardemo.model.BaseItem;

public class MyRecycleViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public MyRecycleViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.my_text_view);
    }

    public void populate(BaseItem item) {
        textView.setText(item.getType());
    }
}
