package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.ZbTdyuanUserDebt;
import po.ZbTdyuanUserDebtExample;

public interface ZbTdyuanUserDebtMapper {
    long countByExample(ZbTdyuanUserDebtExample example);

    int deleteByExample(ZbTdyuanUserDebtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZbTdyuanUserDebt record);

    int insertSelective(ZbTdyuanUserDebt record);

    List<ZbTdyuanUserDebt> selectByExample(ZbTdyuanUserDebtExample example);

    ZbTdyuanUserDebt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZbTdyuanUserDebt record, @Param("example") ZbTdyuanUserDebtExample example);

    int updateByExample(@Param("record") ZbTdyuanUserDebt record, @Param("example") ZbTdyuanUserDebtExample example);

    int updateByPrimaryKeySelective(ZbTdyuanUserDebt record);

    int updateByPrimaryKey(ZbTdyuanUserDebt record);
}