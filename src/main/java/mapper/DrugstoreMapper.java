package mapper;

import com.itgaoshu.yiyuan.bean.Drugstore;
import com.itgaoshu.yiyuan.bean.DrugstoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugstoreMapper {
    int countByExample(DrugstoreExample example);

    int deleteByExample(DrugstoreExample example);

    int deleteByPrimaryKey(Integer rugstoreid);

    int insert(Drugstore record);

    int insertSelective(Drugstore record);

    List<Drugstore> selectByExample(DrugstoreExample example);

    Drugstore selectByPrimaryKey(Integer rugstoreid);

    int updateByExampleSelective(@Param("record") Drugstore record, @Param("example") DrugstoreExample example);

    int updateByExample(@Param("record") Drugstore record, @Param("example") DrugstoreExample example);

    int updateByPrimaryKeySelective(Drugstore record);

    int updateByPrimaryKey(Drugstore record);
}