package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Area;

import java.util.List;

public interface AreaService {
    List<Area> findAllArea(Area a);
    int addArea(Area a);
    int count(Area a);
}
