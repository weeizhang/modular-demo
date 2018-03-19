package com.modulardemo.feature;


import android.view.View;
import android.widget.TextView;

import com.modulardemo.resultsdk.BaseItem;
import com.modulardemo.resultsdk.BaseRecycleViewHolder;

public class Type2RecycleViewHolder extends BaseRecycleViewHolder {
    private TextView textView;

    public Type2RecycleViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.my_text_view);
    }

    @Override
    public void populate(BaseItem item) {
        textView.setText(item.getType());
    }
}
