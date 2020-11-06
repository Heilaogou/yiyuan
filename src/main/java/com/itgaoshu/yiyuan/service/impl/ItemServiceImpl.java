package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Item;
import com.itgaoshu.yiyuan.mapper.ItemMapper;
import com.itgaoshu.yiyuan.service.ItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Resource
    private ItemMapper itemMapper;

    @Override
    public List<Item> selItems(Item item) {
        return itemMapper.selItems(item);
    }
}
