package com.houx.database_test.mapper;

import com.houx.database_test.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: HouX
 * @Date: 2020/11/21
 * @Description:
 */

@Repository
public interface RoleMapper {
    public int insertRole(Role role);
    public Role getRole(@Param("id") Long id);
    public int updateRole(Role role);
    public int deleteRole(@Param("id") Long id);
}
