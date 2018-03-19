package com.modulardemo.commonui.title;


import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.modulardemo.common.model.Title;
import com.modulardemo.commonui.R;
import com.modulardemo.commonui.UnitWithData;

public class TitleUnit extends UnitWithData<Title> {
    private TextView titleTxt;
    private TextView subtitleTxt;

    @Override
    public void initView(ViewGroup container) {
        LayoutInflater.from(container.getContext()).inflate(R.layout.title, container, true);
    }

    @Override
    public void bindView(ViewGroup container, Title data) {
        titleTxt = container.findViewById(R.id.title_txt);
        subtitleTxt = container.findViewById(R.id.subtitle_txt);

        titleTxt.setText(data.getTitle());
        subtitleTxt.setText(data.getSubTitle());
    }
}
