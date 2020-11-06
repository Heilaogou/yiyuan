package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ItemMapper {
    List<Item> selItems(Item item);
}
