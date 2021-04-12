/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co
 * 注意：
 * 本软件为www.yixiang.co开发研制
 */
package com.kimpov.modules.system.service.mapper;

import com.kimpov.common.mapper.CoreMapper;
import com.kimpov.modules.system.domain.RolesDepts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author hupeng
 * @date 2020-05-16
 */
@Repository
@Mapper
public interface RolesDeptsMapper extends CoreMapper<RolesDepts> {

}
