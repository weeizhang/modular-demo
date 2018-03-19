package com.modulardemo.common.model;


public class Type2Item extends BaseItem {
    private Title title;

    public Type2Item(String type, Title title) {
        super(type);
        this.title = title;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
