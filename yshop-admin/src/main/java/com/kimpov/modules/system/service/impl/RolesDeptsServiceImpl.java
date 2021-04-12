/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co
 * 注意：
 * 本软件为www.yixiang.co开发研制
 */
package com.kimpov.modules.system.service.impl;

import com.kimpov.common.service.impl.BaseServiceImpl;
import com.kimpov.modules.system.domain.RolesDepts;
import com.kimpov.modules.system.service.RolesDeptsService;
import com.kimpov.modules.system.service.mapper.RolesDeptsMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author hupeng
 * @date 2020-05-16
 */
@Service
@AllArgsConstructor
//@CacheConfig(cacheNames = "rolesDepts")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class RolesDeptsServiceImpl extends BaseServiceImpl<RolesDeptsMapper, RolesDepts> implements RolesDeptsService {

}
