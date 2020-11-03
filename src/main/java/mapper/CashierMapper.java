package mapper;

import com.itgaoshu.yiyuan.bean.Cashier;
import com.itgaoshu.yiyuan.bean.CashierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashierMapper {
    int countByExample(CashierExample example);

    int deleteByExample(CashierExample example);

    int deleteByPrimaryKey(Integer cashier);

    int insert(Cashier record);

    int insertSelective(Cashier record);

    List<Cashier> selectByExample(CashierExample example);

    Cashier selectByPrimaryKey(Integer cashier);

    int updateByExampleSelective(@Param("record") Cashier record, @Param("example") CashierExample example);

    int updateByExample(@Param("record") Cashier record, @Param("example") CashierExample example);

    int updateByPrimaryKeySelective(Cashier record);

    int updateByPrimaryKey(Cashier record);
}