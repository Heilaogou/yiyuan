package mapper;

import com.itgaoshu.yiyuan.bean.Ban;
import com.itgaoshu.yiyuan.bean.BanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanMapper {
    int countByExample(BanExample example);

    int deleteByExample(BanExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Ban record);

    int insertSelective(Ban record);

    List<Ban> selectByExample(BanExample example);

    Ban selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Ban record, @Param("example") BanExample example);

    int updateByExample(@Param("record") Ban record, @Param("example") BanExample example);

    int updateByPrimaryKeySelective(Ban record);

    int updateByPrimaryKey(Ban record);
}