package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Ban;
import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.Paiban;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PaibanService {
    //查询所有排班
    List<Paiban> selectAllPaiban(Paiban paiban);
    //查询班位
    List<Ban> selectAllBan();
    //显示班位
    DataGridView selectAllBans(Integer doctorid);
    //查询该医生是否安排了班位
    int selectBanByDid(Integer doctorid);
    //若该医生未安排班位，修改前先添加
    int insertPaiBan(Paiban paiban);
    //修改排班
    int updatePaiban(Paiban paiban);
}
