package com.zfc.ta.mapper;

import com.zfc.ta.model.Rolemenu;
import com.zfc.ta.model.RolemenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolemenuMapper {
    long countByExample(RolemenuExample example);

    int deleteByExample(RolemenuExample example);

    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

    int insert(Rolemenu record);

    int insertSelective(Rolemenu record);

    List<Rolemenu> selectByExample(RolemenuExample example);

    int updateByExampleSelective(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByExample(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);
}