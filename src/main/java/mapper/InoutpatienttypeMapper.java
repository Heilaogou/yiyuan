package mapper;

import com.itgaoshu.yiyuan.bean.Inoutpatienttype;
import com.itgaoshu.yiyuan.bean.InoutpatienttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InoutpatienttypeMapper {
    int countByExample(InoutpatienttypeExample example);

    int deleteByExample(InoutpatienttypeExample example);

    int deleteByPrimaryKey(Integer inoutpatientid);

    int insert(Inoutpatienttype record);

    int insertSelective(Inoutpatienttype record);

    List<Inoutpatienttype> selectByExample(InoutpatienttypeExample example);

    Inoutpatienttype selectByPrimaryKey(Integer inoutpatientid);

    int updateByExampleSelective(@Param("record") Inoutpatienttype record, @Param("example") InoutpatienttypeExample example);

    int updateByExample(@Param("record") Inoutpatienttype record, @Param("example") InoutpatienttypeExample example);

    int updateByPrimaryKeySelective(Inoutpatienttype record);

    int updateByPrimaryKey(Inoutpatienttype record);
}