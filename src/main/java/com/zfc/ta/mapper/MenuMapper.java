package com.zfc.ta.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zfc.ta.entity.Menu;
import com.zfc.ta.entity.ShowMenuVo;

import java.util.List;
import java.util.Map;

public interface MenuMapper extends BaseMapper<Menu> {

    List<ShowMenuVo> selectShowMenuByUser(Map<String,Object> map);

    List<Menu> getMenus(Map<String,Object> map);
}