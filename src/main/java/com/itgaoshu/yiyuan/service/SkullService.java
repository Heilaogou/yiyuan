package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Skull;

import java.util.List;

public interface SkullService {
    //查询所有经办人信息
    List<Skull> findAllSkull(Skull skull);
    //添加经办人
    int addSkull(Skull skull);
    //修改经办人
    int editSkull(Skull skull);
    //删除经办人
    int deleteSkull(Integer skullid);
}
