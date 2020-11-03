package mapper;

import com.itgaoshu.yiyuan.bean.Moneytype;
import com.itgaoshu.yiyuan.bean.MoneytypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneytypeMapper {
    int countByExample(MoneytypeExample example);

    int deleteByExample(MoneytypeExample example);

    int deleteByPrimaryKey(Integer moneyid);

    int insert(Moneytype record);

    int insertSelective(Moneytype record);

    List<Moneytype> selectByExample(MoneytypeExample example);

    Moneytype selectByPrimaryKey(Integer moneyid);

    int updateByExampleSelective(@Param("record") Moneytype record, @Param("example") MoneytypeExample example);

    int updateByExample(@Param("record") Moneytype record, @Param("example") MoneytypeExample example);

    int updateByPrimaryKeySelective(Moneytype record);

    int updateByPrimaryKey(Moneytype record);
}