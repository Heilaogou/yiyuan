package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Lrecord;
import com.itgaoshu.yiyuan.bean.Pay;
import com.itgaoshu.yiyuan.bean.Register;
import com.itgaoshu.yiyuan.mapper.PayMapper;
import com.itgaoshu.yiyuan.service.PayService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PayServiceImpl implements PayService {

    @Resource
    private PayMapper payMapper;


    @Override
    public int updPay(Register register) {
        return payMapper.updPay(register);
    }

    @Override
    public int addPay(Register register) {
        return payMapper.addPay(register);
    }

    @Override
    public List<Pay> selPays(Register register) {
        return payMapper.selPays(register);
    }

    @Override
    public List<Lrecord> selSurplus(Lrecord lrecord) {
        return payMapper.selSurplus(lrecord);
    }
}
