package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Cashier;
import com.itgaoshu.yiyuan.bean.Pharmacy;
import com.itgaoshu.yiyuan.bean.Report;
import com.itgaoshu.yiyuan.mapper.PharmacyMapper;
import com.itgaoshu.yiyuan.mapper.ReportMapper;
import com.itgaoshu.yiyuan.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//药房管理
@Service
@Transactional
public class PharmacyServiceImpl implements PharmacyService {
    @Autowired
    private PharmacyMapper pharmacyMapper;
    @Autowired
    private ReportMapper reportMapper;
    @Override
    public List<Report> tselpreson() {
        return pharmacyMapper.tselpreson();
    }

    @Override
    public Integer chuku(Integer reportId) {
        //处方划价时就更新了药房，直接出库即可
        /*//先到处方表中根据挂号id查询药品名称、数量
        List<Cashier> list = reportMapper.selpepi(reportId);
        Integer res = 0;
        for (Cashier c:list) {
            //再到药房中更新对应的药品
            Integer num = c.getDurgnum();
            String name = c.getDurgname();
            res+=pharmacyMapper.chuku(num,name);
        }*/
        //出库成功后更改挂号状态为3
        return pharmacyMapper.updReport(reportId);
    }

    @Override
    public List<Pharmacy> selectpharmacy() {
        return pharmacyMapper.selectpharmacy();
    }
}
