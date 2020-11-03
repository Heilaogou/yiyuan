package mapper;

import com.itgaoshu.yiyuan.bean.Caigou;
import com.itgaoshu.yiyuan.bean.CaigouExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaigouMapper {
    int countByExample(CaigouExample example);

    int deleteByExample(CaigouExample example);

    int deleteByPrimaryKey(Integer caigouid);

    int insert(Caigou record);

    int insertSelective(Caigou record);

    List<Caigou> selectByExample(CaigouExample example);

    Caigou selectByPrimaryKey(Integer caigouid);

    int updateByExampleSelective(@Param("record") Caigou record, @Param("example") CaigouExample example);

    int updateByExample(@Param("record") Caigou record, @Param("example") CaigouExample example);

    int updateByPrimaryKeySelective(Caigou record);

    int updateByPrimaryKey(Caigou record);
}