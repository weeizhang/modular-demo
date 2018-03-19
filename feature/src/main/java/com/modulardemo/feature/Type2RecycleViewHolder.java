package com.modulardemo.feature;


import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.modulardemo.common.model.BaseItem;
import com.modulardemo.common.model.Type2Item;
import com.modulardemo.commonui.title.TitleUnit;
import com.modulardemo.resultsdk.BaseRecycleViewHolder;

public class Type2RecycleViewHolder extends BaseRecycleViewHolder {
    private TextView textView;
    private FrameLayout titleContainer;
    private TitleUnit titleUnit = new TitleUnit();

    public Type2RecycleViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.my_text_view);
        titleContainer = itemView.findViewById(R.id.title_container);
    }

    @Override
    public void populate(BaseItem item) {
        textView.setText(item.getType());
        titleUnit.populate(titleContainer, ((Type2Item) item).getTitle());
        titleContainer.requestLayout();
    }
}
