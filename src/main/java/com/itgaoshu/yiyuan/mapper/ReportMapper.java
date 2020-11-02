package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Report;
import com.itgaoshu.yiyuan.bean.ReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportMapper {
    int countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    int deleteByPrimaryKey(Integer reportid);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    Report selectByPrimaryKey(Integer reportid);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}