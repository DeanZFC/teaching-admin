package com.zfc.ta.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zfc.ta.entity.Role;
import com.zfc.ta.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.Set;


public interface UserMapper extends BaseMapper<User> {

    User selectUserByMap(Map<String,Object> map);

    void saveUserRoles(@Param("userId")String id, @Param("roleIds")Set<Role> roles);

    void dropUserRolesByUserId(@Param("userId")String id);
}