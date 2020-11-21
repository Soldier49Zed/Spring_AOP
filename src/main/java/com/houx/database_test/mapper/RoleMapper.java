package com.houx.database_test.mapper;

import com.houx.database_test.pojo.Role;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: HouX
 * @Date: 2020/11/21
 * @Description:
 */
public interface RoleMapper {
    int insertRole(Long id);
    Role getRole(@Param("id") Long id);
    int updateRole(Long id);
    int deleteRole(@Param("id") Long id);
}
