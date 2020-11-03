package mapper;

import com.itgaoshu.yiyuan.bean.Warehuose;
import com.itgaoshu.yiyuan.bean.WarehuoseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehuoseMapper {
    int countByExample(WarehuoseExample example);

    int deleteByExample(WarehuoseExample example);

    int deleteByPrimaryKey(Integer warehouseid);

    int insert(Warehuose record);

    int insertSelective(Warehuose record);

    List<Warehuose> selectByExample(WarehuoseExample example);

    Warehuose selectByPrimaryKey(Integer warehouseid);

    int updateByExampleSelective(@Param("record") Warehuose record, @Param("example") WarehuoseExample example);

    int updateByExample(@Param("record") Warehuose record, @Param("example") WarehuoseExample example);

    int updateByPrimaryKeySelective(Warehuose record);

    int updateByPrimaryKey(Warehuose record);
}