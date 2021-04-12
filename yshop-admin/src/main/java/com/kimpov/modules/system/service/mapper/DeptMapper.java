/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co
 * 注意：
 * 本软件为www.yixiang.co开发研制
 */
package com.kimpov.modules.system.service.mapper;

import com.kimpov.common.mapper.CoreMapper;
import com.kimpov.modules.system.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author hupeng
 * @date 2020-05-14
 */
@Repository
@Mapper
public interface DeptMapper extends CoreMapper<Dept> {

    @Select("select m.* from dept m LEFT JOIN roles_depts t on m.id= t.dept_id LEFT JOIN role r on r.id = t.role_id where r.id = ${roleId}")
    Set<Dept> findDeptByRoleId(@Param("roleId") Long roleId);

    @Select("select * from dept m LEFT JOIN roles_depts t on m.id= t.dept_id LEFT JOIN role r on r.id = t.role_id where r.id = #{roleId}")
    Set<Dept> findDeptByRoleIds(@Param("roleIds") Set<Long> roleId);
}
