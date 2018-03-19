package com.modulardemo;


import com.alibaba.fastjson.JSON;
import com.modulardemo.common.model.BaseItem;
import com.modulardemo.common.model.Title;
import com.modulardemo.common.model.Type1Item;
import com.modulardemo.common.model.Type2Item;
import com.modulardemo.common.model.Type3Item;
import com.modulardemo.common.network.Network;

import java.util.Arrays;
import java.util.List;

public class NetworkUtil implements Network {
    @Override
    public String get(String url) {
        List<BaseItem> baseItems = Arrays.asList(
                new Type1Item("Type 1"),
                new Type2Item("Type 2", new Title("Title 1", "SubTitle 1")),
                new Type3Item("Type 3"),
                new Type2Item("Type 2", new Title("Title 2", "SubTitle 2")),
                new Type1Item("Type 1"));
        return JSON.toJSONString(baseItems);
    }
}
