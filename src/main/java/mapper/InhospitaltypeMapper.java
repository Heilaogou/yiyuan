package mapper;

import com.itgaoshu.yiyuan.bean.Inhospitaltype;
import com.itgaoshu.yiyuan.bean.InhospitaltypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InhospitaltypeMapper {
    int countByExample(InhospitaltypeExample example);

    int deleteByExample(InhospitaltypeExample example);

    int deleteByPrimaryKey(Integer inhospitalid);

    int insert(Inhospitaltype record);

    int insertSelective(Inhospitaltype record);

    List<Inhospitaltype> selectByExample(InhospitaltypeExample example);

    Inhospitaltype selectByPrimaryKey(Integer inhospitalid);

    int updateByExampleSelective(@Param("record") Inhospitaltype record, @Param("example") InhospitaltypeExample example);

    int updateByExample(@Param("record") Inhospitaltype record, @Param("example") InhospitaltypeExample example);

    int updateByPrimaryKeySelective(Inhospitaltype record);

    int updateByPrimaryKey(Inhospitaltype record);
}