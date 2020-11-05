package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Lrecord;
import com.itgaoshu.yiyuan.bean.Pay;
import com.itgaoshu.yiyuan.bean.Register;

import java.util.List;

public interface PayService {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
