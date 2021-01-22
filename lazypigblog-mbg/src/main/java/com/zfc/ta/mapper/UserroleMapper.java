package com.zfc.ta.mapper;

import com.zfc.ta.model.Userrole;
import com.zfc.ta.model.UserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleMapper {
    long countByExample(UserroleExample example);

    int deleteByExample(UserroleExample example);

    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Long roleId);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    List<Userrole> selectByExample(UserroleExample example);

    int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);
}